package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityTelaInicialV2Binding

class TelaInicial_V2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaInicialV2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaInicialV2Binding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}