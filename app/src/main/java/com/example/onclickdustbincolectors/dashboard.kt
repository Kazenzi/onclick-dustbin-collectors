package com.example.onclickdustbincolectors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val chukuauchafu=findViewById<Button>(R.id.mbtnorder)
        chukuauchafu.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,MakeRequest::class.java)
            startActivity(intent)
        })
        val malipo=findViewById<Button>(R.id.mbtnpay)
        malipo.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,modeofpay::class.java)
            startActivity(intent)
        })
        val toamaoni=findViewById<Button>(R.id.mbtnfeedback)
        toamaoni.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,feedback::class.java)
            startActivity(intent)
        })
        val misemo=findViewById<Button>(R.id.mbtncomplain)
        misemo.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,Report::class.java)
            startActivity(intent)
        })
        val endsess=findViewById<Button>(R.id.mbtnend)
        endsess.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,end_sect::class.java)
            startActivity(intent)
        })
    }
}