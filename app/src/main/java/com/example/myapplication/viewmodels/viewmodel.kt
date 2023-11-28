package com.example.myapplication.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.myapplication.data.database.getItemDatabase
import com.example.myapplication.remote.AppRepository

class viewModel(application: Application) : AndroidViewModel(application) {

    private val itemDatabase = getItemDatabase(application)
    private val repository = AppRepository(itemDatabase)

    val items = repository.items

/*    fun loadData() {
        viewModelScope.launch {
            repository.getAll()
        }
    }*/
}
