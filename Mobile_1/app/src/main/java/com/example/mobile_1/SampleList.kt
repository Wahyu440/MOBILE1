package com.example.mobile_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button

class SampleList : AppCompatActivity() {
    lateinit var btnShowList : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnShowList = findViewById(R.id.btnShowList)
        btnShowList.setOnClickListener ( View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleList, SampleListView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        } )
    }
}