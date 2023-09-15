package com.aeryz.activityfragmentexample.presentation.otheractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aeryz.activityfragmentexample.R
import com.aeryz.activityfragmentexample.databinding.ActivityMainBinding
import com.aeryz.activityfragmentexample.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {

    private val binding : ActivityOtherBinding by lazy {
        ActivityOtherBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getIntentData()
    }

    private fun getIntentData() {
        val name = intent?.getStringExtra(ARGS_NAME).orEmpty()
        val age = intent?.getIntExtra(ARGS_AGE, 0) ?: 0
        Toast.makeText(this, "$name : $age", Toast.LENGTH_SHORT).show()
    }
    
    companion object {
        const val ARGS_NAME = "ARGS_NAME"
        const val ARGS_AGE = "ARGS_AGE"
    }
}