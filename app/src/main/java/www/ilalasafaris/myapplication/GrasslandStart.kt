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
import www.ilalasafaris.myapplication.databinding.ActivityGrasslandStartBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class GrasslandStart : AppCompatActivity() {
    private var binding: ActivityGrasslandStartBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGrasslandStartBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initActionBar()
        initBirdDao()
        initListOfBirds()
        setupOnBackPressedCallback()
    }
    private fun initBirdDao() {
        val birdDao = (application as BirdApp).db.daoBirds()
        lifecycleScope.launch {
            birdDao.fetchAll_Grassland().collect {
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
            setOf(30 ,31 ,51 ,57 ,60 ,61 ,67 ,81 ,83 ,90 ,96 ,101 ,102 ,130 ,193 ,206 ,207 ,222 ,223 ,224 ,240 ,256 ,286 ,313 ,321 ,328 ,334 ,335 ,342 ,347),
            // List 2
            setOf(353 ,359 ,382 ,385 ,429 ,432 ,433 ,435 ,437 ,448 ,451 ,462 ,476 ,495 ,503 ,514 ,527,534 ,543 ,558 ,575 ,576 ,582 ,615 ,622 ,643 ,644 ,656 ,699 ,710 ,718 ,720 ),
            // List All
            setOf(30 ,31 ,51 ,57 ,60 ,61 ,67 ,81 ,83 ,90 ,96 ,101 ,102 ,130 ,193 ,206 ,207 ,222 ,223 ,224 ,240 ,256 ,286 ,313 ,321 ,328 ,334 ,335 ,342 ,347 ,
                353 ,359 ,382 ,385 ,429 ,432 ,433 ,435 ,437 ,448 ,451 ,462 ,476 ,495 ,503 ,514 ,527,534 ,543 ,558 ,575 ,576 ,582 ,615 ,622 ,643 ,644 ,656 ,699 ,710 ,718 ,720 )
        )
        val buttons = listOf(binding!!.btn1, binding!!.btn2,binding!!.btnAll)
        for ((birdSet, button) in birdSets.zip(buttons)) {
            val birdNames: MutableList<String> = ArrayList()
            for (item in lines.slice(birdSet)) {
                val token = item.idbird
                birdNames.add(token)
            }
            setButtonListeners(button, birdNames)
        }

        binding?.btnSearch?.setOnClickListener {
            val intent = Intent(this, GrasslandCreate::class.java)
            startActivity(intent)
        }
    }
    private fun setButtonListeners(button: Button, birdNames: List<String>) {
        button.setOnClickListener {
            val intent = when (button) {
                binding?.btn1 -> Intent(this, GrasslandList1::class.java)
                binding?.btn2 -> Intent(this, GrasslandList2::class.java)
                binding?.btnAll -> Intent(this, GrasslandAll::class.java)
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
                val intent = Intent(this, GrasslandListSaved::class.java)
                startActivity(intent)
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("No Birds Saved")
                builder.setMessage("Would you like to create a list ?")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                builder.setPositiveButton("Yes") { _, _ ->
                    val intent = Intent(this, GrasslandCreate::class.java)
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
        actionbar!!.title = "Grassland"
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
        onBackPressedDispatcher.addCallback(this@GrasslandStart, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@GrasslandStart, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        })
    }
    @Entity(tableName ="Grassland")
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