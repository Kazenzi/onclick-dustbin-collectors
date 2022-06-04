package com.example.onclickdustbincolectors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onclickdustbincolectors.databinding.ActivityEndSectBinding

class end_sect : AppCompatActivity() {
    lateinit var binding:ActivityEndSectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityEndSectBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ltanimation.playAnimation()
    }
}