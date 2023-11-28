package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController


        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            val navController = findNavController(R.id.navHostFragment)
            when (item.itemId) {
                R.id.homeFragment -> {
                    if (navController.currentDestination?.id != R.id.homeFragment) {
                        navController.navigate(R.id.homeFragment)
                    }
                }
                R.id.searchFragment -> {
                    if (navController.currentDestination?.id != R.id.searchFragment) {
                        navController.navigate(R.id.searchFragment)
                    }
                }
                R.id.cartFragment -> {
                    if (navController.currentDestination?.id != R.id.cartFragment) {
                        navController.navigate(R.id.cartFragment)
                    }
                }
                else -> {
                    Log.d("activityMainBottomNav","Error in BottomNavigation")
                }
            }
            true
        }
    }
}
