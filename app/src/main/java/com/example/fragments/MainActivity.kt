package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aFragment = FragmentA()
        val bFragment = FragmentB()

        supportFragmentManager.beginTransaction().apply {
           replace(R.id.flFragment, aFragment)
            commit()
        }

        btnFragA.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, aFragment)
                addToBackStack(null)
                commit()
            }
        }
        btnFragB.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, bFragment)
                addToBackStack(null )
                commit()
            }
        }
    }


}