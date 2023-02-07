package www.ilalasafaris.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityPracticeBinding
import kotlin.collections.ArrayList

class CoreAll : AppCompatActivity() {

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
        val iterator = mBirdlist!!.slice(setOf(7 ,10 ,13 ,14 ,15 ,18 ,24 ,25 ,28 ,29 ,33 ,35 ,39 ,42 ,43 ,45 ,46 ,47 ,48 ,65 ,73 ,74 ,75 ,79 ,80 ,84 ,87 ,88 ,91 ,94,
            95 ,97 ,103 ,104 ,108 ,109 ,111 ,118 ,119 ,121 ,122 ,123 ,124 ,125 ,126 ,129 ,131 ,134 ,136 ,142 ,146 ,148 ,149 ,150 ,153 ,154 ,155 ,157 ,158 ,159,
            160 ,162 ,165 ,166 ,167 ,169 ,170 ,173 ,174 ,175 ,176 ,177 ,178 ,179 ,183 ,184 ,185 ,186 ,192 ,195 ,201 ,202 ,203 ,205 ,209 ,213 ,218 ,219 ,221 ,229,
            230 ,233 ,234 ,235 ,239 ,241 ,242 ,243 ,244 ,247 ,249 ,251 ,252 ,253 ,254 ,255 ,260 ,262 ,263 ,264 ,265 ,266 ,267 ,268 ,269 ,272 ,273 ,274 ,276 ,277,
            279 ,280 ,281 ,283 ,284 ,285 ,290 ,297 ,298 ,300 ,301 ,303 ,304 ,306 ,307 ,308 ,309 ,310 ,311 ,315 ,319 ,320 ,322 ,346 ,348 ,349 ,352 ,356 ,360 ,361,
            362 ,363 ,365 ,366 ,368 ,370 ,371 ,372 ,378 ,380 ,381 ,386 ,389 ,390 ,391 ,393 ,401 ,402 ,425 ,427 ,428 ,430 ,434 ,436 ,440 ,443 ,445 ,446 ,447 ,449,
            450 ,453 ,455 ,457 ,459 ,461 ,470 ,478 ,479 ,482 ,489 ,490 ,492 ,494 ,496 ,497 ,498 ,505 ,506 ,509 ,517 ,518 ,523 ,525 ,526 ,530 ,532 ,535 ,538 ,544,
            547 ,548 ,549 ,550 ,551 ,554 ,556 ,559 ,560 ,564 ,571 ,573 ,574 ,580 ,583 ,585 ,586 ,587 ,588 ,589 ,590 ,591 ,592 ,596 ,597 ,598 ,602 ,603 ,611 ,612,
            613 ,614 ,617 ,618 ,619 ,623 ,639 ,645 ,648 ,650 ,651 ,653 ,654 ,655 ,659 ,660 ,661 ,665 ,666 ,667 ,674 ,678 ,679 ,681 ,684 ,693 ,696 ,698 ,702 ,707,
            709 ,711 ,712 ,713 ,716 ,717 ,721)).iterator()
        while (iterator.hasNext()) {
            val i = iterator.next()
            mlist.add(i)
        }
        val birdDao = (application as BirdApp).db.daoBirds()
        binding?.btnSave?.setOnClickListener {
            //Todo 6
            QuestionsSetter.instance?.addRecordCore(birdDao)
        }
        val questionsSetter = QuestionsSetter(this, binding!!, mlist,mCurrentposition)
        QuestionsSetter.instance = questionsSetter
        questionsSetter.setQuestion()
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Core All"
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

