package www.ilalasafaris.myapplication

import android.app.Application

class BirdApp:Application() {
    val db by lazy {
        DatabaseBirds.getInstance(this@BirdApp)
    }
}