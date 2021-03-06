package com.example.a20220530_keepthetime_second.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.a20220530_keepthetime_second.BaseActivity
import com.example.a20220530_keepthetime_second.R
import com.example.a20220530_keepthetime_second.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)

   setupEvents()
        setValues()
    }

    override fun setupEvents(){

        binding.logoutBtn.setOnClickListener {
            val myIntent= Intent(mContext,LoginActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
    override fun setValues(){


    }
}