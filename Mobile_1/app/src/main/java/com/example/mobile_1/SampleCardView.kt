package com.example.mobile_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile_1.adapter.PetaniAdapterCv
import com.example.mobile_1.model.Petani

class SampleCardView : AppCompatActivity() {
    lateinit var cvSample : RecyclerView
    lateinit var petaniAdapterCv: PetaniAdapterCv
    lateinit var lPetani: List<Petani>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)

        cvSample = findViewById(R.id.cvLatihan)

        lPetani = listOf(
            Petani(user="D01",nama="Adindaa",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
            Petani(user="D02",nama="Anabele",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
            Petani(user="D03",nama="Arditoo",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
            Petani(user="D04",nama="Adam",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
            Petani(user="D05",nama="Arfin",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
        )
        petaniAdapterCv = PetaniAdapterCv(lPetani)

        cvSample.apply{
            layoutManager = LinearLayoutManager(this@SampleCardView)
            adapter=petaniAdapterCv

        }
    }
}