package br.com.guedes.servico;

import br.com.guedes.model.Produto;

public class ConjuntoProduto {

	private Produto[] listaDeProduto;

	public ConjuntoProduto() {
		this.listaDeProduto = new Produto[100];
	}

	public void adicionarProduto(Produto produto) {
		for (int i = 0; i < this.listaDeProduto.length; i++) {
			if (this.listaDeProduto[i] == null) {
				if (!contemProduto(produto)) {
					this.listaDeProduto[i] = produto;
					break;
				} else {
					try {
						throw new Exception("Não aceitamos Produto com código repetido");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public boolean contemProduto(Produto produto) {
		for (int i = 0; i < this.listaDeProduto.length; i++) {
			if (produto == this.listaDeProduto[i]) {
				return true;
			}
		}
		return false;
	}

	public Produto[] mostrarProduto() {
		for (int i = 0; i < this.listaDeProduto.length; i++) {
			System.out.println("Produto " + listaDeProduto[i]);
		}
		return listaDeProduto;
	}

	public void atualizarProduto(int posicao, Produto novoProduto) {
		listaDeProduto[posicao] = novoProduto;
	}
}