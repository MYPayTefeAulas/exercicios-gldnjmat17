package com.example.atividades

class Arena(val guerreiro1: Guerreiro, val guerreiro2: Guerreiro) {

    fun jogarProximoTurno(){

    }
    fun obterTextoExibicao(): String {
        return """
            Guerreiro 1: ${guerreiro1.nome}
            Vida: ${guerreiro1.obterBarraVida()}
            
            Guerreiro 2: ${guerreiro2.nome}
            Vida: ${guerreiro2}
        """.trimIndent()
    }

}

