package com.example.mobile_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile_1.adapter.GetMahasiswaAdapter
import com.example.mobile_1.model.ResponseGetMahasiswaItem
import com.example.mobile_1.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetMahasiswaActivity : AppCompatActivity() {
    lateinit var rvMahasiswaAPI : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_mahasiswa)
        rvMahasiswaAPI = findViewById(R.id.rvMahasiswaAPI)
        registerForContextMenu(rvMahasiswaAPI)
        NetworkConfig().getService().getMahasiswa().enqueue(object : Callback<List<ResponseGetMahasiswaItem>> {
            override fun onFailure(call: Call<List<ResponseGetMahasiswaItem>>, t:
            Throwable) {
                Toast.makeText(this@GetMahasiswaActivity, t.localizedMessage,
                    Toast.LENGTH_SHORT).show()
            }
            override fun onResponse(
                call: Call<List<ResponseGetMahasiswaItem>>,
                response: Response<List<ResponseGetMahasiswaItem>>
            ) {
                rvMahasiswaAPI.apply{
                    layoutManager = LinearLayoutManager(this@GetMahasiswaActivity)
                    adapter = GetMahasiswaAdapter(response.body())
                }
            }
        })
    }
}