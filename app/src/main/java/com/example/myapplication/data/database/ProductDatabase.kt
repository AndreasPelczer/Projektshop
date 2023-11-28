package com.example.myapplication.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.datamodels.Product

@Database(entities = [Product::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {
    abstract val dao: ProductDatabaseDao
}

private lateinit var INSTANCE : ItemDatabase

fun getItemDatabase(context: Context): ItemDatabase {

    synchronized(ItemDatabase::class.java){
        if(!::INSTANCE.isInitialized){
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                ItemDatabase::class.java,
                "item_table"
            ).build()
        }
        return INSTANCE
    }
}