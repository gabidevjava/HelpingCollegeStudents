package br.com.guedes.testes;

import br.com.guedes.model.Fornecedor;
import br.com.guedes.model.Produto;
import br.com.guedes.servico.ConjuntoProduto;

public class TesteProduto {
	
	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCnpj("1234321");
		fornecedor.setNome("Zé Maria");
		
		Fornecedor fornecedor1 = new Fornecedor();
		fornecedor1.setCnpj("543212345");
		fornecedor1.setNome("Cláudio");
				
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setFornecedor(fornecedor);
		produto.setNome("TV LC D");
		produto.setValor(3500.0f);
		
		Produto produto1 = new Produto();
		produto1.setCodigo(2);
		produto1.setFornecedor(fornecedor1);
		produto1.setNome("notebook");
		produto1.setValor(2000.0F);
		
		Produto produto2 = new Produto();
		produto2.setFornecedor(fornecedor1);
		produto2.setCodigo(3);
		produto2.setNome("impressora");
		produto2.setValor(232.0F);
		produto2.atualizarPreco(150.0f);
		
		System.out.println(produto2.getValor());				
	}
}