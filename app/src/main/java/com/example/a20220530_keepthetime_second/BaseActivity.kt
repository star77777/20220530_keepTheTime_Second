package com.example.a20220530_keepthetime_second

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity() {

    lateinit var  mContext: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext=this
    }
    abstract fun setupEvents()

    abstract fun setValues()
}