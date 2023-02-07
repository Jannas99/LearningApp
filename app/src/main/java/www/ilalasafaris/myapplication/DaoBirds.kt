package www.ilalasafaris.myapplication

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface DaoBirds {

    // Basic List

    @Insert
    suspend fun insert(savedBirdlist: BasicStart.Data)
    @Delete
    suspend fun delete(savedBirdlist:BasicStart.Data)
    @Query("DELETE FROM `Basic`")
    suspend fun deleteAll()
    @Query("SELECT * FROM 'Basic'")
    fun fetchAllBirds():Flow<List<BasicStart.Data>>
    @Query("SELECT * FROM `Basic` where id = :id")
    fun fetchBirdById(id:Int):Flow<BasicStart.Data>

    //Personal_1

    @Insert
    suspend fun insert_Personal1(savedBirdlist: MainActivity.Data)
    @Delete
    suspend fun delete_Personal1(savedBirdlist: MainActivity.Data)
    @Query("SELECT * FROM `Personal_1` where id = :id")
    fun fetchBirdById_Personal1(id:Int):Flow<MainActivity.Data>
    @Query("SELECT * FROM 'Personal_1'")
    fun fetchAllBirds_Personal1():Flow<List<MainActivity.Data>>
    @Query("DELETE FROM `Personal_1`")
    suspend fun deleteAll_Personal1()

    //Core
    @Insert
    suspend fun insert_Core(savedBirdlist: CoreStart.Data)
    @Delete
    suspend fun delete_Core(savedBirdlist: CoreStart.Data)
    @Query("SELECT * FROM `Core` where id = :id")
    fun fetchBirdById_Core(id:Int):Flow<CoreStart.Data>
    @Query("SELECT * FROM 'Core'")
    fun fetchAllBirds_Core():Flow<List<CoreStart.Data>>
    @Query("DELETE FROM `Core`")
    suspend fun deleteAll_Core()

    //Savanna East
    @Insert
    suspend fun insert_SavannaEast(savedBirdlist: SavannaEastStart.Data)
    @Delete
    suspend fun delete_SavannaEast(savedBirdlist: SavannaEastStart.Data)
    @Query("SELECT * FROM `Savanna_East` where id = :id")
    fun fetchBirdById_SavannaEast(id:Int):Flow<SavannaEastStart.Data>
    @Query("SELECT * FROM 'Savanna_East'")
    fun fetchAll_SavannaEast():Flow<List<SavannaEastStart.Data>>
    @Query("DELETE FROM `Savanna_East`")
    suspend fun deleteAll_SavannaEast()

    //Savanna West
    @Insert
    suspend fun insert_SavannaWest(savedBirdlist: SavannaWestStart.Data)
    @Delete
    suspend fun delete_SavannaWest(savedBirdlist: SavannaWestStart.Data)
    @Query("SELECT * FROM `Savanna_West` where id = :id")
    fun fetchBirdById_SavannaWest(id:Int):Flow<SavannaWestStart.Data>
    @Query("SELECT * FROM 'Savanna_West'")
    fun fetchAll_SavannaWest():Flow<List<SavannaWestStart.Data>>
    @Query("DELETE FROM `Savanna_West`")
    suspend fun deleteAll_SavannaWest()

    //Grassland
    @Insert
    suspend fun insert_Grassland(savedBirdlist: GrasslandStart.Data)
    @Delete
    suspend fun delete_Grassland(savedBirdlist: GrasslandStart.Data)
    @Query("SELECT * FROM `Grassland` where id = :id")
    fun fetchBirdById_Grassland(id:Int):Flow<GrasslandStart.Data>
    @Query("SELECT * FROM 'Grassland'")
    fun fetchAll_Grassland():Flow<List<GrasslandStart.Data>>
    @Query("DELETE FROM `Grassland`")
    suspend fun deleteAll_Grassland()

    //Desert
    @Insert
    suspend fun insert_Desert(savedBirdlist: DesertStart.Data)
    @Delete
    suspend fun delete_Desert(savedBirdlist: DesertStart.Data)
    @Query("SELECT * FROM `Desert` where id = :id")
    fun fetchBirdById_Desert(id:Int):Flow<DesertStart.Data>
    @Query("SELECT * FROM 'Desert'")
    fun fetchAll_Desert():Flow<List<DesertStart.Data>>
    @Query("DELETE FROM `Desert`")
    suspend fun deleteAll_Desert()

    //Karoo
    @Insert
    suspend fun insert_Karoo(savedBirdlist: KarooStart.Data)
    @Delete
    suspend fun delete_Karoo(savedBirdlist: KarooStart.Data)
    @Query("SELECT * FROM `Karoo` where id = :id")
    fun fetchBirdById_Karoo(id:Int):Flow<KarooStart.Data>
    @Query("SELECT * FROM 'Karoo'")
    fun fetchAll_Karoo():Flow<List<KarooStart.Data>>
    @Query("DELETE FROM `Karoo`")
    suspend fun deleteAll_Karoo()

    //Fynbos
    @Insert
    suspend fun insert_Fynbos(savedBirdlist: FynbosStart.Data)
    @Delete
    suspend fun delete_Fynbos(savedBirdlist: FynbosStart.Data)
    @Query("SELECT * FROM `Fynbos` where id = :id")
    fun fetchBirdById_Fynbos(id:Int):Flow<FynbosStart.Data>
    @Query("SELECT * FROM 'Fynbos'")
    fun fetchAll_Fynbos():Flow<List<FynbosStart.Data>>
    @Query("DELETE FROM `Fynbos`")
    suspend fun deleteAll_Fynbos()

}