package www.ilalasafaris.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.ScrollView
import androidx.activity.OnBackPressedCallback
import www.ilalasafaris.myapplication.databinding.ActivityHowtoIdCallsBinding


class HowtoIdCalls : AppCompatActivity() {
    private lateinit var binding: ActivityHowtoIdCallsBinding
    private val scrollView: ScrollView
        get() = binding.scrollview
    var mediaplayer: MyMediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHowtoIdCallsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupOnBackPressedCallback()
        initActionBar()
        mediaplayer = MyMediaPlayer.getInstance(this)

        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.introindex -> scrollTo(binding.introduction)
                R.id.pitchindex -> scrollTo(binding.pitch)
                R.id.tempoindex -> scrollTo(binding.tempo)
                R.id.qualityindex -> scrollTo(binding.quality)
                R.id.mimicaryindex -> scrollTo(binding.mimicary)
                R.id.alarmindex -> scrollTo(binding.tempo)
                R.id.backtotop -> scrollTo(binding.index)
            }
        }
        binding.apply {
            introindex.setOnClickListener(clickListener)
            pitchindex.setOnClickListener(clickListener)
            tempoindex.setOnClickListener(clickListener)
            qualityindex.setOnClickListener(clickListener)
            mimicaryindex.setOnClickListener(clickListener)
            alarmindex.setOnClickListener(clickListener)
            index.setOnClickListener(clickListener)
            backtotop.setOnClickListener(clickListener)
        }
        binding.apply {
            birdCallsexamples(waxbillplay,waxbillstop,R.raw.waxbill_blue_1d_id)
            birdCallsexamples(brownscrubrobinplay1,brownscrubrobinstop1,R.raw.robin_brownscrub_1d_id)
            birdCallsexamples(piedcrowplay,piedcrowstop,R.raw.crow_pied_1d_id)
            birdCallsexamples(blacktchplay,blacktchstop,R.raw.tchagra_blackcrowned_1l_id)
            birdCallsexamples(browntchplay,browntchstop,R.raw.tchagra_browncrowned_1d_id)
            birdCallsexamples(africanfirefinchplay,africanfirefinchstop,R.raw.firefinch_african_1l_id)
            birdCallsexamples(pearlspottedowletplay,pearlspottedowletstop,R.raw.owlet_pearlspotted_1l_id)
            birdCallsexamples(cappedwheatearplay,cappedwheatearstop,R.raw.wheatear_capped_1l_id)
            birdCallsexamples(collardsunbirdplay,collardsunbirdstop,R.raw.sunbird_collared_1l_id)
            birdCallsexamples(orangebreastedbushshrikeplay,orangebreastedbushshrikestop,R.raw.bushshrike_orangebreasted_1l_id)
            birdCallsexamples(greytitplay,greytitstop,R.raw.tit_grey_1l_id)
            birdCallsexamples(brownscrubrobinplay2,brownscrubrobinstop2,R.raw.robin_brownscrub_1d_id)
            birdCallsexamples(southernboubouplay,southernbouboustop,R.raw.boubou_southern_1l_id)
            birdCallsexamples(arrowmarkbabblerplay,arrowmarkbabblerstop,R.raw.babbler_arrowmarked_1l_id)
            birdCallsexamples(blackheadedoriolplay,blackheadedoriolstop,R.raw.oriole_blackheaded_1l_id)
            birdCallsexamples(brownhoodedkingfisherplay,brownhoodedkingfisherstop,R.raw.kingfisher_brownhooded_1d_id)
            birdCallsexamples(choristerrobinplay,choristerrobinstop,R.raw.robinchat_chorister_2l_id)
            birdCallsexamples(rattlingcisticolaplay,rattlingcisticolastop,R.raw.cisticola_ratteling_1l_id)
            birdCallsexamples(darkcappedbulbulplay,darkcappedbulbulstop,R.raw.bulbul_darkcapped_1d_id)
            birdCallsexamples(blackbackpuffbackplay,blackbackpuffbackstop,R.raw.puffback_blackbacked_1d_id)
            birdCallsexamples(helmetedguineafowlplay,helmetedguineafowlstop,R.raw.guineafowl_helmeted_2d_id)
            birdCallsexamples(greygoawaybirdgroundplay,greygoawaybirdgroundstop,R.raw.greygoawaybird_groundalarm_1l_id)
            birdCallsexamples(greygoawaybirdskyplay,greygoawaybirdskystop,R.raw.greygoawaybird_skydalarm_1l_id)
        }
    }
    fun birdCallsexamples(playbtn: ImageView, stopbtn:ImageView, audiocall:Int ){
        playbtn.setOnClickListener {
            mediaplayer!!.playResource(audiocall)
            mediaplayer!!.setViews(btnPlay = playbtn, btnStop = stopbtn)
            playbtn.visibility = GONE
            stopbtn.visibility = VISIBLE
        }
        stopbtn.setOnClickListener {
            mediaplayer!!.stopResource()
            playbtn.visibility = VISIBLE
            stopbtn.visibility = GONE
        }
    }
    private fun scrollTo(view: View) {
        scrollView.post {
            val test = view.top - scrollView.paddingTop
            scrollView.smoothScrollTo(0, test)
        }
    }
    private fun initActionBar(){
        val actionbar = supportActionBar
        actionbar!!.title = "Identifying Bird Calls"
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
        onBackPressedDispatcher.addCallback(this@HowtoIdCalls, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                MyMediaPlayer.instance?.onBack()
                finish()
            }
        })
    }
}