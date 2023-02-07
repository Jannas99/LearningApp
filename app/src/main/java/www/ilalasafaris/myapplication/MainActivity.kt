package www.ilalasafaris.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.StrictMode
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.coroutines.launch
import www.ilalasafaris.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Todo This code stops the "W/System: A resource failed to call close. " error. It seems to be the "val birdDao that does not close properly"
        StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().build())

        binding.apply {
            toggle = ActionBarDrawerToggle(this@MainActivity, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            val birdDao = (application as BirdApp).db.daoBirds()
            lifecycleScope.launch {
                birdDao.fetchAllBirds_Personal1().collect {
                    val list = ArrayList(it)
                    yourOwnList(list)
                }
            }
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.aboutThisApp -> { startActivitynotcosingmain(AboutThisApp::class.java)}
                    R.id.howtoIdbirdvisually -> { startActivitynotcosingmain(HowToIdVisually::class.java)}
                    R.id.howtoIdbirdcalls -> { startActivitynotcosingmain(HowtoIdCalls::class.java)}
                    R.id.basicInfo -> { startActivitynotcosingmain(BasiclistInfo::class.java)}
                    R.id.coreInfo -> { startActivitynotcosingmain(CoreListInfo::class.java)}
                    R.id.desert -> { startActivitynotcosingmain(DesertInfo::class.java)}
                    R.id.karoo -> { startActivitynotcosingmain(KarooInfo::class.java)}
                    R.id.savanna -> { startActivitynotcosingmain(SavannaInfo::class.java)}
                    R.id.fynbos -> { startActivitynotcosingmain(FynbosInfo::class.java)}
                    R.id.grassland -> { startActivitynotcosingmain(GrasslandInfo::class.java)}
                    R.id.forest -> { startActivitynotcosingmain(ForestInfo::class.java)}
                    R.id.thicket -> { startActivitynotcosingmain(ThicketInfo::class.java)}
                    R.id.createList -> { startActivitynotcosingmain(BuilderCreate::class.java)}
                }
                true
            }
            basic.setOnClickListener { startActivity(BasicStart::class.java) }
            core.setOnClickListener { startActivity(CoreStart::class.java) }
            savannaeast.setOnClickListener { startActivity(SavannaEastStart::class.java) }
            savannawest.setOnClickListener { startActivity(SavannaWestStart::class.java) }
            grassland.setOnClickListener { startActivity(GrasslandStart::class.java) }
            arid.setOnClickListener { startActivity(DesertStart::class.java) }
            karoo.setOnClickListener { startActivity(KarooStart::class.java) }
            fynbos.setOnClickListener { startActivity(FynbosStart::class.java) }
            forest.setOnClickListener { startActivity(ForestStart::class.java) }
            thicket.setOnClickListener { startActivity(ThicketStart::class.java) }
        }
    }
    private fun startActivity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
        finish()
    }
    private fun startActivitynotcosingmain(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
        // finish()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    private fun yourOwnList(birdList: ArrayList<Data>) {
        binding.savedbtn?.setOnClickListener {
            if (birdList.isNotEmpty()) {

                val intent = Intent(this, BuilderListSaved::class.java)
                startActivity(intent)
                finish()
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("No Birds Saved")
                builder.setMessage("Would you like to create a list")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                builder.setPositiveButton("Yes") { _, _ ->
                    val intent = Intent(this, BuilderCreate::class.java)
                    startActivity(intent)
                    finish()
                }
                builder.setNegativeButton("No") { dialogInterface, _ ->
                    dialogInterface.dismiss()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(false)
                alertDialog.show()
                 }
            }
        }
    @Entity(tableName ="Personal_1")
    data class Data (
        @PrimaryKey(autoGenerate = true)
        val id:Int = 0,
        val idbird:String = "",
        val name: String ="",
        val sname: String="",
        val picture1: Int = 0,
        val picture2: Int = 0,
        val picture3: Int = 0,
        val picture4: Int = 0,
        val picture5: Int = 0,
        val sound: Int = 0
    )
}

//ToDo: Add on Destroy to try and reduce memory of App everytime you move between Activities
//Todo When going into IdbirdsVisially Activity its very slow. it might be the pictures that are to big.
//Todo Make all listviews into RecyclerViews
//ToDo Optimize MainActivity
//Todo  "W/System: A resource failed to call close. " This is caused by not properly closing a resource, in this case the val birdDao.