package com.william.applista.dao

import com.william.applista.models.Contato

class DaoContatos {
    fun listaContatos():ArrayList<Contato>{
        val list:ArrayList<Contato> = ArrayList()

        list.add( Contato("Lukinhas", "Lukinhas@soviet.com", "1152026589", "Rua Praça Vermelha, 404","#"))
        list.add( Contato("Luketa", "Luketa@soviet.com", "1192748-3037", "Rua Praça Vermelha, 404","#"))
        list.add( Contato("Lukito", "Lukito@soviet.com", "(18)92528-4861", "Rua Praça Vermelha, 404","#"))
        list.add( Contato("Mano Guina", "Guina@soviet.com", "(18) 93188-2917", "Rua Praça Vermelha, 404","#"))
        list.add( Contato("Nengue", "Nengue@soviet.com", "(18) 93158-2917", "Rua Praça Vermelha, 404","#"))
        list.add( Contato("Baguncinha", "Baguncinha@soviet.com", "(18) 93148-2917", "Rua Praça Vermelha, 404","#"))
        list.add( Contato("Gordao", "Gordao@soviet.com", "(18) 93188-2915", "Rua Praça Vermelha, 404","#"))
        list.add( Contato("Edson O Pele", "Pele@soviet.com", "(18) 93188-5917", "Rua Praça Vermelha, 404","#"))

        return list
    }
}