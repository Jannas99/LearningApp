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

class FynbosCreate : AppCompatActivity() {
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
            birdDao.fetchAll_Fynbos().collect {
                val list = ArrayList(it)
                iflistisnotfull(list)
                val savednumber = list.count().toString()
                binding!!.birdcountsaved.text = savednumber
            }
        }
        lBirdlist = DataStored.allSpecies()
        //TODO 2
        val iterator = lBirdlist.slice(setOf(7 ,13 ,19 ,29 ,30 ,33 ,35 ,39 ,44 ,46 ,49 ,63 ,65 ,66 ,67 ,73 ,74 ,75 ,76 ,77 ,78 ,79 ,84 ,88 ,90 ,93 ,95 ,103 ,104 ,105
            ,106 ,107 ,108 ,109 ,111 ,118 ,121 ,124 ,125 ,126 ,131 ,133 ,134 ,136 ,142 ,146 ,148 ,149 ,150 ,153 ,154 ,158 ,159 ,160 ,166 ,170 ,174 ,177 ,178 ,179
            ,185 ,186 ,201 ,202 ,203 ,204 ,206 ,208 ,209 ,213 ,219 ,222 ,229 ,233 ,234 ,235 ,239 ,243 ,244 ,247 ,249 ,251 ,252 ,254 ,255 ,256 ,260 ,263 ,264 ,267
            ,268 ,269 ,272 ,273 ,274 ,276 ,298 ,300 ,301 ,304 ,306 ,310 ,311 ,318 ,320 ,322 ,325 ,329 ,330 ,341 ,346 ,353 ,359 ,360 ,361 ,362 ,363 ,365 ,366 ,367
            ,368 ,371 ,385 ,389 ,391 ,396 ,404 ,425 ,427 ,428 ,432 ,434 ,440 ,442 ,443 ,445 ,446 ,452 ,457 ,462 ,467 ,470 ,475 ,483 ,489 ,494 ,495 ,498 ,503 ,513
            ,517 ,519 ,521 ,523 ,524 ,527 ,530 ,531 ,539 ,543 ,544 ,546 ,547 ,549 ,551 ,554 ,557 ,559 ,562 ,564 ,568 ,572 ,574 ,576 ,580 ,583 ,585 ,586 ,588 ,590
            ,591 ,592 ,595 ,596 ,611 ,612 ,613 ,614 ,615 ,620 ,622 ,629 ,630 ,644 ,651 ,655 ,665 ,666 ,673 ,679 ,682 ,684 ,693 ,698 ,702 ,707 ,716 ,718 ,720  )).iterator()
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
                    birdDao.insert_Fynbos(FynbosStart.Data(idbird = idbird, name = name,sname= sname, picture1 = picture1, picture2 = picture2, picture3 = picture3, picture4 = picture4, picture5 = picture5,  sound = sounds))
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
    private fun iflistisnotfull(birdList: ArrayList<FynbosStart.Data>) {
        binding?.yourSaveList?.setOnClickListener {
            if (birdList.isNotEmpty()) {
                val intent = Intent(this, FynbosListSaved::class.java)
                startActivity(intent)
                MyMediaPlayer.instance!!.onBack()
                finish()
            } else {
                Toast.makeText(this, "No Birds Saved", Toast.LENGTH_SHORT).show()
            }
        }
        binding?.manageList?.setOnClickListener {
            if (birdList.isNotEmpty()) {
                //TODO 5
                val intent = Intent(this, CoreManage::class.java)
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
        actionbar!!.title = "Create List Fynbos"
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