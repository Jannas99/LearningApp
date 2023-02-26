package www.ilalasafaris.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityQuizPracticeBinding


class QuizPractice : AppCompatActivity() {
    private var binding: ActivityQuizPracticeBinding? = null
    var mBirdlist: ArrayList<Birds>? = null
    val mlist: MutableList<Birds> = ArrayList()
    var mCurrentposition: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizPracticeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setupOnBackPressedCallback()
        initActionBar()

        mBirdlist = DataStored.allSpecies()
        //Todo 1
        val iterator = mBirdlist!!.slice(setOf(12 ,13 ,18 ,21 ,24 ,27 ,58 ,64 ,67 ,69 ,72 ,73 ,78 ,79 ,81 ,84 ,85 ,89 ,97 ,100 ,112 ,113 ,114 ,115 ,124 ,127 ,131 ,133 ,145 ,146)).iterator()
        while (iterator.hasNext()) {
            val i = iterator.next()
            mlist.add(i)
        }
        val birdDao = (application as BirdApp).db.daoBirds()
//        binding?.btnSave?.setOnClickListener {
//            //TODO 3
//            QuizSetter.instance?.addRecordCore(birdDao)
//        }
        val questionsSetter = QuizSetter(this, binding!!, mlist, mCurrentposition)
        QuizSetter.instance = questionsSetter
        questionsSetter.setQuestion()
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        //Todo 2
        actionbar!!.title = "Quiz"
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
                    finish()
            }
        })
    }
}
