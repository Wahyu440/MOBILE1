package com.example.mobile_1.model

import com.google.gson.annotations.SerializedName

data class ResponseDeleteMahasiswa(

    @field:SerializedName("ResponseAddMahasiswa")
    val responseDeleteMahasiswa: List<ResponseDeleteMahasiswaItem?>? = null
)

data class ResponseDeleteMahasiswaItem(

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("nim_progmob")
    val nim_progmob: String? = null

)