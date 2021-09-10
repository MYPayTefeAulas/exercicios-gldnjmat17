package com.example.exercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicio2.databinding.ActivityListasBinding

class ListasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListasBinding

    private val listaFrutas = listOf("maçã", "mamão", "abacate")
    private val listaVegetais = listOf("pepino", "alface", "pimentão")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListasBinding.inflate(layoutInflater)

        binding.btAnalisar.setOnClickListener {
            binding.txtSaida.text = analisar(binding.txtEntrada.text.toString())
        }

        setContentView(binding.root)
    }

    fun analisar(entrada: String): String {
        var saida = ""

        var encontrouAlimento = false

        for(fruta in listaFrutas) {
            if(fruta == entrada) {
                fruta == entrada
                saida = "É uma fruta"
                encontrouAlimento = true
                break
            }
        }
        for(vegetal in listaVegetais) {
            if(vegetal == entrada){
                vegetal == entrada
                saida = "É um vegetal"
                encontrouAlimento = true
                break
            }
        }

        if(!encontrouAlimento) {
            saida = "Não sei o que é isso!"
        }

        return "$saida"
    }
}