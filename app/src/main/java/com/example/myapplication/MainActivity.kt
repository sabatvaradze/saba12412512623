package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.viewpage.saba1
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout = findViewById<TabLayout>(R.id.tablelayout)

        val viewPager2 = findViewById<ViewPager2>(R.id.pager2)

        val adapter = saba1(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout,viewPager2){tab,position ->

            when(position) {

                0 -> {

                    tab.text="პირველი"

                }

                1 -> {

                    tab.text = "მეორე"

                }

                2 -> {

                    tab.text = "მესამე"

                }

            }

        }.attach()

    }

}





