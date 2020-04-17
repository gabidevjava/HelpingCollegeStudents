package br.com.guedes.model;

import java.io.Serializable;

public class Fornecedor implements Serializable {
	private static final long serialVersionUID = -7562573821975889774L;
	
	
	private String cnpj;
	private String telefone;
	private String email;
	private String nome;
	
	public Fornecedor() {}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}