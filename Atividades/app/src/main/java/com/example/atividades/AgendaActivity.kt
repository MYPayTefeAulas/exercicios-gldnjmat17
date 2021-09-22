package com.example.atividades

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaBinding
    private val agenda = Agenda()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgendaBinding.inflate(layoutInflater)

        binding.btSalvar.setOnClickListener {
            val nome = binding.txtNome.text.toString()
            val telefone = binding.txtTelefone.text.toString()
            val novoContato = Pessoa(nome,idade = 0,telefone)
            agenda.salvarContato(novoContato)
            binding.txtNome.text.clear()
            binding.txtTelefone.text.clear()
        }

        binding.btProximo.setOnClickListener {
            if(agenda.retornarNumeroDeContatos()==0){
                binding.txtSaida.setTextColor(Color.rgb(212,12,12))
                binding.txtSaida.text = "Nenhum contato salvo"
            } else {
                binding.txtNome.setText(agenda.proximoNome())
                binding.txtTelefone.setText(agenda.proximoTelefone())
            }
        }

        binding.btDeletar.setOnClickListener {
            if(agenda.retornarNumeroDeContatos()==0){
                binding.txtSaida.setTextColor(Color.rgb(212,12,12))
                binding.txtSaida.text = "Nenhum contato salvo"
            } else {
            agenda.deletarContato()
                binding.txtNome.text.clear()
                binding.txtTelefone.text.clear()
            }
        }
        setContentView(binding.root)

    }

}