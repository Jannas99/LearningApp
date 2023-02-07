package www.ilalasafaris.myapplication

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities =
[
    BasicStart.Data::class,
    MainActivity.Data::class,
    CoreStart.Data::class,
    SavannaEastStart.Data::class,
    SavannaWestStart.Data::class,
    GrasslandStart.Data::class,
    KarooStart.Data::class,
    FynbosStart.Data::class,
    ForestStart.Data::class,
    DesertStart.Data::class

], version = 22)


abstract class DatabaseBirds:RoomDatabase() {

    abstract fun daoBirds():DaoBirds

    companion object{

        @Volatile
        private var INSTANCE:DatabaseBirds? = null

        fun getInstance(context: Context):DatabaseBirds{

            synchronized(this){
                var instance = INSTANCE

                if (instance == null){
                    instance = Room.databaseBuilder(context.applicationContext, DatabaseBirds::class.java, "Birds database",).fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}