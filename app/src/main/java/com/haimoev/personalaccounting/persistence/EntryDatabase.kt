package com.haimoev.personalaccounting.persistence

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Entry::class], version = 1)
abstract class EntryDatabase : RoomDatabase() {
    abstract fun entryDao(): EntryDao
}