package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityPessoasBinding

class PessoasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPessoasBinding
    private var nome = ""
    private var idade = 0
    private var listaPessoas = mutableListOf<Pessoa>()
    private var indiceAtual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPessoasBinding.inflate(layoutInflater)

        binding.btImprimir.setOnClickListener {
            binding.txtSaida.text = imprimePessoa()
        }

        binding.btSalvar.setOnClickListener {
            nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            idade = binding.txtIdade.text.toString().toInt()
            binding.txtIdade.text.clear()

            val pessoa = Pessoa(nome,idade)
            listaPessoas.add(pessoa)
        }
        setContentView(binding.root)
    }
    fun imprimePessoa(): String {

        if(indiceAtual >= listaPessoas.size){
            indiceAtual = 0
        }
        // Está dando erro quando clico em imprimir próximo, no caso quando não tem nenhum dado salvo
        // Queria que mostrasse uma mensagem informando que nada foi digitado, ou algo do tipo.
        val pessoaAtual = listaPessoas[indiceAtual]
        indiceAtual++
        return "Nome: ${pessoaAtual.nome}, Idade: ${pessoaAtual.idade}"
    }
}