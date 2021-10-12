package com.example.atividades.pessoas

class Agenda() {
    private val listaDeContatos = mutableListOf<Pessoa>()
    private var indiceAtual = 0

    fun salvarContato(novoContato: Pessoa){
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

    fun retornarNumeroDeContatos(): Int{
        return listaDeContatos.size
    }

    fun checarVazio(): Boolean {
        return listaDeContatos.isEmpty()
    }

    fun testarRepetido(contato: Pessoa): Boolean {
        var resultado : Boolean = false
        //Quero andar pelas posições da lista, devo usar for
        for (lista in listaDeContatos){
            if(lista.telefone == contato.telefone){
                resultado = true
                break
            }
        }
        return resultado
    }

    fun testarPesquisa(contato: Pessoa):Boolean {
        var resultado : Boolean = false

        for (lista in listaDeContatos){
            if((lista.nome == contato.nome)||(lista.telefone == contato.telefone)){
                resultado = true
                break
            }
        }
        return resultado
    }
    fun testarPesquisaNome (contato: Pessoa):Boolean {
        var resultado : Boolean = false

        for (lista in listaDeContatos){
            if((lista.nome == contato.nome)){
                resultado = true
                break
            }
        }
        return resultado
    }

    fun imprimirNome(contato: Pessoa): String{
        var encontrou: String = ""

        for (lista in listaDeContatos) {
            if (lista.nome == contato.nome || lista.telefone == contato.telefone) {
                encontrou = lista.nome
                break
            }
        }
        return encontrou
    }

    fun imprimirTelefone(contato: Pessoa): String{
        var encontrou : String = ""

        for (lista in listaDeContatos){
            if(lista.telefone == contato.telefone || lista.nome == contato.nome){
                encontrou = lista.telefone.toString()
                break
            }
        }
        return encontrou
    }

}