package www.ilalasafaris.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityPracticeBinding
import kotlin.collections.ArrayList

class SavannaWestAll : AppCompatActivity() {

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
        val iterator = mBirdlist!!.slice(
            setOf(7 ,11 ,12 ,13 ,20 ,21 ,25 ,27 ,28 ,33 ,47 ,49 ,50 ,53 ,55 ,58 ,62 ,71 ,84 ,87 ,92 ,95 ,97 ,100 ,115 ,116 ,129 ,131 ,132 ,133 ,
                134 ,135 ,138 ,144 ,148 ,154 ,156 ,160 ,163 ,168 ,172 ,174 ,180 ,183 ,188 ,189 ,193 ,194 ,195 ,197 ,198 ,199 ,200 ,201 ,214 ,215 ,217 ,218 ,220 ,221 ,
                224 ,225 ,237 ,238 ,247 ,251 ,280 ,281 ,287 ,288 ,289 ,296 ,297 ,300 ,304 ,315 ,316 ,319 ,331 ,334 ,336 ,337 ,338 ,343 ,351 ,353 ,368 ,380 ,383 ,388 ,
                394 ,400 ,424 ,428 ,431 ,445 ,450 ,453 ,456 ,457 ,458 ,466 ,468 ,470 ,474 ,478 ,480 ,484 ,485 ,486 ,487 ,489 ,494 ,496 ,506 ,507 ,508 ,509 ,511 ,512 ,
                517 ,520 ,523 ,525 ,532 ,535 ,538 ,544 ,545 ,546 ,549 ,552 ,559 ,565 ,573 ,574 ,578 ,579 ,580 ,581 ,583 ,593 ,594 ,613 ,614 ,626 ,628 ,629 ,631 ,632 ,
                644 ,646 ,648 ,661 ,665 ,666 ,670 ,677 ,683 ,684 ,688 ,689 ,690 ,693 ,695 ,696 ,697 ,698 ,705 ,706 ,707 ,708 ,713 ,714 ,715 ,716 ,717 ,721)
        ).iterator()
        while (iterator.hasNext()) {
            val i = iterator.next()
            mlist.add(i)
        }
        val birdDao = (application as BirdApp).db.daoBirds()
        binding?.btnSave?.setOnClickListener {
            QuestionsSetter.instance?.addRecordSavannwest(birdDao)
        }
        val questionsSetter = QuestionsSetter(this, binding!!, mlist, mCurrentposition)
        QuestionsSetter.instance = questionsSetter
        questionsSetter.setQuestion()
    }

    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Western Savanna All"
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


