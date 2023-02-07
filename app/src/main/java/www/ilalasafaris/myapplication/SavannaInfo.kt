package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivitySavannaInfoBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding


class SavannaInfo : AppCompatActivity() {

    lateinit var binding: ActivitySavannaInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavannaInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupOnBackPressedCallback()
        initActionBar()

        // East Savanna
        val lines = DataStored.allSpecies()
        val birdname: MutableList<String> = ArrayList()
        for (item in lines.slice(setOf(7 ,10 ,13 ,14 ,15 ,18 ,24 ,25 ,28 ,29 ,33 ,35 ,39 ,42 ,43 ,45 ,46 ,47 ,48 ,64 ,72 ,73 ,74 ,78 ,79 ,83 ,86 ,87 ,90 ,93 ,94 ,96 ,102 ,103 ,107 ,108 ,110 ,117 ,118 ,120 ,121 ,122 ,123 ,124 ,125 ,128 ,130 ,133 ,135 ,141 ,145 ,147 ,148 ,149 ,152 ,153 ,154 ,156 ,157 ,158 ,159 ,161 ,164 ,165 ,166 ,168 ,169 ,172 ,173 ,174 ,175 ,176 ,177 ,178 ,182 ,183 ,184 ,185 ,191 ,194 ,200 ,201 ,202 ,204 ,208 ,212 ,217 ,218 ,220 ,228 ,229 ,232 ,233 ,234 ,238 ,240 ,241 ,242 ,243 ,246 ,248 ,250 ,251 ,252 ,253 ,254 ,259 ,261 ,262 ,263 ,264 ,265 ,266 ,267 ,268 ,271 ,272 ,273 ,275 ,276 ,278 ,279 ,280 ,282 ,283 ,284 ,289 ,296 ,297 ,299 ,300 ,302 ,303 ,305 ,306 ,307 ,308 ,309 ,310 ,314 ,319 ,320 ,322 ,346 ,348 ,349 ,352 ,356 ,360 ,361 ,362 ,363 ,365 ,366 ,368 ,370 ,371 ,372 ,378 ,380,381 ,386 ,389 ,390 ,391 ,393 ,401 ,402 ,425 ,427 ,428 ,430 ,434 ,436 ,440 ,443 ,445 ,446 ,447 ,449 ,450 ,453 ,455 ,457 ,459 ,461 ,470 ,478 ,479 ,482 ,489 ,490 ,492 ,494 ,496 ,497 ,498 ,505 ,506 ,509 ,517 ,518 ,523 ,525 ,526 ,530 ,532 ,535 ,538 ,544 ,547 ,548 ,549 ,550 ,551 ,554 ,556 ,559 ,560 ,564 ,571 ,573 ,574 ,580 ,583 ,585 ,586 ,587 ,588 ,589 ,590 ,591 ,592 ,596 ,597 ,598 ,602 ,603 ,611 ,612 ,613 ,614 ,617 ,618 ,619 ,623 ,639 ,645 ,648 ,650 ,651 ,653 ,654 ,655 ,659 ,660 ,661 ,665 ,666 ,667 ,674 ,678 ,679 ,681 ,684 ,693 ,696 ,698 ,702 ,707 ,709 ,711 ,712 ,713 ,716 ,717 ,721))) {
            val token = item.idbird
            birdname.add(token)
        }
        binding.specieseast.setOnClickListener {
            val updateDialog = Dialog(this, R.style.Theme_Dialog)
            updateDialog.setCancelable(false)
            val binding = SpecieslListBinding.inflate(layoutInflater)
            updateDialog.setContentView(binding.root)
            val mAdapter = ArrayAdapter(this, R.layout.listview_text_properties, R.id.textView, birdname.sorted())
            binding.listview.adapter = mAdapter
            mAdapter.notifyDataSetChanged()

            binding.closedialog.setOnClickListener{
                updateDialog.dismiss()
            }
            updateDialog.show()
            updateDialog.setCanceledOnTouchOutside(true)
        }
        binding.tosavannaeastlist.setOnClickListener{
            val intent = Intent(this, SavannaEastStart::class.java)
            startActivity(intent)
            finish()
        }

        // West Savanna
        val linesw = DataStored.allSpecies()
        val birdnamew: MutableList<String> = ArrayList()
        for (item in linesw.slice(setOf(7 ,11 ,12 ,13 ,20 ,21 ,25 ,27 ,28 ,33 ,47 ,49 ,50 ,53 ,55 ,58 ,62 ,71 ,84 ,87 ,92 ,95 ,97 ,100 ,115 ,116 ,129 ,131 ,132 ,133 ,
            134 ,135 ,138 ,144 ,148 ,154 ,156 ,160 ,163 ,168 ,172 ,174 ,180 ,183 ,188 ,189 ,193 ,194 ,195 ,197 ,198 ,199 ,200 ,201 ,214 ,215 ,217 ,218 ,220 ,221 ,
            224 ,225 ,237 ,238 ,247 ,251 ,280 ,281 ,287 ,288 ,289 ,296 ,297 ,300 ,304 ,315 ,316 ,319 ,331 ,334 ,336 ,337 ,338 ,343 ,351 ,353 ,368 ,380 ,383 ,388 ,
            394 ,400 ,424 ,428 ,431 ,445 ,450 ,453 ,456 ,457 ,458 ,466 ,468 ,470 ,474 ,478 ,480 ,484 ,485 ,486 ,487 ,489 ,494 ,496 ,506 ,507 ,508 ,509 ,511 ,512 ,
            517 ,520 ,523 ,525 ,532 ,535 ,538 ,544 ,545 ,546 ,549 ,552 ,559 ,565 ,573 ,574 ,578 ,579 ,580 ,581 ,583 ,593 ,594 ,613 ,614 ,626 ,628 ,629 ,631 ,632 ,
            644 ,646 ,648 ,661 ,665 ,666 ,670 ,677 ,683 ,684 ,688 ,689 ,690 ,693 ,695 ,696 ,697 ,698 ,705 ,706 ,707 ,708 ,713 ,714 ,715 ,716 ,717 ,721 ))) {
            val token = item.idbird
            birdnamew.add(token)
        }
        binding.specieswest.setOnClickListener {
            val updateDialog = Dialog(this, R.style.Theme_Dialog)
            updateDialog.setCancelable(false)
            val binding = SpecieslListBinding.inflate(layoutInflater)
            updateDialog.setContentView(binding.root)
            val mAdapter = ArrayAdapter(this, R.layout.listview_text_properties, R.id.textView, birdnamew.sorted())
            binding.listview.adapter = mAdapter
            mAdapter.notifyDataSetChanged()

            binding.closedialog.setOnClickListener{
                updateDialog.dismiss()
            }

            updateDialog.show()
            updateDialog.setCanceledOnTouchOutside(true)
        }
        binding.tosavannawestlist.setOnClickListener{
            val intent = Intent(this, SavannaWestStart::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Savanna"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeButtonEnabled(true)
    }
    private fun setupOnBackPressedCallback() {
        onBackPressedDispatcher.addCallback(this@SavannaInfo, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                finish()
            }
        })
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
}