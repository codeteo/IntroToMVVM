package com.mvvm.intro.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mvvm.intro.R
import com.mvvm.intro.databinding.ActivityMainBinding
import com.mvvm.intro.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.vm = CalculatorViewModel()
    }
}
