package www.ilalasafaris.myapplication


import android.os.Bundle
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import www.ilalasafaris.myapplication.databinding.ActivityPracticeBinding


class CoreList2 : AppCompatActivity() {

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
        val iterator = mBirdlist!!.slice(setOf(95 ,97 ,103 ,104 ,108 ,109 ,111 ,118 ,119 ,121 ,122 ,123 ,124 ,125 ,126 ,129 ,131 ,134 ,136 ,142 ,146 ,148 ,149 ,150 ,153 ,154 ,155 ,157 ,158 ,159,)).iterator()
        while (iterator.hasNext()) {
            val i = iterator.next()
            mlist.add(i)
        }
        val birdDao = (application as BirdApp).db.daoBirds()
        binding?.btnSave?.setOnClickListener {
            QuestionsSetter.instance?.addRecordCore(birdDao)
        }
        val questionsSetter = QuestionsSetter(this, binding!!, mlist,mCurrentposition)
        QuestionsSetter.instance = questionsSetter
        questionsSetter.setQuestion()
    }
    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Core 2"
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









