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

class ForestCreate : AppCompatActivity() {
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
            birdDao.fetchAll_Forest().collect {
                val list = ArrayList(it)
                iflistisnotfull(list)
                val savednumber = list.count().toString()
                binding!!.birdcountsaved.text = savednumber
            }
        }
        lBirdlist = DataStored.allSpecies()
        val iterator = lBirdlist.slice(setOf(8 ,16 ,17 ,19 ,22 ,34 ,41 ,51 ,52 ,54 ,66 ,70 ,76 ,128 ,139 ,147 ,151 ,152 ,161 ,171 ,204 ,208 ,211 ,245 ,246 ,248 ,259 ,261 ,275 ,278 ,
            282 ,305 ,355 ,357 ,358 ,369 ,384 ,387 ,399 ,426 ,464 ,465 ,469 ,471 ,472 ,477 ,495 ,524 ,527 ,536 ,562 ,563 ,566 ,567 ,569 ,570 ,572 ,620 ,621 ,624 ,
            627 ,633 ,637 ,638 ,641 ,642 ,647 ,652 ,657 ,663 ,675 ,676 ,680 ,682 ,685 ,703 ,719 ,720 )).iterator()
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
                    birdDao.insert_Forest(ForestStart.Data(idbird = idbird, name = name,sname= sname, picture1 = picture1, picture2 = picture2, picture3 = picture3, picture4 = picture4, picture5 = picture5,  sound = sounds))
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
    private fun iflistisnotfull(birdList: ArrayList<ForestStart.Data>) {
        binding?.yourSaveList?.setOnClickListener {
            if (birdList.isNotEmpty()) {
                val intent = Intent(this, ForestListSaved::class.java)
                startActivity(intent)
                MyMediaPlayer.instance!!.onBack()
                finish()
            } else {
                Toast.makeText(this, "No Birds Saved", Toast.LENGTH_SHORT).show()
            }
        }
        binding?.manageList?.setOnClickListener {
            if (birdList.isNotEmpty()) {
                val intent = Intent(this, ForestManage::class.java)
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
        actionbar!!.title = "Create List Forest"
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