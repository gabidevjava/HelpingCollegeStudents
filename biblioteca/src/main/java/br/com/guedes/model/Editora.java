package br.com.guedes.model;

import java.io.Serializable;

public class Editora implements Serializable {
    private static final long serialVersionUID = 5980257859158628842L;

    private String nome;
    private String site;

    public Editora() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
