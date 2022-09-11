package com.haimoev.personalaccounting.persistence

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface EntryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEntry(entry: Entry)

    @Update
    suspend fun updateEntry(entry: Entry)

    @Delete
    suspend fun deleteEntry(entry: Entry)

    @Query("SELECT * FROM tbl_entry_dao")
    fun getAllEntries(): LiveData<List<Entry>>

    @Query("SELECT DISTINCT category FROM tbl_entry_dao ")
    fun getAllCategories(): List<String>

}