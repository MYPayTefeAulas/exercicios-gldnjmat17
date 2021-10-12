package com.example.atividades.pessoas

class Pessoa(val nome: String, val idade: Int? = null, val telefone: String? = null) {

    fun verificaNomeVazio(): Boolean{
        return nome == ""
    }
    fun verificaTelefoneVazio():Boolean{
        return telefone == ""
    }
}