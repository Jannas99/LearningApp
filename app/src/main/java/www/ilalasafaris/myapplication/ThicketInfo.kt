package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityThicketInfoBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class ThicketInfo : AppCompatActivity() {
    lateinit var binding: ActivityThicketInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThicketInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupOnBackPressedCallback()
        initActionBar()

        val lines = DataStored.allSpecies()
        val birdname: MutableList<String> = ArrayList()
        //Todo 3
        for (item in lines.slice(setOf(7 ,9 ,13 ,19 ,30 ,34 ,39 ,42 ,46 ,50 ,54 ,55 ,66 ,67 ,70 ,72 ,74 ,75 ,76 ,84 ,94 ,95 ,111 ,118 ,121 ,122 ,128 ,129 ,138 ,139 ,
            144 ,147 ,151 ,157 ,161 ,166 ,169 ,170 ,176 ,190 ,197 ,198 ,204 ,206 ,208 ,211 ,213 ,217 ,218 ,224 ,231 ,235 ,239 ,241 ,244 ,256 ,259 ,264 ,265 ,270 ,
            271 ,275 ,278 ,282 ,287 ,299 ,303 ,312 ,318 ,321 ,329 ,330 ,356 ,371 ,380 ,384 ,385 ,387 ,392 ,425 ,436 ,440 ,452 ,455 ,461 ,463 ,465 ,467 ,468 ,469 ,
            471 ,493 ,495 ,498 ,503 ,505 ,517 ,518 ,524 ,525 ,527 ,531 ,534 ,536 ,539 ,543 ,557 ,558 ,560 ,562 ,563 ,564 ,567 ,572 ,578 ,593 ,595 ,597 ,611 ,614 ,
            615 ,620 ,622 ,625 ,629 ,630 ,632 ,633 ,637 ,647 ,652 ,653 ,656 ,665 ,666 ,675 ,682 ,684 ,685 ,686 ,694 ,695 ,696 ,709 ,711 ,718 ,719 ,720 ,721 ,722 ))) {
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
            val intent = Intent(this, ThicketStart::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Biome List"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeButtonEnabled(true)
    }
    private fun setupOnBackPressedCallback() {
        onBackPressedDispatcher.addCallback(this@ThicketInfo, object : OnBackPressedCallback(true) {
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

