package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivitySorteioDeDadosBinding

class SorteioDeDadosActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySorteioDeDadosBinding

    private val dado1 = Dado(4)
    private val dado2 = Dado(6)
    private val dado3 = Dado(8)
    private val dado4 = Dado(10)
    private val listaDados = mutableListOf<Dado>()


    override fun onCreate(savedInstanceState: Bundle?) {

        setTitle("My Sorteio de Dados")

        binding = ActivitySorteioDeDadosBinding.inflate(layoutInflater)


        binding.btSortear.setOnClickListener {
            binding.txtQuantLados1.text = "${dado1.numLados} lados"
            binding.txtNumDados1.text = dado1.lancar()
            binding.txtQuantLados2.text = "${dado2.numLados} lados"
            binding.txtNumDados2.text = dado2.lancar()
            binding.txtQuantLados3.text = "${dado3.numLados} lados"
            binding.txtNumDados3.text = dado3.lancar()
        }

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}