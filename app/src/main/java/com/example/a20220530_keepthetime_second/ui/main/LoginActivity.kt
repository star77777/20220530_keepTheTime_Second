package com.example.a20220530_keepthetime_second.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.a20220530_keepthetime_second.BaseActivity
import com.example.a20220530_keepthetime_second.R
import com.example.a20220530_keepthetime_second.databinding.ActivityLoginBinding
import com.example.a20220530_keepthetime_second.ui.signup.SignUpActivity

class LoginActivity : BaseActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {
        binding.loginBtn.setOnClickListener {

        }
        binding.signUpBtn.setOnClickListener {

            val myIntent = Intent(mContext, SignUpActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun setValues() {

    }
}