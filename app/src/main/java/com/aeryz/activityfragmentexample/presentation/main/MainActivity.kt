package com.aeryz.activityfragmentexample.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.aeryz.activityfragmentexample.R
import com.aeryz.activityfragmentexample.databinding.ActivityMain2Binding
import com.aeryz.activityfragmentexample.databinding.ActivityMainBinding
import com.aeryz.activityfragmentexample.presentation.fragmentone.FragmentOne
import com.aeryz.activityfragmentexample.presentation.fragmentthree.FragmentThree
import com.aeryz.activityfragmentexample.presentation.fragmenttwo.FragmentTwo

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}