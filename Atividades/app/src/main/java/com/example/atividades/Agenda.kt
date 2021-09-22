package com.example.atividades

import com.example.atividades.Pessoa

class Agenda() {
    private val listaDeContatos = mutableListOf<Pessoa>()
    private var indiceAtual = 0

    fun salvarContato(novoContato:Pessoa){
        listaDeContatos.add(novoContato)
    }
    fun proximoNome(): String {
        if(indiceAtual==listaDeContatos.size){
            indiceAtual = 0
    }
        var contatoAtual = listaDeContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.nome}"
    }
    fun proximoTelefone(): String {
        indiceAtual -= 1
        if(indiceAtual==listaDeContatos.size){
            indiceAtual = 0
        }
        var contatoAtual = listaDeContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.telefone}"
    }
    fun deletarContato(){
        if(indiceAtual >= 1){
            indiceAtual -= 1
            val contatoAtual = listaDeContatos[indiceAtual]
            listaDeContatos.remove(contatoAtual)
        } else {
            var contatoAtual = listaDeContatos[indiceAtual]
            listaDeContatos.remove(contatoAtual)
        }

    }
//    fun getProximoContato(): String {
//        return ""
//    }

    fun retornarNumeroDeContatos(): Int{
        return listaDeContatos.size
    }

}