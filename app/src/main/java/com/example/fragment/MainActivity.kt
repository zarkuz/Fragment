package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnf1: Button = findViewById(R.id.fragment1)
        val btnf2: Button = findViewById(R.id.fragment2)
        val btnf3: Button = findViewById(R.id.fragment3)
        var fm = supportFragmentManager
        var ft = fm.beginTransaction()
        ft
                .add(R.id.fragmentdisini, Fragment1())
                .commit()
        btnf1.setOnClickListener {
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()
            ft
                    .replace(R.id.fragmentdisini, Fragment1())
                    .commit()
        }
        btnf2.setOnClickListener {
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()
            ft
                    .replace(R.id.fragmentdisini, Fragment2())
                    .commit()
        }

        btnf3.setOnClickListener {
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()
            ft
                    .replace(R.id.fragmentdisini, Fragment3())
                    .commit()
        }


    }
}