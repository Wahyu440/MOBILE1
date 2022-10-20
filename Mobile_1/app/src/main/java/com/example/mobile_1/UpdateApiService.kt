package com.example.mobile_1

import com.example.mobile_1.model.ResponseUpdateMahasiswa
import com.example.mobile_1.model.ResponseUpdateMahasiswaItem
import com.example.mobile_1.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UpdateApiService {
    fun UpdateMhs(req: ResponseUpdateMahasiswaItem, onResult: (ResponseUpdateMahasiswa) -> Unit){
        val retrofit = NetworkConfig().getService()
        retrofit.updateMahasiswa(req).enqueue(
            object : Callback<ResponseUpdateMahasiswa> {
                override fun onFailure(call: Call<ResponseUpdateMahasiswa>, t: Throwable){
                }
                override fun onResponse(call: Call<ResponseUpdateMahasiswa>, response: Response<ResponseUpdateMahasiswa>){
                    val editMhs = response.body()
                    if (editMhs != null) {
                        onResult(editMhs)
                    }
                }
            }
        )
    }
}