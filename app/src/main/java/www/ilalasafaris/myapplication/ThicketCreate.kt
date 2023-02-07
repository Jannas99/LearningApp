package www.ilalasafaris.myapplication

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.launch
import www.ilalasafaris.myapplication.databinding.ActivityCreateBinding
import www.ilalasafaris.myapplication.databinding.ShowPictureBinding

class ThicketCreate : AppCompatActivity() {
    private var binding: ActivityCreateBinding? = null
    private var lBirdlist:ArrayList<Birds> = ArrayList()
    val mlist: MutableList<Birds> = ArrayList()
    private val mToastDuration = 400
    private var mediaPlayer : MyMediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setupOnBackPressedCallback()
        initActionBar()

        val birdDao = (application as BirdApp).db.daoBirds()
        lifecycleScope.launch {
            birdDao.fetchAll_Thicket().collect {
                val list = ArrayList(it)
                iflistisnotfull(list)
                val savednumber = list.count().toString()
                binding!!.birdcountsaved.text = savednumber
            }
        }
        lBirdlist = DataStored.allSpecies()
        //TODO 2
        val iterator = lBirdlist.slice(setOf(7 ,9 ,13 ,19 ,30 ,34 ,39 ,42 ,46 ,50 ,54 ,55 ,66 ,67 ,70 ,72 ,74 ,75 ,76 ,84 ,94 ,95 ,111 ,118 ,121 ,122 ,128 ,129 ,138 ,139 ,
            144 ,147 ,151 ,157 ,161 ,166 ,169 ,170 ,176 ,190 ,197 ,198 ,204 ,206 ,208 ,211 ,213 ,217 ,218 ,224 ,231 ,235 ,239 ,241 ,244 ,256 ,259 ,264 ,265 ,270 ,
            271 ,275 ,278 ,282 ,287 ,299 ,303 ,312 ,318 ,321 ,329 ,330 ,356 ,371 ,380 ,384 ,385 ,387 ,392 ,425 ,436 ,440 ,452 ,455 ,461 ,463 ,465 ,467 ,468 ,469 ,
            471 ,493 ,495 ,498 ,503 ,505 ,517 ,518 ,524 ,525 ,527 ,531 ,534 ,536 ,539 ,543 ,557 ,558 ,560 ,562 ,563 ,564 ,567 ,572 ,578 ,593 ,595 ,597 ,611 ,614 ,
            615 ,620 ,622 ,625 ,629 ,630 ,632 ,633 ,637 ,647 ,652 ,653 ,656 ,665 ,666 ,675 ,682 ,684 ,685 ,686 ,694 ,695 ,696 ,709 ,711 ,718 ,719 ,720 ,721 ,722 )).iterator()
        while (iterator.hasNext()) {
            val i = iterator.next()
            mlist.add(i)
        }
        adaptorSearchSaveData()
    }
    private fun adaptorSearchSaveData() {
        val aabirdname = AdaptorCreate(this, { showPictureId, showNameid -> displayPicture(showPictureId,showNameid) },mediaPlayer,mlist )
        binding?.lvSaved?.adapter = aabirdname
        binding?.lvSaved?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding?.lvSaved?.adapter = aabirdname

        aabirdname.setOnItemClickListener(object :AdaptorCreate.OnItemClickListener{
            override fun onItemClick(position: Int) {
                val birdDao = (application as BirdApp).db.daoBirds()
                val mItem: Birds = mlist[position]
                val idbird = mItem.idbird
                val name = mItem.name
                val sname = mItem.sname
                val picture1 = mItem.picture1
                val picture2 = mItem.picture2
                val picture3 = mItem.picture3
                val picture4 = mItem.picture4
                val picture5 = mItem.picture5
                val sounds = mItem.sound
                lifecycleScope.launch {
                    birdDao.insert_Thicket(ThicketStart.Data(idbird = idbird, name = name,sname= sname, picture1 = picture1, picture2 = picture2, picture3 = picture3, picture4 = picture4, picture5 = picture5,  sound = sounds))
                }
                val mToast = Toast.makeText(applicationContext, "$idbird Saved", Toast.LENGTH_LONG)
                mDisplayToast(mToast)
            }
        })

        binding!!.searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                aabirdname.filter(newText)
                return false
            }
        })
    }
    private fun displayPicture(id: Int, name:String)  {
        val updateDialog = Dialog(this, R.style.Theme_Dialog)
        updateDialog.setCancelable(false)
        val binding = ShowPictureBinding.inflate(layoutInflater)
        updateDialog.setContentView(binding.root)
        binding.imageview.setImageResource(id)
        binding.birdName.text = name
        updateDialog.show()
        updateDialog.setCanceledOnTouchOutside(true)
    }
    private fun iflistisnotfull(birdList: ArrayList<ThicketStart.Data>) {
        binding?.yourSaveList?.setOnClickListener {
            if (birdList.isNotEmpty()) {
                val intent = Intent(this, ThicketListSaved::class.java)
                startActivity(intent)
                MyMediaPlayer.instance!!.onBack()
                finish()
            } else {
                Toast.makeText(this, "No Birds Saved", Toast.LENGTH_SHORT).show()
            }
        }
        binding?.manageList?.setOnClickListener {
            if (birdList.isNotEmpty()) {
                val intent = Intent(this, ThicketManage::class.java)
                startActivity(intent)
                MyMediaPlayer.instance!!.onBack()
                finish()
            } else {
                Toast.makeText(this, "No Birds Saved", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun initActionBar() {
        val actionbar = supportActionBar
        actionbar!!.title = "Create List Thicket"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeButtonEnabled(true)
    }
    private fun mDisplayToast(toast: Toast){
        Thread{
            for(i in 1 downTo mToastDuration/500){
                toast.show()
                Thread.sleep(500)
                toast.cancel()
            }
        }.start()
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
                MyMediaPlayer.instance!!.onBack()
                finish()
            }
        })
    }
}