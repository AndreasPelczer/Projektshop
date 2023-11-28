package com.example.myapplication.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.myapplication.data.database.getItemDatabase
import com.example.myapplication.remote.ShopRepository

class ShopViewModel(application: Application) : AndroidViewModel(application) {

    private val itemDatabase = getItemDatabase(application)
    private val repository = ShopRepository(itemDatabase)

    val items = repository.product

/*    fun loadData() {
        viewModelScope.launch {
            repository.getAll()
        }
    }*/
}
