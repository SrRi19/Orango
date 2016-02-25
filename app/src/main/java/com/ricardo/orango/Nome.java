package com.ricardo.orango;

/**
 * Created by Ricardo on 25/02/2016.
 */
public class Nome {

    public String nome;
    public String frase;

    public Nome() {
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getFrase(){
        frase = "Olá "+ nome +", eu sou Orango e vim para auxiliar seus estudos...";
        return frase;
    }
}
