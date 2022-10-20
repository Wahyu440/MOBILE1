package com.example.mobile_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.mobile_1.model.ResponseUpdateMahasiswaItem

class UpdateMahasiswa : AppCompatActivity() {
    lateinit var inputNim : EditText
    lateinit var inputNama : EditText
    lateinit var inputEmail : EditText
    lateinit var inputAlamat: EditText
    lateinit var inputNimProg : EditText
    lateinit var inputFoto : EditText
    lateinit var inputNimCari : EditText
    lateinit var btnUpdate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_mahasiswa)
        inputNim = findViewById(R.id.inputNim)
        inputNama = findViewById(R.id.inputNama)
        inputEmail = findViewById(R.id.inputEmail)
        inputAlamat = findViewById(R.id.inputAlamat)
        inputNimProg = findViewById(R.id.inputNimProg)
        inputFoto = findViewById(R.id.inputFoto)
        inputNimCari = findViewById(R.id.inputNimCari)
        btnUpdate = findViewById(R.id.btnUpdate)

        btnUpdate.setOnClickListener(View.OnClickListener { view ->
            val nim = inputNim.text.toString()
            val nama = inputNama.text.toString()
            val email = inputEmail.text.toString()
            val alamat = inputAlamat.text.toString()
            val nim_progmob = inputNimProg.text.toString()
            val nim_cari = inputNimCari.text.toString()
            val foto = inputFoto.text.toString()

            val updateservice = UpdateApiService()
            val MhsData = ResponseUpdateMahasiswaItem(nim_cari = nim_cari,
                nim = nim, nama = nama, email = email, foto = foto, alamat = alamat, nim_progmob = nim_progmob)

            updateservice.UpdateMhs(MhsData){

            }
        })
    }
}