package www.ilalasafaris.myapplication


import android.os.Bundle
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import www.ilalasafaris.myapplication.databinding.ActivityPracticeBinding


class CoreList9 : AppCompatActivity() {

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
        //Todo 4
        val iterator = mBirdlist!!.slice(setOf(613 ,614 ,617 ,618 ,619 ,623 ,639 ,645 ,648 ,650 ,651 ,653 ,654 ,655 ,659 ,660 ,661 ,665 ,666 ,667 ,674 ,678 ,679 ,681 ,684 ,693 ,696 ,698 ,702 ,707,
            709 ,711 ,712 ,713 ,716 ,717 ,721   )).iterator()
        while (iterator.hasNext()) {
            val i = iterator.next()
            mlist.add(i)
        }
        val birdDao = (application as BirdApp).db.daoBirds()
        binding?.btnSave?.setOnClickListener {
            QuestionsSetter.instance?.addRecordCore(birdDao)
        }
        val questionsSetter = QuestionsSetter(this, binding!!, mlist, mCurrentposition)
        QuestionsSetter.instance = questionsSetter
        questionsSetter.setQuestion()
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Core 9"
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








