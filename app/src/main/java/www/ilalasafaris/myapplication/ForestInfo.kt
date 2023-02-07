package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import www.ilalasafaris.myapplication.databinding.ActivityForestInfoBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class ForestInfo : AppCompatActivity() {

    lateinit var binding:ActivityForestInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForestInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionbar = supportActionBar
        actionbar!!.setTitle("Biome")
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeButtonEnabled(true)


        val lines = DataStored.allSpecies()
        val birdname: MutableList<String> = ArrayList()
        for (item in lines.slice(setOf(7 ,10 ,13 ,14 ,15 ,18 ,24 ,25 ,28 ,29 ,33 ,35 ,39 ,42 ,43 ,45 ,46 ,47 ,48 ,64 ,72 ,73 ,74 ,78 ,79 ,83 ,86 ,87 ,90 ,93 ,94 ,96 ,102 ,103 ,107 ,108 ,110 ,117 ,118 ,120 ,121 ,122 ,123 ,124 ,125 ,128 ,130 ,133 ,135 ,141 ,145 ,147 ,148 ,149 ,152 ,153 ,154 ,156 ,157 ,158 ,159 ,161 ,164 ,165 ,166 ,168 ,169 ,172 ,173 ,174 ,175 ,176 ,177 ,178 ,182 ,183 ,184 ,185 ,191 ,194 ,200 ,201 ,202 ,204 ,208 ,212 ,217 ,218 ,220 ,228 ,229 ,232 ,233 ,234 ,238 ,240 ,241 ,242 ,243 ,246 ,248 ,250 ,251 ,252 ,253 ,254 ,259 ,261 ,262 ,263 ,264 ,265 ,266 ,267 ,268 ,271 ,272 ,273 ,275 ,276 ,278 ,279 ,280 ,282 ,283 ,284 ,289 ,296 ,297 ,299 ,300 ,302 ,303 ,305 ,306 ,307 ,308 ,309 ,310 ,314 ,319 ,320 ,322 ,346 ,348 ,349 ,352 ,356 ,360 ,361 ,362 ,363 ,365 ,366 ,368 ,370 ,371 ,372 ,378 ,380,381 ,386 ,389 ,390 ,391 ,393 ,401 ,402 ,425 ,427 ,428 ,430 ,434 ,436 ,440 ,443 ,445 ,446 ,447 ,449 ,450 ,453 ,455 ,457 ,459 ,461 ,470 ,478 ,479 ,482 ,489 ,490 ,492 ,494 ,496 ,497 ,498 ,505 ,506 ,509 ,517 ,518 ,523 ,525 ,526 ,530 ,532 ,535 ,538 ,544 ,547 ,548 ,549 ,550 ,551 ,554 ,556 ,559 ,560 ,564 ,571 ,573 ,574 ,580 ,583 ,585 ,586 ,587 ,588 ,589 ,590 ,591 ,592 ,596 ,597 ,598 ,602 ,603 ,611 ,612 ,613 ,614 ,617 ,618 ,619 ,623 ,639 ,645 ,648 ,650 ,651 ,653 ,654 ,655 ,659 ,660 ,661 ,665 ,666 ,667 ,674 ,678 ,679 ,681 ,684 ,693 ,696 ,698 ,702 ,707 ,709 ,711 ,712 ,713 ,716 ,717 ,721))) {
            val token = item.idbird
            birdname.add(token)
        }
        binding.species.setOnClickListener {
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


        binding.tobasicliststart.setOnClickListener{
            val intent = Intent(this, CoreStart::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}