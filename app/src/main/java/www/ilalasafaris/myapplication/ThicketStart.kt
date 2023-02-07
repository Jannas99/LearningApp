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
import www.ilalasafaris.myapplication.databinding.ActivityThicketStartBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class ThicketStart : AppCompatActivity() {
    private var binding: ActivityThicketStartBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThicketStartBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initActionBar()
        initBirdDao()
        initListOfBirds()
        setupOnBackPressedCallback()

    }
    private fun initBirdDao() {
        val birdDao = (application as BirdApp).db.daoBirds()
        lifecycleScope.launch {
            birdDao.fetchAll_Thicket().collect {
                val list = ArrayList(it)
                yourOwnList(list)
            }
        }
    }
    private fun initListOfBirds() {
        val lines = DataStored.allSpecies()
        val birdSets = listOf(
            // List 1
            setOf(7 ,9 ,13 ,19 ,30 ,34 ,39 ,42 ,46 ,50 ,54 ,55 ,66 ,67 ,70 ,72 ,74 ,75 ,76 ,84 ,94 ,95 ,111 ,118 ,121 ,122 ,128 ,129 ,138 ,139 ,),
            // List 2
            setOf(144 ,147 ,151 ,157 ,161 ,166 ,169 ,170 ,176 ,190 ,197 ,198 ,204 ,206 ,208 ,211 ,213 ,217 ,218 ,224 ,231 ,235 ,239 ,241 ,244 ,256 ,259 ,264 ,265 ,270 ,),
            // List 3
            setOf(271 ,275 ,278 ,282 ,287 ,299 ,303 ,312 ,318 ,321 ,329 ,330 ,356 ,371 ,380 ,384 ,385 ,387 ,392 ,425 ,436 ,440 ,452 ,455 ,461 ,463 ,465 ,467 ,468 ,469 ,),
            // List 4
            setOf(471 ,493 ,495 ,498 ,503 ,505 ,517 ,518 ,524 ,525 ,527 ,531 ,534 ,536 ,539 ,543 ,557 ,558 ,560 ,562 ,563 ,564 ,567 ,572 ,578 ,593 ,595 ,597 ,611 ,614 ,),
            // List 5
            setOf(615 ,620 ,622 ,625 ,629 ,630 ,632 ,633 ,637 ,647 ,652 ,653 ,656 ,665 ,666 ,675 ,682 ,684 ,685 ,686 ,694 ,695 ,696 ,709 ,711 ,718 ,719 ,720 ,721 ,722 ),
            // List All
            setOf(7 ,9 ,13 ,19 ,30 ,34 ,39 ,42 ,46 ,50 ,54 ,55 ,66 ,67 ,70 ,72 ,74 ,75 ,76 ,84 ,94 ,95 ,111 ,118 ,121 ,122 ,128 ,129 ,138 ,139 ,
                144 ,147 ,151 ,157 ,161 ,166 ,169 ,170 ,176 ,190 ,197 ,198 ,204 ,206 ,208 ,211 ,213 ,217 ,218 ,224 ,231 ,235 ,239 ,241 ,244 ,256 ,259 ,264 ,265 ,270 ,
                271 ,275 ,278 ,282 ,287 ,299 ,303 ,312 ,318 ,321 ,329 ,330 ,356 ,371 ,380 ,384 ,385 ,387 ,392 ,425 ,436 ,440 ,452 ,455 ,461 ,463 ,465 ,467 ,468 ,469 ,
                471 ,493 ,495 ,498 ,503 ,505 ,517 ,518 ,524 ,525 ,527 ,531 ,534 ,536 ,539 ,543 ,557 ,558 ,560 ,562 ,563 ,564 ,567 ,572 ,578 ,593 ,595 ,597 ,611 ,614 ,
                615 ,620 ,622 ,625 ,629 ,630 ,632 ,633 ,637 ,647 ,652 ,653 ,656 ,665 ,666 ,675 ,682 ,684 ,685 ,686 ,694 ,695 ,696 ,709 ,711 ,718 ,719 ,720 ,721 ,722 )
        )
        val buttons = listOf(binding!!.btn1, binding!!.btn2, binding!!.btn3, binding!!.btn4, binding!!.btn5,binding!!.btnAll)
        for ((birdSet, button) in birdSets.zip(buttons)) {
            val birdNames: MutableList<String> = ArrayList()
            for (item in lines.slice(birdSet)) {
                val token = item.idbird
                birdNames.add(token)
            }
            setButtonListeners(button, birdNames)
        }

        binding?.btnSearch?.setOnClickListener {
            val intent = Intent(this, ThicketCreate::class.java)
            startActivity(intent)
        }
    }
    private fun setButtonListeners(button: Button, birdNames: List<String>) {
        button.setOnClickListener {
            val intent = when (button) {
                binding?.btn1 -> Intent(this, ThicketList1::class.java)
                binding?.btn2 -> Intent(this, ThicketList2::class.java)
                binding?.btn3 -> Intent(this, ThicketList3::class.java)
                binding?.btn4 -> Intent(this, ThicketList4::class.java)
                binding?.btn5 -> Intent(this, ThicketList5::class.java)
                binding?.btnAll -> Intent(this, ThicketAll::class.java)
                else -> throw IllegalArgumentException("Unknown button")
            }
            startActivity(intent)
        }
        button.setOnLongClickListener {
            val updateDialog = Dialog(this, R.style.Theme_Dialog)
            updateDialog.setCancelable(false)
            val binding = SpecieslListBinding.inflate(layoutInflater)
            updateDialog.setContentView(binding.root)
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
                val intent = Intent(this, ThicketListSaved::class.java)
                startActivity(intent)
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("No Birds Saved")
                builder.setMessage("Would you like to create a list ?")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                builder.setPositiveButton("Yes") { _, _ ->
                    val intent = Intent(this, ThicketCreate::class.java)
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
        actionbar!!.title = "Thicket"
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
        onBackPressedDispatcher.addCallback(this@ThicketStart, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@ThicketStart, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        })
    }
    @Entity(tableName ="Thicket")
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