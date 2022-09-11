package com.haimoev.personalaccounting.persistence

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_entry_dao")
data class Entry(
   @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var title: String,
    var comment: String?,
    var category: String,
    var amount: Double = 0.0,
    val currency: String,
    var date: Int
)