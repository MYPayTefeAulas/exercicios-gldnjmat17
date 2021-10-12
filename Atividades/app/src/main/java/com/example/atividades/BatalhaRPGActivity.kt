package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityBatalhaRpgactivityBinding

class BatalhaRPGActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBatalhaRpgactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBatalhaRpgactivityBinding.inflate(layoutInflater)

        binding.btProximoTurno.setOnClickListener {

        }

        setContentView(binding.root)
    }
}