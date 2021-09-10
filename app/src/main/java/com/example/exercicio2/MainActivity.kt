package com.example.exercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicio2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btCalcular.setOnClickListener {
            binding.txtResultado.text = calcular()
        }

        val view = binding.root
        setContentView(view)
    }

    fun calcular(): String {
        val num1 = binding.txtNum1.text.toString().toDouble()
        val num2 = binding.txtNum2.text.toString().toDouble()
        var operacao = binding.txtOperacao.text.toString()
        var resultado = ""

        when (operacao){
            "+" -> resultado = (num1 + num2).toString()
            "-" -> resultado = (num1 - num2).toString()
            "*" -> resultado = (num1 * num2).toString()
            "/" -> resultado = (num1 / num2). toString()
            else -> "Operação não suportada"
        }

//        if (operacao == "+") {
//            resultado = (num1 + num2).toString()
//        } else if (operacao == "-") {
//            resultado = (num1 - num2).toString()
//        } else if (operacao == "x") {
//            resultado = (num1 * num2).toString()
//        } else if (operacao == "/") {
//            resultado = (num1 / num2).toString()
//        } else {
//            resultado = "Operação invalida"
//        }
        return resultado.toString()
    }

}
