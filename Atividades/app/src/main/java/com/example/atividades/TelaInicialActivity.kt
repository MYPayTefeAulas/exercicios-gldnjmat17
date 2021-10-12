package com.example.atividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityTelaInicialBinding
import com.example.atividades.greeter.Greeter1Activity
import com.example.atividades.pessoas.AgendaActivity
import com.example.atividades.pessoas.PessoasActivity

class TelaInicialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTitle("My Tela Inicial")

        binding = ActivityTelaInicialBinding.inflate(layoutInflater)

        binding.btCalculadora.setOnClickListener {
            val intent = Intent(this@TelaInicialActivity,CalculadoraActivity::class.java)
            startActivity(intent)
        }

        binding.btLista.setOnClickListener {
            val intent = Intent(this@TelaInicialActivity,ListaActivity::class.java)
            startActivity(intent)
        }

        binding.btPessoas.setOnClickListener {
            val intent = Intent(this@TelaInicialActivity, PessoasActivity::class.java)
            startActivity(intent)
        }
        binding.btGreeter.setOnClickListener {
            val intent = Intent(this@TelaInicialActivity,Greeter1Activity::class.java)
            startActivity(intent)
        }
        binding.btAgenda.setOnClickListener {
            val intent = Intent(this@TelaInicialActivity, AgendaActivity::class.java)
            startActivity(intent)
        }
        setContentView(binding.root)
    }
}