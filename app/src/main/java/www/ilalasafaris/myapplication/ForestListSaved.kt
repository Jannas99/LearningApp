package www.ilalasafaris.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import www.ilalasafaris.myapplication.databinding.ActivityPracticeBinding

class ForestListSaved : AppCompatActivity() {
    private var binding: ActivityPracticeBinding? = null
    private var lBirdlist: ArrayList<ForestStart.Data> = ArrayList()
    var mCurrentposition: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initActionBar()
        setupOnBackPressedCallback()
        readData()
        binding!!.btnSave.visibility = View.GONE

    }
    private  fun setQuestion() {
        val mlist = ArrayList<Birds>()
        for (element in lBirdlist) {
            val birdsElement = Birds(element.id, element.idbird, element.name, element.sname, element.picture1, element.picture2, element.picture3, element.picture4, element.picture5, element.sound)
            mlist.add(birdsElement)
        }

        val questionsSetter = QuestionsSetter(this, binding!!, mlist, mCurrentposition)
        QuestionsSetter.instance = questionsSetter
        questionsSetter.setQuestion()
    }
    private fun readData(){
        val birdDao = (application as BirdApp).db.daoBirds()
        lifecycleScope.launch {
            birdDao.fetchAll_Forest().collect {
                val list = ArrayList(it)
                lBirdlist.addAll(list)
                val count = list.count().toString()
                binding?.progress!!.max = count.toInt()
                val sb = StringBuilder()
                sb.append("$mCurrentposition / " )
                sb.append(binding!!.progress.max)
                binding!!.txtprogress.text = sb.toString()
                setQuestion()
            }
        }
    }

    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Forest: Saved List"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeButtonEnabled(true)
    }
    private fun setupOnBackPressedCallback() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                QuestionsSetter.instance?.onBack()
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