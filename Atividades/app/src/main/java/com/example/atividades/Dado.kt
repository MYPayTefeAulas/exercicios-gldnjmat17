package com.example.atividades

class Dado(val numLados: Int) {
    private var qtdLados = mutableListOf<Int>()
    private var i = 1

    fun lancar(): String{
        while(i <= numLados){
            qtdLados.add(i)
            i++
        }
        //shuffled embaralha
        //firts retorna o que chegou em primeiro
        return "${qtdLados.shuffled().first()}"
    }

}