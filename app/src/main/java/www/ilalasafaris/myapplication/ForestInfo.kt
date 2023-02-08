package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityForestInfoBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class ForestInfo : AppCompatActivity() {
    lateinit var binding: ActivityForestInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForestInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupOnBackPressedCallback()
        initActionBar()

        val lines = DataStored.allSpecies()
        val birdname: MutableList<String> = ArrayList()
        for (item in lines.slice(setOf(8 ,16 ,17 ,19 ,22 ,34 ,41 ,51 ,52 ,54 ,66 ,70 ,76 ,128 ,139 ,147 ,151 ,152 ,161 ,171 ,204 ,208 ,211 ,245 ,246 ,248 ,259 ,261 ,275 ,278 ,
            282 ,305 ,355 ,357 ,358 ,369 ,384 ,387 ,399 ,426 ,464 ,465 ,469 ,471 ,472 ,477 ,495 ,524 ,527 ,536 ,562 ,563 ,566 ,567 ,569 ,570 ,572 ,620 ,621 ,624 ,
            627 ,633 ,637 ,638 ,641 ,642 ,647 ,652 ,657 ,663 ,675 ,676 ,680 ,682 ,685 ,703 ,719 ,720 ))) {
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
            val intent = Intent(this, ForestStart::class.java)
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
        onBackPressedDispatcher.addCallback(this@ForestInfo, object : OnBackPressedCallback(true) {
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