package br.com.guedes.model;

import java.io.Serializable;

public class Produto implements Serializable {
	private static final long serialVersionUID = 9075939773246548551L;
	
	private Integer codigo;
	private String nome;
	private Float valor;
	private Fornecedor fornecedor;
	
	public Produto() {}
	
	public Float atualizarPreco(Float porcentagem) {
		Float percentual = porcentagem / 100.0f; 
		setValor(percentual + getValor());
		return getValor();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}