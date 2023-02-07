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
import www.ilalasafaris.myapplication.databinding.ActivityForestStartBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class ForestStart : AppCompatActivity() {
    private var binding: ActivityForestStartBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForestStartBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initActionBar()
        initBirdDao()
        initListOfBirds()
        setupOnBackPressedCallback()

    }
    private fun initBirdDao() {
        val birdDao = (application as BirdApp).db.daoBirds()
        lifecycleScope.launch {
            birdDao.fetchAll_Forest().collect {
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
            setOf(8 ,16 ,17 ,19 ,22 ,34 ,41 ,51 ,52 ,54 ,66 ,70 ,76 ,128 ,139 ,147 ,151 ,152 ,161 ,171 ,204 ,208 ,211 ,245 ,246 ,248 ,259 ,261 ,275 ,278),
            // List 2
            setOf(282 ,305 ,355 ,357 ,358 ,369 ,384 ,387 ,399 ,426 ,464 ,465 ,469 ,471 ,472 ,477 ,495 ,524 ,527 ,536 ,562 ,563 ,566 ,567 ,569 ,570 ,572 ,620 ,621 ,624 ,),
            // List 3
            setOf(627 ,633 ,637 ,638 ,641 ,642 ,647 ,652 ,657 ,663 ,675 ,676 ,680 ,682 ,685 ,703 ,719 ,720 ),
            // List All
            setOf(8 ,16 ,17 ,19 ,22 ,34 ,41 ,51 ,52 ,54 ,66 ,70 ,76 ,128 ,139 ,147 ,151 ,152 ,161 ,171 ,204 ,208 ,211 ,245 ,246 ,248 ,259 ,261 ,275 ,278 ,
                282 ,305 ,355 ,357 ,358 ,369 ,384 ,387 ,399 ,426 ,464 ,465 ,469 ,471 ,472 ,477 ,495 ,524 ,527 ,536 ,562 ,563 ,566 ,567 ,569 ,570 ,572 ,620 ,621 ,624 ,
                627 ,633 ,637 ,638 ,641 ,642 ,647 ,652 ,657 ,663 ,675 ,676 ,680 ,682 ,685 ,703 ,719 ,720 )
        )
        val buttons = listOf(binding!!.btn1, binding!!.btn2, binding!!.btn3,binding!!.btnAll)
        for ((birdSet, button) in birdSets.zip(buttons)) {
            val birdNames: MutableList<String> = ArrayList()
            for (item in lines.slice(birdSet)) {
                val token = item.idbird
                birdNames.add(token)
            }
            setButtonListeners(button, birdNames)
        }

        binding?.btnSearch?.setOnClickListener {
            val intent = Intent(this, ForestCreate::class.java)
            startActivity(intent)
        }
    }
    private fun setButtonListeners(button: Button, birdNames: List<String>) {
        button.setOnClickListener {
            val intent = when (button) {
                binding?.btn1 -> Intent(this, ForestList1::class.java)
                binding?.btn2 -> Intent(this, ForestList2::class.java)
                binding?.btn3 -> Intent(this, ForestList3::class.java)
                binding?.btnAll -> Intent(this, ForestAll::class.java)
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
                val intent = Intent(this, ForestListSaved::class.java)
                startActivity(intent)
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("No Birds Saved")
                builder.setMessage("Would you like to create a list ?")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                builder.setPositiveButton("Yes") { _, _ ->
                    val intent = Intent(this, ForestCreate::class.java)
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
        actionbar!!.title = "Forest"
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
        onBackPressedDispatcher.addCallback(this@ForestStart, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@ForestStart, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        })
    }
    @Entity(tableName ="Forest")
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