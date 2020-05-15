package br.com.guedes.model;

import java.io.Serializable;

public class Autor implements Serializable {
    private static final long serialVersionUID = -3194204842613935161L;

    private String nome;
    private String sobrenome;

    public Autor() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
