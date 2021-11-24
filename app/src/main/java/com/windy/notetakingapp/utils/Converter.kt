package com.windy.notetakingapp.utils

import androidx.room.TypeConverter
import java.util.*

class Converter {

    @TypeConverter
    fun dateToLong(date:Date)= date.time

    @TypeConverter
    fun longToDate(long:Long) = Date(long)
}