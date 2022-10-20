package com.example.mobile_1.model

import com.google.gson.annotations.SerializedName

data class ResponseGetMahasiswa(

	@field:SerializedName("ResponseGetMahasiswa")
	val responseGetMahasiswa: List<ResponseGetMahasiswaItem?>? = null
)

data class ResponseGetMahasiswaItem(

	@field:SerializedName("nim")
	val nim: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("foto")
	val foto: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("alamat")
	val alamat: String? = null
)
