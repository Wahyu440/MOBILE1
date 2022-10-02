package com.example.mobile_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EditData : AppCompatActivity() {
    lateinit var editNama : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_data)
        editNama = findViewById(R.id.editNama)
        val name = intent.getStringExtra("name")
        editNama.text = name
    }
}