package com.example.mobile_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var btnInputNama : Button
    lateinit var edInputNama : EditText
    lateinit var btnHelp : Button
    lateinit var btnSampleRV : Button
    lateinit var btnSampleCV : Button
    lateinit var btnGetAPI : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tv_main_activity)
        tvMain.text = getString(R.string.text_progmob_main)

        btnInputNama = findViewById(R.id.btn_ambil_nama)
        btnHelp = findViewById(R.id.btn_help)
        edInputNama = findViewById(R.id.ed_input_nama)
        btnSampleRV = findViewById(R.id.btnSampleRV)
        btnSampleCV = findViewById(R.id.btnSampleCV)
        btnGetAPI = findViewById(R.id.btnGetAPI)

        btnInputNama.setOnClickListener ( View.OnClickListener { view ->
            var strTmp = edInputNama.text.toString()
            tvMain.text = strTmp
        } )

        btnHelp.setOnClickListener ( View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity, HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        } )

        btnSampleRV.setOnClickListener ( View.OnClickListener { view ->
            var bundle = Bundle()

            var intent = Intent(this@MainActivity, Samplerecyclerview::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        } )

        btnSampleCV.setOnClickListener ( View.OnClickListener { view ->
            var bundle = Bundle()

            var intent = Intent(this@MainActivity, SampleCardView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        } )

        btnGetAPI.setOnClickListener ( View.OnClickListener { view ->
            var bundle = Bundle()

            var intent = Intent(this@MainActivity, GetAPIActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        } )
    }
}