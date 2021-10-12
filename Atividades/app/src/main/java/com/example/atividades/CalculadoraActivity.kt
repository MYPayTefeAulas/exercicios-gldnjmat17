package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityCalculadoraBinding


class CalculadoraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculadoraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTitle("My Calculadora")

        binding = ActivityCalculadoraBinding.inflate(layoutInflater)

        binding.btAdicao.setOnClickListener {
            binding.txtSaida.text = adicao()
        }
        binding.btSubtracao.setOnClickListener {
            binding.txtSaida.text = subtracao()
        }
        binding.btMultiplicacao.setOnClickListener {
            binding.txtSaida.text = multiplicacao()
        }
        binding.btDivisao.setOnClickListener {
            binding.txtSaida.text = divisao()
        }

        setContentView(binding.root)
    }

    fun adicao(): String{
        val num1 = binding.txtNum1.text.toString().toDouble()
        val num2 = binding.txtNum2.text.toString().toDouble()
        val resultado = num1 + num2
        return resultado.toString()
    }
    fun subtracao(): String{
        val num1 = binding.txtNum1.text.toString().toDouble()
        val num2 = binding.txtNum2.text.toString().toDouble()
        val resultado = num1 - num2
        return resultado.toString()
    }
    fun multiplicacao(): String{
        val num1 = binding.txtNum1.text.toString().toDouble()
        val num2 = binding.txtNum2.text.toString().toDouble()
        val resultado = num1 * num2
        return resultado.toString()
    }
    fun divisao(): String{
        val num1 = binding.txtNum1.text.toString().toDouble()
        val num2 = binding.txtNum2.text.toString().toDouble()
        val resultado = num1 / num2
        return resultado.toString()
    }
}