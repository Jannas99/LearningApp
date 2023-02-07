package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityFynbosInfoBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class FynbosInfo : AppCompatActivity() {

    lateinit var binding: ActivityFynbosInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFynbosInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupOnBackPressedCallback()
        initActionBar()

        val lines = DataStored.allSpecies()
        val birdname: MutableList<String> = ArrayList()
        //Todo 3
        for (item in lines.slice(setOf(7 ,13 ,19 ,29 ,30 ,33 ,35 ,39 ,44 ,46 ,49 ,63 ,65 ,66 ,67 ,73 ,74 ,75 ,76 ,77 ,78 ,79 ,84 ,88 ,90 ,93 ,95 ,103 ,104 ,105
            ,106 ,107 ,108 ,109 ,111 ,118 ,121 ,124 ,125 ,126 ,131 ,133 ,134 ,136 ,142 ,146 ,148 ,149 ,150 ,153 ,154 ,158 ,159 ,160 ,166 ,170 ,174 ,177 ,178 ,179
            ,185 ,186 ,201 ,202 ,203 ,204 ,206 ,208 ,209 ,213 ,219 ,222 ,229 ,233 ,234 ,235 ,239 ,243 ,244 ,247 ,249 ,251 ,252 ,254 ,255 ,256 ,260 ,263 ,264 ,267
            ,268 ,269 ,272 ,273 ,274 ,276 ,298 ,300 ,301 ,304 ,306 ,310 ,311 ,318 ,320 ,322 ,325 ,329 ,330 ,341 ,346 ,353 ,359 ,360 ,361 ,362 ,363 ,365 ,366 ,367
            ,368 ,371 ,385 ,389 ,391 ,396 ,404 ,425 ,427 ,428 ,432 ,434 ,440 ,442 ,443 ,445 ,446 ,452 ,457 ,462 ,467 ,470 ,475 ,483 ,489 ,494 ,495 ,498 ,503 ,513
            ,517 ,519 ,521 ,523 ,524 ,527 ,530 ,531 ,539 ,543 ,544 ,546 ,547 ,549 ,551 ,554 ,557 ,559 ,562 ,564 ,568 ,572 ,574 ,576 ,580 ,583 ,585 ,586 ,588 ,590
            ,591 ,592 ,595 ,596 ,611 ,612 ,613 ,614 ,615 ,620 ,622 ,629 ,630 ,644 ,651 ,655 ,665 ,666 ,673 ,679 ,682 ,684 ,693 ,698 ,702 ,707 ,716 ,718 ,720 ))) {
            val token = item.idbird
            birdname.add(token)
        }
        val mAdapter = ArrayAdapter(this, R.layout.listview_text_properties, R.id.textView, birdname.sorted())

        binding.species.setOnClickListener {
            val updateDialog = Dialog(this, R.style.Theme_Dialog)
            updateDialog.setCancelable(false)
            val binding = SpecieslListBinding.inflate(layoutInflater)
            updateDialog.setContentView(binding.root)
            binding.listview.adapter = mAdapter
            mAdapter.notifyDataSetChanged()
            binding.closedialog.setOnClickListener{
                updateDialog.dismiss()
            }
            updateDialog.show()
            updateDialog.setCanceledOnTouchOutside(true)
        }
        binding.tobasicliststart.setOnClickListener{
            val intent = Intent(this, FynbosStart::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Biomes"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeButtonEnabled(true)
    }
    private fun setupOnBackPressedCallback() {
        onBackPressedDispatcher.addCallback(this@FynbosInfo, object : OnBackPressedCallback(true) {
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