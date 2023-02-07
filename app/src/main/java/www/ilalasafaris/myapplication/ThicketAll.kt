package www.ilalasafaris.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityPracticeBinding

class ThicketAll : AppCompatActivity() {
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
        //Todo 1
        val iterator = mBirdlist!!.slice(setOf(7 ,9 ,13 ,19 ,30 ,34 ,39 ,42 ,46 ,50 ,54 ,55 ,66 ,67 ,70 ,72 ,74 ,75 ,76 ,84 ,94 ,95 ,111 ,118 ,121 ,122 ,128 ,129 ,138 ,139 ,
            144 ,147 ,151 ,157 ,161 ,166 ,169 ,170 ,176 ,190 ,197 ,198 ,204 ,206 ,208 ,211 ,213 ,217 ,218 ,224 ,231 ,235 ,239 ,241 ,244 ,256 ,259 ,264 ,265 ,270 ,
            271 ,275 ,278 ,282 ,287 ,299 ,303 ,312 ,318 ,321 ,329 ,330 ,356 ,371 ,380 ,384 ,385 ,387 ,392 ,425 ,436 ,440 ,452 ,455 ,461 ,463 ,465 ,467 ,468 ,469 ,
            471 ,493 ,495 ,498 ,503 ,505 ,517 ,518 ,524 ,525 ,527 ,531 ,534 ,536 ,539 ,543 ,557 ,558 ,560 ,562 ,563 ,564 ,567 ,572 ,578 ,593 ,595 ,597 ,611 ,614 ,
            615 ,620 ,622 ,625 ,629 ,630 ,632 ,633 ,637 ,647 ,652 ,653 ,656 ,665 ,666 ,675 ,682 ,684 ,685 ,686 ,694 ,695 ,696 ,709 ,711 ,718 ,719 ,720 ,721 ,722 )).iterator()
        while (iterator.hasNext()) {
            val i = iterator.next()
            mlist.add(i)
        }
        val birdDao = (application as BirdApp).db.daoBirds()
        binding?.btnSave?.setOnClickListener {
            QuestionsSetter.instance?.addRecordThicket(birdDao)
        }
        val questionsSetter = QuestionsSetter(this, binding!!, mlist, mCurrentposition)
        QuestionsSetter.instance = questionsSetter
        questionsSetter.setQuestion()
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Thicket All"
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