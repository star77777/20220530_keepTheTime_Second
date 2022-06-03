package com.example.a20220530_keepthetime_second.api

import com.example.a20220530_keepthetime_second.models.BasicResponse
import retrofit2.Call
import retrofit2.http.*

interface APIList {

    //    user


    @FormUrlEncoded
    @PUT("/user")
    fun putRequestSignUp(
        @Field("email") email:String,
        @Field("password") pw : String,
        @Field("nick_name") nickname : String,

    ):Call<BasicResponse>

    @GET("/user/check")
    fun getRequestUserCheck (
        @Query("type") type : String,
        @Query("value") value : String,
    ) : Call<BasicResponse>
}