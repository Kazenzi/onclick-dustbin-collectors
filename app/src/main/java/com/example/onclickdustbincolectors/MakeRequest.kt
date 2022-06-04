package com.example.onclickdustbincolectors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MakeRequest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_request)
        val send=findViewById<Button>(R.id.medtsubmit)
        send.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,modeofpay::class.java)
            startActivity(intent)
        })
    }
}