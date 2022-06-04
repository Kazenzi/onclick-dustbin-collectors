package com.example.onclickdustbincolectors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var splash=findViewById<ImageView>(R.id.imageiv_note)
        splash.alpha=0f
        splash.animate().setDuration(1500).alpha(1f).withEndAction(){
            val i= Intent(this,login::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}