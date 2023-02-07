package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.coroutines.launch
import www.ilalasafaris.myapplication.databinding.ActivityKarooStartBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class KarooStart : AppCompatActivity() {
        private var binding: ActivityKarooStartBinding? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityKarooStartBinding.inflate(layoutInflater)
            setContentView(binding?.root)

            initActionBar()
            initBirdDao()
            initListOfBirds()
            setupOnBackPressedCallback()

        }
        private fun initBirdDao() {
            val birdDao = (application as BirdApp).db.daoBirds()
            lifecycleScope.launch {
                birdDao.fetchAll_Karoo().collect {
                    val list = ArrayList(it)
                    yourOwnList(list)
                }
            }
        }
        private fun initListOfBirds() {
            //Todo 5
            val lines = DataStored.allSpecies()
            val birdSets = listOf(
                // List 1
                setOf(13 ,21 ,24 ,27 ,46 ,49 ,58 ,59 ,72 ,73 ,78 ,81 ,84 ,86 ,88 ,89 ,93 ,113 ,114 ,124 ,148 ,150 ,165 ,166 ,182 ,183 ,185 ,186 ,189 ,196),
                // List 2
                setOf(200 ,201 ,212 ,218 ,219 ,222 ,238 ,260 ,296 ,297 ,298 ,309 ,310 ,313 ,314 ,326 ,327 ,334 ,338 ,339 ,340 ,341 ,345 ,350 ,367 ,374 ,381 ,389 ,391 ,429),
                // List 3
                setOf(432 ,452 ,456 ,457 ,467 ,485 ,486 ,519 ,523 ,542 ,543 ,546 ,550 ,554 ,561 ,564 ,574 ,576 ,588 ,591 ,592 ,613 ,629 ,630 ,646 ,648 ,649 ,659 ,664 ,668 ,671 ,698 ,700 ,702 ,704 ,708 ,716 ,718,
                    709 ,711 ,712 ,713 ,716 ,717 ,721),
                // List All
                setOf(13 ,21 ,24 ,27 ,46 ,49 ,58 ,59 ,72 ,73 ,78 ,81 ,84 ,86 ,88 ,89 ,93 ,113 ,114 ,124 ,148 ,150 ,165 ,166 ,182 ,183 ,185 ,186 ,189 ,196 ,
                    200 ,201 ,212 ,218 ,219 ,222 ,238 ,260 ,296 ,297 ,298 ,309 ,310 ,313 ,314 ,326 ,327 ,334 ,338 ,339 ,340 ,341 ,345 ,350 ,367 ,374 ,381 ,389 ,391 ,429,
                    432 ,452 ,456 ,457 ,467 ,485 ,486 ,519 ,523 ,542 ,543 ,546 ,550 ,554 ,561 ,564 ,574 ,576 ,588 ,591 ,592 ,613 ,629 ,630 ,646 ,648 ,649 ,659 ,664 ,668 ,671 ,698 ,700 ,702 ,704 ,708 ,716 ,718,
                    709 ,711 ,712 ,713 ,716 ,717 ,721)
            )
            val buttons = listOf(binding!!.btn1, binding!!.btn2,binding!!.btn3,binding!!.btnAll)
            for ((birdSet, button) in birdSets.zip(buttons)) {
                val birdNames: MutableList<String> = ArrayList()
                for (item in lines.slice(birdSet)) {
                    val token = item.idbird
                    birdNames.add(token)
                }
                setButtonListeners(button, birdNames)
            }

            binding?.btnSearch?.setOnClickListener {
                val intent = Intent(this, KarooCreate::class.java)
                startActivity(intent)
            }
        }
        private fun setButtonListeners(button: Button, birdNames: List<String>) {
            button.setOnClickListener {
                val intent = when (button) {
                    binding?.btn1 -> Intent(this, KarooList1::class.java)
                    binding?.btn2 -> Intent(this, KarooList2::class.java)
                    binding?.btn3 -> Intent(this, KarooList3::class.java)
                    binding?.btnAll -> Intent(this, KarooAll::class.java)
                    else -> throw IllegalArgumentException("Unknown button")
                }
                startActivity(intent)
            }
            button.setOnLongClickListener {
                val updateDialog = Dialog(this, R.style.Theme_Dialog)
                updateDialog.setCancelable(false)
                val binding = SpecieslListBinding.inflate(layoutInflater)
                updateDialog.setContentView(binding.root)
                //Todo Future: Consider using a recycler view instead of listview for displaying the bird lists.
                val mAdapter = ArrayAdapter(this, R.layout.listview_text_properties, R.id.textView, birdNames.sorted())
                binding.listview.adapter = mAdapter
                mAdapter.notifyDataSetChanged()

                binding.closedialog.setOnClickListener{
                    updateDialog.dismiss()
                }
                updateDialog.show()
                updateDialog.setCanceledOnTouchOutside(true)
                true
            }
        }
        private fun yourOwnList(birdList: ArrayList<Data>) {
            binding?.btnSave?.setOnClickListener {
                if (birdList.isNotEmpty()) {
                    val intent = Intent(this, KarooListSaved::class.java)
                    startActivity(intent)
                } else {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("No Birds Saved")
                    builder.setMessage("Would you like to create a list ?")
                    builder.setIcon(android.R.drawable.ic_dialog_alert)

                    builder.setPositiveButton("Yes") { _, _ ->
                        val intent = Intent(this, KarooCreate::class.java)
                        startActivity(intent)
                    }
                    builder.setNegativeButton("No") { dialogInterface, _ ->
                        dialogInterface.dismiss()
                    }
                    val alertDialog: AlertDialog = builder.create()
                    alertDialog.setCancelable(false)
                    alertDialog.show()
                }
            }
        }
        private fun initActionBar() {
            val actionbar = supportActionBar
            actionbar!!.title = "Karoo"
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setHomeButtonEnabled(true)
        }
        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                android.R.id.home -> {
                    onBackPressedDispatcher.onBackPressed()
                    return true
                }
            }
            return super.onOptionsItemSelected(item)
        }
        private fun setupOnBackPressedCallback() {
            onBackPressedDispatcher.addCallback(this@KarooStart, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    val intent = Intent(this@KarooStart, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            })
        }
        @Entity(tableName ="Karoo")
        data class Data (
            @PrimaryKey(autoGenerate = true)
            val id:Int = 0,
            val idbird:String = "",
            val name: String ="",
            val sname: String ="",
            val picture1: Int = 0,
            val picture2: Int = 0,
            val picture3: Int = 0,
            val picture4: Int = 0,
            val picture5: Int = 0,
            val sound: Int = 0
        )
    }