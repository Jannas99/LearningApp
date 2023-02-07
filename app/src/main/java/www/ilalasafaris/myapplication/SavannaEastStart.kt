package www.ilalasafaris.myapplication


import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.*
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.coroutines.launch
import www.ilalasafaris.myapplication.databinding.ActivitySavannaeastStartBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class SavannaEastStart: AppCompatActivity() {
    private var binding: ActivitySavannaeastStartBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavannaeastStartBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initActionBar()
        initBirdDao()
        initListOfBirds()
        setupOnBackPressedCallback()

    }
    private fun initBirdDao() {
        val birdDao = (application as BirdApp).db.daoBirds()
        lifecycleScope.launch {
            birdDao.fetchAll_SavannaEast().collect {
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
            setOf(9 ,11 ,20 ,23 ,26 ,32 ,40 ,50 ,53 ,55 ,56 ,58 ,62 ,68 ,71 ,82 ,92 ,98 ,99 ,100 ,110 ,112 ,115 ,116 ,117 ,120 ,127 ,132 ,133 ,135 ,),
            // List 2
            setOf(137 ,138 ,140 ,143 ,144 ,156 ,163 ,164 ,168 ,172 ,180 ,181 ,191 ,193 ,194 ,197 ,198 ,199 ,200 ,210 ,214 ,215 ,216 ,217 ,220 ,225 ,228 ,232 ,236 ,237 ,),
            // List 3
            setOf(245 ,259 ,261 ,270 ,271 ,287 ,288 ,289 ,291 ,295 ,299 ,302 ,316 ,323 ,324 ,331 ,333 ,336 ,337 ,343 ,351 ,354 ,364 ,373 ,375 ,376 ,377 ,379 ,383 ,387 ,),
            // List 4
            setOf(388 ,392 ,394 ,395 ,397 ,398 ,400 ,424 ,448 ,449 ,456 ,458 ,460 ,464 ,466 ,468 ,473 ,474 ,477 ,480 ,481 ,485 ,487 ,491 ,504 ,507 ,508 ,510 ,511 ,512 ,),
            // List 5
            setOf(528 ,529 ,537 ,540 ,541 ,545 ,546 ,552 ,553 ,555 ,565 ,570 ,577 ,578 ,579 ,581 ,584 ,593 ,594 ,616 ,625 ,626 ,631 ,632 ,644 ,646 ,649 ,662 ,669 ,670 ,),
            // List 6
            setOf(672 ,677 ,683 ,686 ,687 ,688 ,689 ,690 ,692 ,694 ,695 ,705 ,706 ,708 ,714 ,715 ),
            // List All
            setOf(9 ,11 ,20 ,23 ,26 ,32 ,40 ,50 ,53 ,55 ,56 ,58 ,62 ,68 ,71 ,82 ,92 ,98 ,99 ,100 ,110 ,112 ,115 ,116 ,117 ,120 ,127 ,132 ,133 ,135 ,
                137 ,138 ,140 ,143 ,144 ,156 ,163 ,164 ,168 ,172 ,180 ,181 ,191 ,193 ,194 ,197 ,198 ,199 ,200 ,210 ,214 ,215 ,216 ,217 ,220 ,225 ,228 ,232 ,236 ,237 ,
                245 ,259 ,261 ,270 ,271 ,287 ,288 ,289 ,291 ,295 ,299 ,302 ,316 ,323 ,324 ,331 ,333 ,336 ,337 ,343 ,351 ,354 ,364 ,373 ,375 ,376 ,377 ,379 ,383 ,387 ,
                388 ,392 ,394 ,395 ,397 ,398 ,400 ,424 ,448 ,449 ,456 ,458 ,460 ,464 ,466 ,468 ,473 ,474 ,477 ,480 ,481 ,485 ,487 ,491 ,504 ,507 ,508 ,510 ,511 ,512 ,
                528 ,529 ,537 ,540 ,541 ,545 ,546 ,552 ,553 ,555 ,565 ,570 ,577 ,578 ,579 ,581 ,584 ,593 ,594 ,616 ,625 ,626 ,631 ,632 ,644 ,646 ,649 ,662 ,669 ,670 ,
                672 ,677 ,683 ,686 ,687 ,688 ,689 ,690 ,692 ,694 ,695 ,705 ,706 ,708 ,714 ,715 )
        )
        val buttons = listOf(binding!!.btn1, binding!!.btn2, binding!!.btn3, binding!!.btn4, binding!!.btn5,binding!!.btn6,binding!!.btnAll)
        for ((birdSet, button) in birdSets.zip(buttons)) {
            val birdNames: MutableList<String> = ArrayList()
            for (item in lines.slice(birdSet)) {
                val token = item.idbird
                birdNames.add(token)
            }
            setButtonListeners(button, birdNames)
        }

        binding?.btnSearch?.setOnClickListener {
            val intent = Intent(this, SavannaEastCreate::class.java)
            startActivity(intent)
        }
    }
    private fun setButtonListeners(button: Button, birdNames: List<String>) {
        button.setOnClickListener {
            val intent = when (button) {
                binding?.btn1 -> Intent(this, SavannaEastList1::class.java)
                binding?.btn2 -> Intent(this, SavannaEastList2::class.java)
                binding?.btn3 -> Intent(this, SavannaEastList3::class.java)
                binding?.btn4 -> Intent(this, SavannaEastList4::class.java)
                binding?.btn5 -> Intent(this, SavannaEastList5::class.java)
                binding?.btn6 -> Intent(this, SavannaEastList6::class.java)
                binding?.btnAll -> Intent(this, SavannaEastAll::class.java)
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
                val intent = Intent(this, SavannaEastListSaved::class.java)
                startActivity(intent)
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("No Birds Saved")
                builder.setMessage("Would you like to create a list ?")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                builder.setPositiveButton("Yes") { _, _ ->
                    val intent = Intent(this, SavannaEastCreate::class.java)
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
        actionbar!!.title = "Eastern Savanna"
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
        onBackPressedDispatcher.addCallback(this@SavannaEastStart, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@SavannaEastStart, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        })
    }
    @Entity(tableName ="Savanna_East")
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