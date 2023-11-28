package com.example.myapplication.remote
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.data.database.ItemDatabase
import com.example.myapplication.datamodels.Items
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AppRepository(private val database: ItemDatabase) {

    private val _items = MutableLiveData<List<Items>>()

    val items: LiveData<List<Items>>
        get() = _items

/*    suspend fun getItems() {
        try {
            //val itemData = api.retrofitService.getFact()
            _itemfacts.postValue(itemData)
            insertFactsFromApi(itemData)
            //Log.d(TAG, "getItems Data: $itemData")
        } catch (e: Exception) {
            Log.e(TAG, "Error loading Data from API: $e")
        }
    }

    suspend fun insertFactsFromApi(fact: List<FactsItem>) {
        try {
            withContext(Dispatchers.IO) {
                Log.d(TAG, "insertFactsFromApi Data: $fact")
                database.factsDatabaseDao.insertAll(fact)
                //Log.d("items", "Inserted $fact")
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error inserting facts from API into database: $e")
        }
    }

    suspend fun getAll() {
        try {
            val items = withContext(Dispatchers.IO) {
                database.factsDatabaseDao.getAllItems()
            }
            Log.d("msgtaggetall", "getall: $items")
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching all items: $e")
        }
    }*/
}
