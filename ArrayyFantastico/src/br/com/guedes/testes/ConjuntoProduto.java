package br.com.guedes.testes;

import br.com.guedes.model.Produto;

public class ConjuntoProduto {

	private Produto[] listaDeProduto;

	public ConjuntoProduto() {
		this.listaDeProduto = new Produto[100];
	}

	public void adicionarProduto(Produto produto) {
		for (int i = 0; i < this.listaDeProduto.length; i++) {
			if (this.listaDeProduto[i] == null) {
				this.listaDeProduto[i] = produto;
				break;
			}
		}
	}

	public Produto[] mostrarProduto() {
		for (int i = 0; i < this.listaDeProduto.length; i++) {
			System.out.println("Produto " + listaDeProduto[i].getNome());
		}
		return listaDeProduto;
	}

	public void atualizarProduto() {
		for (int i = 0; i < this.listaDeProduto.length; i++) {
			System.out.println("Produtos " + i);
		}
	}

	public void atualizarPreco() {
		for (int i = 0; i < this.listaDeProduto.length; i++) {
			System.out.println("Produtos " + i);
		}
	}
}
