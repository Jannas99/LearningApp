package www.ilalasafaris.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityPracticeBinding
import kotlin.collections.ArrayList


class BasicAll : AppCompatActivity() {
    private var binding: ActivityPracticeBinding? = null
    var mBirdlist: ArrayList<Birds>? = null
    val mlist: MutableList<Birds> = ArrayList()
    var mCurrentposition: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setupOnBackPressedCallback()
        initActionBar()

        mBirdlist = DataStored.allSpecies()
        //TODO 1
        val iterator = mBirdlist!!.slice(setOf(10,7,13,14,15,18,23,24,27,29,33,35,39,42,43,45,46,47,48,63,71,72,73,77,78,82,85,86,89,92,
            93,95,101,102,106,107,109,116,117,119,120,121,122,123,124,127,129,132,134,140,144,146,147,148,150,152,153,155,156,157,
            158,160,163,164,165,167,168,171,172,173,174,175,176,177,181,182,183,184,190,193,199,201,202,204,208,213,218,219,221,229,
            230,233,234,235,239,240,241,242,243,246,248,250,251,252,253,254,259,261,262,263,264,265,266,267,268,271,272,273,275,276,278,
            279,280,282,283,284,289,296,297,299,300,302,303,305,306,307,308,309,310,314,319,320,322,346,348,349,352,356,360,361,362,)).iterator()
        while (iterator.hasNext()) {
            val i = iterator.next()
            mlist.add(i)
        }
        val birdDao = (application as BirdApp).db.daoBirds()
        binding?.btnSave?.setOnClickListener {
            QuestionsSetter.instance?.addRecordBasic(birdDao)
        }
        val questionsSetter = QuestionsSetter(this, binding!!, mlist, mCurrentposition)
        QuestionsSetter.instance = questionsSetter
        questionsSetter.setQuestion()
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Basic 5"
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
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                QuestionsSetter.instance?.onBack()
            }
        })
    }
}



