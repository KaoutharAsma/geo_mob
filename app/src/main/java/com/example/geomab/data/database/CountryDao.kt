package com.example.geomab.data.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CountryDao {
    @Query("Select * from Country")
    fun getCountries(): LiveData<List<Country>>

    @Query("Select * from Country where pk = :id")
    fun getCountry(id:Int):Country

    @Insert(onConflict =OnConflictStrategy.REPLACE)
    fun addCountries(countries: ArrayList<Country>)

    @Query("Select * from Country where seen = 'false' LIMIT 1")
    fun getNotSeen():Country

    @Query("Update Country SET seen ='false'")
    fun SetAllSeen()

    @Query("Update Country SET seen ='true' where pk = :id")
    fun SetSeen(id:Int)




}