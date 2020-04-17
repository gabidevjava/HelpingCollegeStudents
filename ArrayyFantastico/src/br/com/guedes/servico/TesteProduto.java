package br.com.guedes.servico;

import br.com.guedes.model.Fornecedor;
import br.com.guedes.model.Produto;
import br.com.guedes.testes.ConjuntoProduto;

public class TesteProduto {
	
	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCnpj("1234321");
		fornecedor.setNome("Zé Maria");
		
		Fornecedor fornecedor1 = new Fornecedor();
		fornecedor.setCnpj("543212345");
		fornecedor.setNome("Cláudio");
				
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setFornecedor(fornecedor);
		produto.setNome("TV LC D");
		produto.setValor(3500.0f);
		
		Produto produto1 = new Produto();
		produto.setCodigo(2);
		produto.setFornecedor(fornecedor1);
		produto.setNome("notebook");
		produto.setValor(2000.0F);
		
		Produto produto2 = new Produto();
		produto.setFornecedor(fornecedor1);
		produto.setCodigo(3);
		produto.setNome("impressora");
		produto.setValor(232.0F);
		
		
		ConjuntoProduto teste = new ConjuntoProduto();
		teste.adicionarProduto(produto1);	
		teste.adicionarProduto(produto);
		teste.adicionarProduto(produto2);
		
	//	teste.mostrarProduto();
		
		//System.out.println(teste.getListaDeProduto());
		
		
		System.out.println(produto.getNome());
		System.out.println(produto1.getNome());
		System.out.println(produto2.getNome());
			
	}
}
