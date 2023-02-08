package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityKarooInfoBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class KarooInfo : AppCompatActivity() {
    lateinit var binding: ActivityKarooInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKarooInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupOnBackPressedCallback()
        initActionBar()

        val lines = DataStored.allSpecies()
        val birdname: MutableList<String> = ArrayList()
        //Todo 3
        for (item in lines.slice(setOf(13 ,21 ,24 ,27 ,46 ,49 ,58 ,59 ,72 ,73 ,78 ,81 ,84 ,86 ,88 ,89 ,93 ,113 ,114 ,124 ,148 ,150 ,165 ,166 ,182 ,183 ,185 ,186 ,189 ,196 ,
            200 ,201 ,212 ,218 ,219 ,222 ,238 ,260 ,296 ,297 ,298 ,309 ,310 ,313 ,314 ,326 ,327 ,334 ,338 ,339 ,340 ,341 ,345 ,350 ,367 ,374 ,381 ,389 ,391 ,429,
            432 ,452 ,456 ,457 ,467 ,485 ,486 ,519 ,523 ,542 ,543 ,546 ,550 ,554 ,561 ,564 ,574 ,576 ,588 ,591 ,592 ,613 ,629 ,630 ,646 ,648 ,649 ,659 ,664 ,668 ,671 ,698 ,700 ,702 ,704 ,708 ,716 ,718 ))) {
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
            val intent = Intent(this, KarooStart::class.java)
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
        onBackPressedDispatcher.addCallback(this@KarooInfo, object : OnBackPressedCallback(true) {
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