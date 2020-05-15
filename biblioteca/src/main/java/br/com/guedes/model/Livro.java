package br.com.guedes.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Livro implements Serializable {
    private static final long serialVersionUID = -6285466335430480534L;

    private String titulo;
    private String ISBN;
    private BigDecimal preco;
    private Editora editora;
    private List<Autor> autors;

    public Livro() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Autor> getAutors() {
        return autors;
    }

    public void setAutors(List<Autor> autors) {
        this.autors = autors;
    }
}
