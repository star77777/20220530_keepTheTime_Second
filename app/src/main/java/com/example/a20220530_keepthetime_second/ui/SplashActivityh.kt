package com.example.a20220530_keepthetime_second.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.result.contract.ActivityResultContracts
import com.example.a20220530_keepthetime_second.BaseActivity
import com.example.a20220530_keepthetime_second.R
import com.example.a20220530_keepthetime_second.models.BasicResponse
import com.example.a20220530_keepthetime_second.ui.main.LoginActivity
import com.example.a20220530_keepthetime_second.utils.ContextUtil
import com.example.a20220530_keepthetime_second.utils.GlobalData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashActivityh : BaseActivity() {

    var isTokenOk =false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_activityh)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        apiList.getRequestMyInfo(ContextUtil.getLoginToken(mContext))
            .enqueue(object : Callback<BasicResponse> {
                override fun onResponse(
                    call: Call<BasicResponse>,
                    response: Response<BasicResponse>
                ) {
                    if (response.isSuccessful) {
                        val br = response.body()!!

                        isTokenOk = true
                        GlobalData.loginUser = br.data.user

                    }
                }

                override fun onFailure(call: Call<BasicResponse>, t: Throwable) {

                }

            })
    }
    override fun  setValues() {
        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({

            val myIntent :Intent
            if(isTokenOk && ContextUtil.getAutoLogin(mContext)){
                myIntent=Intent(mContext, LoginActivity::class.java)
            }
            else{
                myIntent =Intent(mContext, LoginActivity::class.java)
            }

            startActivity(myIntent)
            finish()

        },2500)
    }
}