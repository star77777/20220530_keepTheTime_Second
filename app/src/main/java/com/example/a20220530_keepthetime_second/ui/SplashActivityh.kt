package com.example.a20220530_keepthetime_second.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.a20220530_keepthetime_second.BaseActivity
import com.example.a20220530_keepthetime_second.R
import com.example.a20220530_keepthetime_second.ui.main.LoginActivity

class SplashActivityh : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_activityh)
        setupEvents()
        setValues()
    }

    override fun setValues() {

    }

    override fun setupEvents() {
        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({
            val myIntent :Intent
            myIntent=Intent(mContext, LoginActivity::class.java)
            finish()

        },2500)
    }
}