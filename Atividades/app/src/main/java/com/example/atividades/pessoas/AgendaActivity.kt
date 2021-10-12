package com.example.atividades.pessoas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaBinding
    private val agenda = Agenda()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTitle("My Agenda")

        binding = ActivityAgendaBinding.inflate(layoutInflater)

        binding.btSalvar.setOnClickListener {

            val nome = binding.txtNome.text.toString()
            val telefone = binding.txtTelefone.text.toString()
            val novoContato = Pessoa(nome, idade = 0, telefone)

            if (novoContato.verificaNomeVazio() && novoContato.verificaTelefoneVazio()) {
                binding.txtSaida.text = "Erro, digite o nome e o telefone do contato"
                binding.txtSaida.setTextColor(Color.rgb(212, 12, 12))
            } else if (novoContato.verificaNomeVazio()) {
                binding.txtSaida.text = "Erro, digite o nome do contato"
                binding.txtSaida.setTextColor(Color.rgb(212, 12, 12))
            } else if (novoContato.verificaTelefoneVazio()) {
                binding.txtSaida.text = "Erro, digite o telefone do contato"
                binding.txtSaida.setTextColor(Color.rgb(212, 12, 12))
            } else if (agenda.testarRepetido(novoContato)) {
                binding.txtSaida.text = "Esse contato já existe"
                binding.txtSaida.setTextColor(Color.rgb(212, 12, 12))
            } else {
                agenda.salvarContato(novoContato)
                binding.txtNome.text.clear()
                binding.txtTelefone.text.clear()
                binding.txtSaida.text = "Contato salvo"
                binding.txtSaida.setTextColor(Color.rgb(12, 212, 12))
            }
        }

        binding.btProximo.setOnClickListener {
//            if(agenda.retornarNumeroDeContatos()==0){
//                binding.txtSaida.setTextColor(Color.rgb(212,12,12))
//                binding.txtSaida.text = "Nenhum contato salvo"
//            } else {
//                binding.txtNome.setText(agenda.proximoNome())
//                binding.txtTelefone.setText(agenda.proximoTelefone())
//            }
            if(agenda.checarVazio()){
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

        binding.btPesquisar.setOnClickListener {
            var nomePesquisa = binding.txtPesquisa.text.toString()
            var telefonePesquisa = binding.txtPesquisa.text.toString()
            val contatoPesquisa = Pessoa(nomePesquisa,idade = null,telefonePesquisa)


            if (agenda.checarVazio()){
                binding.txtSaida.text = "Não há nenhum contato na agenda"
                binding.txtSaida.setTextColor(Color.rgb(212,12,12))
            } else if (!agenda.testarPesquisa(contatoPesquisa)){
                binding.txtSaida.text = "Contato não encontrado"
                binding.txtSaida.setTextColor(Color.rgb(212,12,12))
            } else {
                binding.txtSaida.text = "Contato encontrado"
                binding.txtNome.setText(agenda.imprimirNome(contatoPesquisa))
                binding.txtTelefone.setText(agenda.imprimirTelefone(contatoPesquisa))
                binding.txtSaida.setTextColor(Color.rgb(12,212,12))
            }
        }

        setContentView(binding.root)

    }
    companion object {
        val corVermelha : Int = Color.rgb(212,12,12)
        val corVerde : Int = Color.rgb(12,212,12)
    }

}