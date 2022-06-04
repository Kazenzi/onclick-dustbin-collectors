package com.example.onclickdustbincolectors

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class feedback : AppCompatActivity() {
    private lateinit var user: EditText
    private lateinit var namba: EditText
    private lateinit var feed:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)


        user=findViewById(R.id.medtfedName)
        namba=findViewById(R.id.medtfedphone)
        feed=findViewById(R.id.medtfeedback)
        var semafeed=findViewById<Button>(R.id.mbtnfeed)

        semafeed.setOnClickListener {

            Toast.makeText(this,"WE WILL GET BACK TO YOU ", Toast.LENGTH_SHORT).show()
        }





}}