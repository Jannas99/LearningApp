package www.ilalasafaris.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.launch
import www.ilalasafaris.myapplication.databinding.ActivityManageBinding
import kotlin.collections.ArrayList

class CoreManage : AppCompatActivity() {
    private var binding: ActivityManageBinding? = null
    //Todo 3
    private var lBirdlist:ArrayList<CoreStart.Data> = ArrayList()
    private val mToastDuration = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManageBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setupOnBackPressedCallback()
        initActionBar()

        // This "binding?.rvItemsList1?.visibility = View.GONE" is what stops the "Fix W/RecyclerView: No adapter attached; skipping layout." error. By putting RecyclerView's visibility to View.GONE when the activity is created and then setting it to View.VISIBLE after the adapter has been set.
        binding?.rvItemsList1?.visibility = View.GONE

        val birdDao = (application as BirdApp).db.daoBirds()
        lifecycleScope.launch {
            //Todo 3
            birdDao.fetchAllBirds_Core().collect {
                lBirdlist = ArrayList(it)
                val savednumber = lBirdlist.count().toString()
                binding!!.birdcountsaved.text = savednumber
                setupListofDataIntoRecyclerView(lBirdlist,birdDao)
            }
        }
        clearlist(birdDao)
    }
    //Todo 3
    private fun setupListofDataIntoRecyclerView(birdlist: ArrayList<CoreStart.Data>, birdDao: DaoBirds) {
        val mlist = ArrayList<Birds>()
        for (element in birdlist) {
            val birdsElement = Birds(element.id, element.idbird, element.name, element.sname, element.picture1, element.picture2, element.picture3, element.picture4, element.picture5, element.sound)
            mlist.add(birdsElement)
        }
        if (mlist.isNotEmpty()) {
            val recyclerView = binding?.rvItemsList1
            val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            recyclerView?.layoutManager = layoutManager
            val itemAdapter = AdaptorManage(mlist,this,layoutInflater) { deleteId -> deleteBird(deleteId,birdDao) }
            recyclerView?.adapter = itemAdapter
            recyclerView?.visibility = View.VISIBLE
            binding?.clearList?.visibility = View.VISIBLE
            binding?.noBirdsSaved?.visibility = View.GONE
            binding?.birdcount?.visibility = View.VISIBLE

        }else{
            binding?.clearList?.visibility = View.GONE
            binding?.rvItemsList1?.visibility = View.GONE
            binding?.noBirdsSaved?.visibility = View.VISIBLE
            binding?.birdcount?.visibility = View.GONE
        }
    }
    private fun deleteBird(deleteId: Int,birdDao: DaoBirds) {
        lifecycleScope.launch {
            //Todo 6
            birdDao.fetchBirdById_Core(deleteId).collect {
                deleteRecord(deleteId, birdDao)
            }
        }
    }
    private fun deleteRecord(id: Int, birdDao: DaoBirds) {
        lifecycleScope.launch {
            //Todo 7
            birdDao.delete_Core(CoreStart.Data(id))
        }
        MyMediaPlayer.instance!!.stopResource()
    }
    private fun clearlist(birdDao: DaoBirds){
        binding!!.clearList.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Clear List")
            builder.setMessage("Are you sure you wants to nuke your list")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes") { dialogInterface, _ ->
                lifecycleScope.launch {
                    //Todo 8
                    birdDao.deleteAll_Core()
                    val mToast = Toast.makeText(applicationContext, "List Cleared", Toast.LENGTH_LONG)
                    mDisplayToast(mToast)
                    dialogInterface.dismiss()
                }
            }
            builder.setNegativeButton("No") { dialogInterface, _ ->
                dialogInterface.dismiss()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
            MyMediaPlayer.instance!!.stopResource()
        }
    }

    private fun initActionBar() {
        //Todo 5
        val actionbar = supportActionBar
        actionbar!!.title = "Manage List Core"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeButtonEnabled(true)

    }
    private fun mDisplayToast(toast: Toast){
        Thread{
            for(i in 1..mToastDuration/1000){
                toast.show()
                Thread.sleep(1000)
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
        //Todo 4
        onBackPressedDispatcher.addCallback(this@CoreManage, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                //Todo 4
                val intent = Intent(this@CoreManage, CoreCreate::class.java)
                startActivity(intent)
                finish()
                MyMediaPlayer.instance!!.onBack()
            }
        })
    }
}


