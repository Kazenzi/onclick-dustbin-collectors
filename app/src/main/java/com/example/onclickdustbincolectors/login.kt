package com.example.onclickdustbincolectors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.onclickdustbincolectors.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    private lateinit var medtname: EditText
    private lateinit var medtId: EditText
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val lg=findViewById<Button>(R.id.mbtnlogin)
        lg.setOnClickListener(View.OnClickListener {
            medtname = findViewById<EditText>(R.id.medtenternae)
            medtId = findViewById<EditText>(R.id.medtenterid)

            val username = medtname.text.toString().trim()
            val userid = medtId.text.toString().trim()


            if (username.isEmpty()) {
                medtname.error = "NAME REQUIRED"
                return@OnClickListener
            } else
                if (userid.isEmpty()) {
                    medtId.error = "ID REQUIRED"
                    return@OnClickListener

                }else
                    newtab()
//
        })
        val newperson=findViewById<TextView>(R.id.mtvcreateone)
        newperson.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,Register::class.java)
            startActivity(intent)
        })
//        lg.setOnClickListener {
//            Toast.makeText(this,"login",Toast.LENGTH_SHORT).show()
//        }


    }
    private fun newtab() {
        val lg = findViewById<Button>(R.id.mbtnlogin)
        lg.setOnClickListener(View.OnClickListener {

            val intent= Intent(this,dashboard::class.java)
            startActivity(intent)

        })

    }
}