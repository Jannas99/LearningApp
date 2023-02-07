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
import www.ilalasafaris.myapplication.databinding.ActivityDesertStartBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class DesertStart : AppCompatActivity() {
    private var binding: ActivityDesertStartBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesertStartBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initActionBar()
        initBirdDao()
        initListOfBirds()
        setupOnBackPressedCallback()
    }
    private fun initBirdDao() {
        val birdDao = (application as BirdApp).db.daoBirds()
        lifecycleScope.launch {
            birdDao.fetchAll_Desert().collect {
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
            setOf(7 ,10 ,13 ,14 ,15 ,18 ,24 ,25 ,28 ,29 ,33 ,35 ,39 ,42 ,43 ,45 ,46 ,47 ,48 ,65 ,73 ,74 ,75 ,79 ,80 ,84 ,87 ,88 ,91 ,94),
            // List 2
            setOf( 95 ,97 ,103 ,104 ,108 ,109 ,111 ,118 ,119 ,121 ,122 ,123 ,124 ,125 ,126 ,129 ,131 ,134 ,136 ,142 ,146 ,148 ,149 ,150 ,153 ,154 ,155 ,157 ,158 ,159),
            // List 3
            setOf(160 ,162 ,165 ,166 ,167 ,169 ,170 ,173 ,174 ,175 ,176 ,177 ,178 ,179 ,183 ,184 ,185 ,186 ,192 ,195 ,201 ,202 ,203 ,205 ,209 ,213 ,218 ,219 ,221 ,229),
            // List 4
            setOf(230 ,233 ,234 ,235 ,239 ,241 ,242 ,243 ,244 ,247 ,249 ,251 ,252 ,253 ,254 ,255 ,260 ,262 ,263 ,264 ,265 ,266 ,267 ,268 ,269 ,272 ,273 ,274 ,276 ,277),
            // List 5
            setOf(279 ,280 ,281 ,283 ,284 ,285 ,290 ,297 ,298 ,300 ,301 ,303 ,304 ,306 ,307 ,308 ,309 ,310 ,311 ,315 ,319 ,320 ,322 ,346 ,348 ,349 ,352 ,356 ,360 ,361),
            // List All
            setOf(7 ,10 ,13 ,14 ,15 ,18 ,24 ,25 ,28 ,29 ,33 ,35 ,39 ,42 ,43 ,45 ,46 ,47 ,48 ,65 ,73 ,74 ,75 ,79 ,80 ,84 ,87 ,88 ,91 ,94,
                95 ,97 ,103 ,104 ,108 ,109 ,111 ,118 ,119 ,121 ,122 ,123 ,124 ,125 ,126 ,129 ,131 ,134 ,136 ,142 ,146 ,148 ,149 ,150 ,153 ,154 ,155 ,157 ,158 ,159,
                160 ,162 ,165 ,166 ,167 ,169 ,170 ,173 ,174 ,175 ,176 ,177 ,178 ,179 ,183 ,184 ,185 ,186 ,192 ,195 ,201 ,202 ,203 ,205 ,209 ,213 ,218 ,219 ,221 ,229,
                230 ,233 ,234 ,235 ,239 ,241 ,242 ,243 ,244 ,247 ,249 ,251 ,252 ,253 ,254 ,255 ,260 ,262 ,263 ,264 ,265 ,266 ,267 ,268 ,269 ,272 ,273 ,274 ,276 ,277,
                279 ,280 ,281 ,283 ,284 ,285 ,290 ,297 ,298 ,300 ,301 ,303 ,304 ,306 ,307 ,308 ,309 ,310 ,311 ,315 ,319 ,320 ,322 ,346 ,348 ,349 ,352 ,356 ,360 ,361,
                362 ,363 ,365 ,366 ,368 ,370 ,371 ,372 ,378 ,380 ,381 ,386 ,389 ,390 ,391 ,393 ,401 ,402 ,425 ,427 ,428 ,430 ,434 ,436 ,440 ,443 ,445 ,446 ,447 ,449,
                450 ,453 ,455 ,457 ,459 ,461 ,470 ,478 ,479 ,482 ,489 ,490 ,492 ,494 ,496 ,497 ,498 ,505 ,506 ,509 ,517 ,518 ,523 ,525 ,526 ,530 ,532 ,535 ,538 ,544,
                547 ,548 ,549 ,550 ,551 ,554 ,556 ,559 ,560 ,564 ,571 ,573 ,574 ,580 ,583 ,585 ,586 ,587 ,588 ,589 ,590 ,591 ,592 ,596 ,597 ,598 ,602 ,603 ,611 ,612,
                613 ,614 ,617 ,618 ,619 ,623 ,639 ,645 ,648 ,650 ,651 ,653 ,654 ,655 ,659 ,660 ,661 ,665 ,666 ,667 ,674 ,678 ,679 ,681 ,684 ,693 ,696 ,698 ,702 ,707,
                709 ,711 ,712 ,713 ,716 ,717 ,721)
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
            val intent = Intent(this, DesertCreate::class.java)
            startActivity(intent)
        }
    }
    private fun setButtonListeners(button: Button, birdNames: List<String>) {
        button.setOnClickListener {
            val intent = when (button) {
                binding?.btn1 -> Intent(this, DesertList1::class.java)
                binding?.btn2 -> Intent(this, DesertList2::class.java)
                binding?.btn3 -> Intent(this, DesertList3::class.java)
                binding?.btn4 -> Intent(this, DesertList4::class.java)
                binding?.btn5 -> Intent(this, DesertList5::class.java)
                binding?.btnAll -> Intent(this, DesertAll::class.java)
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
                val intent = Intent(this, DesertListSaved::class.java)
                startActivity(intent)
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("No Birds Saved")
                builder.setMessage("Would you like to create a list ?")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                builder.setPositiveButton("Yes") { _, _ ->
                    val intent = Intent(this, DesertCreate::class.java)
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
        actionbar!!.title = "Desert"
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
        onBackPressedDispatcher.addCallback(this@DesertStart, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(this@DesertStart, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        })
    }
    @Entity(tableName ="Desert")
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