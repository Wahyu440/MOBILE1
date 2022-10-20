package com.example.mobile_1.network

import com.example.mobile_1.model.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

class NetworkConfig {
    fun getInterceptor() : OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient
    }
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://kpsi.fti.ukdw.ac.id")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    fun getService() = getRetrofit().create(Users::class.java)
}
interface Users {
    @GET("users")
    fun getUsers(): Call<List<ResponseUsersItem>>
    @GET("api/progmob/mhs/72200440")
    fun getMahasiswa(): Call<List<ResponseGetMahasiswaItem>>
    @POST("api/progmob/mhs/create")
    fun addMahasiswa(@Body req : ResponseAddMahasiswaItem): Call<ResponseAddMahasiswa>
    @PUT("api/progmob/mhs/update")
    fun updateMahasiswa(@Body req : ResponseUpdateMahasiswaItem): Call<ResponseUpdateMahasiswa>
    @DELETE("api/progmob/mhs/delete")
    fun deleteMahasiswa(@Body req : ResponseDeleteMahasiswaItem): Call<ResponseDeleteMahasiswa>

}