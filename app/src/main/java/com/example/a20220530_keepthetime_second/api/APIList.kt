package com.example.a20220530_keepthetime_second.api

import com.example.a20220530_keepthetime_second.models.BasicResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIList {

    //    user
    @GET("/user/check")
    fun getRequestUserCheck (
        @Query("type") type : String,
        @Query("value") value : String,
    ) : Call<BasicResponse>
}