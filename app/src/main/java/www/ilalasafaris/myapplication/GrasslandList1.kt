package www.ilalasafaris.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityPracticeBinding

class GrasslandList1 : AppCompatActivity() {
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
            val iterator = mBirdlist!!.slice(setOf(30 ,31 ,51 ,57 ,60 ,61 ,67 ,81 ,83 ,90 ,96 ,101 ,102 ,130 ,193 ,206 ,207 ,222 ,223 ,224 ,240 ,256 ,286 ,313 ,321 ,328 ,334 ,335 ,342 ,347)).iterator()
            while (iterator.hasNext()) {
                val i = iterator.next()
                mlist.add(i)
            }
            val birdDao = (application as BirdApp).db.daoBirds()
            binding?.btnSave?.setOnClickListener {
                QuestionsSetter.instance?.addRecordGrassland(birdDao)
            }
            val questionsSetter = QuestionsSetter(this, binding!!, mlist, mCurrentposition)
            QuestionsSetter.instance = questionsSetter
            questionsSetter.setQuestion()
        }
        private fun initActionBar() {
            val actionbar = supportActionBar
            actionbar!!.title = "Grassland 1"
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