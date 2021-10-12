package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityListaBinding

class ListaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListaBinding

    //Criei duas listas, como property
    private var listaFrutas = listOf("maça","mamão","abacate")
    private var listaVegetais = listOf("pepino", "alface", "pimentão")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTitle("My Feira")

        binding = ActivityListaBinding.inflate(layoutInflater)
        //ao clicar em analisar
        binding.btAnalisar.setOnClickListener {
            //Após digitar e clicar em analisar,
            // será exibido no texto de saida se é fruta ou vegetal,
            // ou algo que está além do banco de dados atual
            binding.txtSaida.text = analisar(binding.txtEntrada.text.toString())
        }
        setContentView(binding.root)
    }

    //método para analisar se é fruta ou vegetal
    fun analisar(entrada:String):String{

        var saida = ""
        var encontrouAlimento = false
        for (fruta in listaFrutas){
            if(fruta == entrada){
                saida = "$entrada é uma fruta"
                encontrouAlimento = true
                break
            }
        }
        for (vegetal in listaVegetais){
            if(vegetal == entrada){
                saida = "$entrada é uma fruta"
                encontrouAlimento = true
                break
            }
        }
        if(!encontrouAlimento) {
            saida = "Não sei o que é $entrada"
        }

    return saida
    }

}