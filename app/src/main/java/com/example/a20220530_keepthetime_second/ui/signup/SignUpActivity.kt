package com.example.a20220530_keepthetime_second.ui.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.a20220530_keepthetime_second.BaseActivity
import com.example.a20220530_keepthetime_second.R
import com.example.a20220530_keepthetime_second.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity() {
    lateinit var binding : ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil.setContentView(this,R.layout.activity_sign_up)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}