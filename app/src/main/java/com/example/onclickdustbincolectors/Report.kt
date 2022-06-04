package com.example.onclickdustbincolectors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Report : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)
        val semacomp=findViewById<Button>(R.id.mbtnsubcomp)
        semacomp.setOnClickListener {
            Toast.makeText(this,"WE WILL GET BACK TO YOU ", Toast.LENGTH_SHORT).show()
        }
    }
}