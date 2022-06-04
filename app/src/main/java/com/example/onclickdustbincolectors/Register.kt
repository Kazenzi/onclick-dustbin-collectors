package com.example.onclickdustbincolectors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Register : AppCompatActivity() {
    private lateinit var medtname: EditText
    private lateinit var medtId: EditText
    private lateinit var medtHouseno: EditText
    private lateinit var medtphone: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val createaccount=findViewById<Button>(R.id.mbtnReg)

        createaccount.setOnClickListener(View.OnClickListener {


            medtname = findViewById<EditText>(R.id.medtname)
            medtId = findViewById<EditText>(R.id.medtId)
            medtHouseno = findViewById<EditText>(R.id.medtHouseno)
            medtphone = findViewById<EditText>(R.id.medtphone)

            val regname = medtname.text.toString().trim()
            val regid = medtId.text.toString().trim()
            val reghouse = medtHouseno.text.toString().trim()
            val regphone = medtphone.text.toString().trim()

            if (regname.isEmpty()) {
                medtname.error = "NAME REQUIRED"
                return@OnClickListener
            } else
                if (regid.isEmpty()) {
                    medtId.error = "ID REQUIRED"
                    return@OnClickListener
                } else
                    if (reghouse.isEmpty()) {
                        medtHouseno.error = "HOUSENO REQUIRED"
                        return@OnClickListener
                    } else
                        if (regphone.isEmpty()) {
                            medtphone.error = "PHONE NUMBER  REQUIRED"
                            return@OnClickListener
                        } else
                            nextp()



        })


    }
    private fun nextp(){
        val createacc=findViewById<TextView>(R.id.mbtnReg)
        createacc.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,login::class.java)
            startActivity(intent)
        })


    }
}