package com.example.myapplication.viewpage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.saba.BlankFragment
import com.example.myapplication.saba.BlankFragment2
import com.example.myapplication.saba.BlankFragment3

class saba1 (fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        return when(position) {

            0 -> {

                BlankFragment()

            }

            1 -> {

                BlankFragment2()

            }

            2 -> {

                BlankFragment3()

            }

            else -> {

                Fragment()

            }

        }

    }

}
