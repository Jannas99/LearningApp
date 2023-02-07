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

class GrasslandCreate : AppCompatActivity() {
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
            birdDao.fetchAll_Grassland().collect {
                val list = ArrayList(it)
                iflistisnotfull(list)
                val savednumber = list.count().toString()
                binding!!.birdcountsaved.text = savednumber
            }
        }
        lBirdlist = DataStored.allSpecies()
        //TODO 2
        val iterator = lBirdlist.slice(setOf(30 ,31 ,51 ,57 ,60 ,61 ,67 ,81 ,83 ,90 ,96 ,101 ,102 ,130 ,193 ,206 ,207 ,222 ,223 ,224 ,240 ,256 ,286 ,313 ,321 ,328 ,334 ,335 ,342 ,347 ,
            353 ,359 ,382 ,385 ,429 ,432 ,433 ,435 ,437 ,448 ,451 ,462 ,476 ,495 ,503 ,514 ,527,534 ,543 ,558 ,575 ,576 ,582 ,615 ,622 ,643 ,644 ,656 ,699 ,710 ,718 ,720 )).iterator()
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
                    birdDao.insert_Grassland(GrasslandStart.Data(idbird = idbird, name = name,sname= sname, picture1 = picture1, picture2 = picture2, picture3 = picture3, picture4 = picture4, picture5 = picture5,  sound = sounds))
                }
                val mToast = Toast.makeText(applicationContext, "$idbird Saved", Toast.LENGTH_LONG)
                mDisplayToast(mToast)
            }
        })

        binding!!.searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener {
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
    private fun iflistisnotfull(birdList: ArrayList<GrasslandStart.Data>) {
        binding?.yourSaveList?.setOnClickListener {
            if (birdList.isNotEmpty()) {
                val intent = Intent(this, GrasslandListSaved::class.java)
                startActivity(intent)
                MyMediaPlayer.instance!!.onBack()
                finish()
            } else {
                Toast.makeText(this, "No Birds Saved", Toast.LENGTH_SHORT).show()
            }
        }
        binding?.manageList?.setOnClickListener {
            if (birdList.isNotEmpty()) {
                val intent = Intent(this, GrasslandManage::class.java)
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
        actionbar!!.title = "Create List Grassland"
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