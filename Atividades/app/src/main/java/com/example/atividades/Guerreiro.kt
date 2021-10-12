package com.example.atividades

class Guerreiro (val nome: String, val forcaAtaque: Int, val vidaMaxima: Int) {
    var vidaAtual: Int = vidaMaxima

    fun obterBarraVida(): String {
        val barraVida = ""
        return "[$barraVida]"
    }

}