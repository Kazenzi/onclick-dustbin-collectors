package com.example.onclickdustbincolectors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class modeofpay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modeofpay)
        val subend = findViewById<Button>(R.id.mbtnsubpay)
        subend.setOnClickListener(View.OnClickListener {

            val intent= Intent(this,end_sect::class.java)
            startActivity(intent)

        })
    }
}