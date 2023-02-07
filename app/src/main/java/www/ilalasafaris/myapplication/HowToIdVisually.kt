package www.ilalasafaris.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ScrollView
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityHowToIdVisuallyBinding

class HowToIdVisually : AppCompatActivity() {
    private lateinit var binding: ActivityHowToIdVisuallyBinding
    private val scrollView: ScrollView
        get() = binding.scrollview

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHowToIdVisuallyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupOnBackPressedCallback()
        initActionBar()

        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.introindex -> scrollTo(binding.intro)
                R.id.shapeandsizeindex -> scrollTo(binding.shapeandsize)
                R.id.billtypesindex -> scrollTo(binding.billtypes)
                R.id.legsindex -> scrollTo(binding.legs)
                R.id.plumageindex -> scrollTo(binding.plumage)
                R.id.habitatindex -> scrollTo(binding.habitat)
                R.id.habitsindex -> scrollTo(binding.habits)
                R.id.flightpatternsindex -> scrollTo(binding.flightpatterns)
                R.id.backtotop -> scrollTo(binding.index)
            }
        }
        binding.apply {
            introindex.setOnClickListener(clickListener)
            shapeandsizeindex.setOnClickListener(clickListener)
            billtypesindex.setOnClickListener(clickListener)
            legsindex.setOnClickListener(clickListener)
            plumageindex.setOnClickListener(clickListener)
            habitatindex.setOnClickListener(clickListener)
            habitsindex.setOnClickListener(clickListener)
            flightpatternsindex.setOnClickListener(clickListener)
            backtotop.setOnClickListener(clickListener)
        }
    }
    private fun scrollTo(view: View) {
        scrollView.post {
            val test = view.top - scrollView.paddingTop
            scrollView.smoothScrollTo(0, test)
        }
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Identifying Birds Visually"
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
        onBackPressedDispatcher.addCallback(this@HowToIdVisually, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                finish()
            }
        })

    }
}

