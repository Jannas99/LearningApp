package www.ilalasafaris.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ScrollView
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityAboutBinding

class AboutThisApp : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding
    private val scrollView: ScrollView
        get() = binding!!.scrollview

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAboutBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)

        setupOnBackPressedCallback()
        initActionBar()

        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.aboutappindex -> scrollTo(binding.aboutapp)
                R.id.howtouseappindex -> scrollTo(binding.howtouseapp)
                R.id.howtopracticeindex -> scrollTo(binding.howtopractice)
                R.id.backtotop-> scrollTo(binding.index)

            }
        }
        binding.apply {
            aboutappindex.setOnClickListener(clickListener)
            howtouseappindex.setOnClickListener(clickListener)
            howtopracticeindex.setOnClickListener(clickListener)
            index.setOnClickListener(clickListener)
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
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeButtonEnabled(true)
    }
    private fun setupOnBackPressedCallback() {
        onBackPressedDispatcher.addCallback(this@AboutThisApp, object : OnBackPressedCallback(true) {
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