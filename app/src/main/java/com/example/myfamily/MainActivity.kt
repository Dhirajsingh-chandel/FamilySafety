package com.example.myfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    lateinit var bottomNavigationView : BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)


        bottomNavigationView.setOnItemSelectedListener { menuItem ->

            if(menuItem.itemId == R.id.nav_guard_icon) {
                pageInflate(GuardFragment.newInstance())
            }else if(menuItem.itemId == R.id.nav_home_icon){
                pageInflate(HomeFragment.newInstance())
            }
            true
        }
     }

    private fun pageInflate(newFragment: Fragment) {
      val guardInflateTransaction = supportFragmentManager.beginTransaction()
        guardInflateTransaction.replace(R.id.guard_frameLayout,newFragment)
        guardInflateTransaction.commit()
    }
}