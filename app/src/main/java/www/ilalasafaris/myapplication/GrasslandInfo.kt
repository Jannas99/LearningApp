package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityGrasslandInfoBinding
import www.ilalasafaris.myapplication.databinding.SpecieslListBinding

class GrasslandInfo : AppCompatActivity() {
    lateinit var binding: ActivityGrasslandInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGrasslandInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupOnBackPressedCallback()
        initActionBar()

        val lines = DataStored.allSpecies()
        val birdname: MutableList<String> = ArrayList()
        for (item in lines.slice(setOf(30 ,31 ,51 ,57 ,60 ,61 ,67 ,81 ,83 ,90 ,96 ,101 ,102 ,130 ,193 ,206 ,207 ,222 ,223 ,224 ,240 ,256 ,286 ,313 ,321 ,328 ,334 ,335 ,342 ,347 ,
            353 ,359 ,382 ,385 ,429 ,432 ,433 ,435 ,437 ,448 ,451 ,462 ,476 ,495 ,503 ,514 ,527,534 ,543 ,558 ,575 ,576 ,582 ,615 ,622 ,643 ,644 ,656 ,699 ,710 ,718 ,720 ))) {
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
            val intent = Intent(this, GrasslandStart::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Biome"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeButtonEnabled(true)
    }
    private fun setupOnBackPressedCallback() {
        onBackPressedDispatcher.addCallback(this@GrasslandInfo, object : OnBackPressedCallback(true) {
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

