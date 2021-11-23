package com.windy.notetakingapp.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.windy.notetakingapp.utils.Constant

@Entity(tableName = Constant.TABLE_NAME)
data class Notes(
    @PrimaryKey(autoGenerate = true) val id:Long,
    @ColumnInfo(name = "title")val title:String,
    @ColumnInfo(name = "content")val content:String,
    @ColumnInfo(name = "date")val date:String,
) {
}