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
import www.ilalasafaris.myapplication.databinding.ActivityFynbosStartBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class FynbosStart : AppCompatActivity() {
    private var binding: ActivityFynbosStartBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFynbosStartBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initActionBar()
        initBirdDao()
        initListOfBirds()
        setupOnBackPressedCallback()

    }
    private fun initBirdDao() {
        val birdDao = (application as BirdApp).db.daoBirds()
        lifecycleScope.launch {
            birdDao.fetchAll_Fynbos().collect {
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
            setOf(7 ,13 ,19 ,29 ,30 ,33 ,35 ,39 ,44 ,46 ,49 ,63 ,65 ,66 ,67 ,73 ,74 ,75 ,76 ,77 ,78 ,79 ,84 ,88 ,90 ,93 ,95 ,103 ,104 ,105 ),
            // List 2
            setOf(106 ,107 ,108 ,109 ,111 ,118 ,121 ,124 ,125 ,126 ,131 ,133 ,134 ,136 ,142 ,146 ,148 ,149 ,150 ,153 ,154 ,158 ,159 ,160 ,166 ,170 ,174 ,177 ,178 ,179),
            // List 3
            setOf(185 ,186 ,201 ,202 ,203 ,204 ,206 ,208 ,209 ,213 ,219 ,222 ,229 ,233 ,234 ,235 ,239 ,243 ,244 ,247 ,249 ,251 ,252 ,254 ,255 ,256 ,260 ,263 ,264 ,267 ),
            // List 4
            setOf(268 ,269 ,272 ,273 ,274 ,276 ,298 ,300 ,301 ,304 ,306 ,310 ,311 ,318 ,320 ,322 ,325 ,329 ,330 ,341 ,346 ,353 ,359 ,360 ,361 ,362 ,363 ,365 ,366 ,367),
            // List 5
            setOf(368 ,371 ,385 ,389 ,391 ,396 ,404 ,425 ,427 ,428 ,432 ,434 ,440 ,442 ,443 ,445 ,446 ,452 ,457 ,462 ,467 ,470 ,475 ,483 ,489 ,494 ,495 ,498 ,503 ,513 ),
            // List 6
            setOf(517 ,519 ,521 ,523 ,524 ,527 ,530 ,531 ,539 ,543 ,544 ,546 ,547 ,549 ,551 ,554 ,557 ,559 ,562 ,564 ,568 ,572 ,574 ,576 ,580 ,583 ,585 ,586 ,588 ,590 ),
            // List 7
            setOf(591 ,592 ,595 ,596 ,611 ,612 ,613 ,614 ,615 ,620 ,622 ,629 ,630 ,644 ,651 ,655 ,665 ,666 ,673 ,679 ,682 ,684 ,693 ,698 ,702 ,707 ,716 ,718 ,720  ),
            // List All
            setOf(7 ,13 ,19 ,29 ,30 ,33 ,35 ,39 ,44 ,46 ,49 ,63 ,65 ,66 ,67 ,73 ,74 ,75 ,76 ,77 ,78 ,79 ,84 ,88 ,90 ,93 ,95 ,103 ,104 ,105
                ,106 ,107 ,108 ,109 ,111 ,118 ,121 ,124 ,125 ,126 ,131 ,133 ,134 ,136 ,142 ,146 ,148 ,149 ,150 ,153 ,154 ,158 ,159 ,160 ,166 ,170 ,174 ,177 ,178 ,179
                ,185 ,186 ,201 ,202 ,203 ,204 ,206 ,208 ,209 ,213 ,219 ,222 ,229 ,233 ,234 ,235 ,239 ,243 ,244 ,247 ,249 ,251 ,252 ,254 ,255 ,256 ,260 ,263 ,264 ,267
                ,268 ,269 ,272 ,273 ,274 ,276 ,298 ,300 ,301 ,304 ,306 ,310 ,311 ,318 ,320 ,322 ,325 ,329 ,330 ,341 ,346 ,353 ,359 ,360 ,361 ,362 ,363 ,365 ,366 ,367
                ,368 ,371 ,385 ,389 ,391 ,396 ,404 ,425 ,427 ,428 ,432 ,434 ,440 ,442 ,443 ,445 ,446 ,452 ,457 ,462 ,467 ,470 ,475 ,483 ,489 ,494 ,495 ,498 ,503 ,513
                ,517 ,519 ,521 ,523 ,524 ,527 ,530 ,531 ,539 ,543 ,544 ,546 ,547 ,549 ,551 ,554 ,557 ,559 ,562 ,564 ,568 ,572 ,574 ,576 ,580 ,583 ,585 ,586 ,588 ,590
                ,591 ,592 ,595 ,596 ,611 ,612 ,613 ,614 ,615 ,620 ,622 ,629 ,630 ,644 ,651 ,655 ,665 ,666 ,673 ,679 ,682 ,684 ,693 ,698 ,702 ,707 ,716 ,718 ,720  )
        )
        val buttons = listOf(binding!!.btn1, binding!!.btn2, binding!!.btn3, binding!!.btn4, binding!!.btn5,binding!!.btn6,binding!!.btn7,binding!!.btnAll)
        for ((birdSet, button) in birdSets.zip(buttons)) {
            val birdNames: MutableList<String> = ArrayList()
            for (item in lines.slice(birdSet)) {
                val token = item.idbird
                birdNames.add(token)
            }
            setButtonListeners(button, birdNames)
        }

        binding?.btnSearch?.setOnClickListener {
            val intent = Intent(this, FynbosCreate::class.java)
            startActivity(intent)
        }
    }
    private fun setButtonListeners(button: Button, birdNames: List<String>) {
        button.setOnClickListener {
            val intent = when (button) {
                binding?.btn1 -> Intent(this, FynbosList1::class.java)
                binding?.btn2 -> Intent(this, FynbosList2::class.java)
                binding?.btn3 -> Intent(this, FynbosList3::class.java)
                binding?.btn4 -> Intent(this, FynbosList4::class.java)
                binding?.btn5 -> Intent(this, FynbosList5::class.java)
                binding?.btn6 -> Intent(this, FynbosList6::class.java)
                binding?.btn7 -> Intent(this, FynbosList7::class.java)
                binding?.btnAll -> Intent(this, FynbosAll::class.java)
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
                val intent = Intent(this, FynbosListSaved::class.java)
                startActivity(intent)
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("No Birds Saved")
                builder.setMessage("Would you like to create a list ?")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                builder.setPositiveButton("Yes") { _, _ ->
                    val intent = Intent(this, FynbosCreate::class.java)
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
        actionbar!!.title = "Fynbos"
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
        onBackPressedDispatcher.addCallback(this@FynbosStart, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@FynbosStart, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        })
    }
    @Entity(tableName ="Fynbos")
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