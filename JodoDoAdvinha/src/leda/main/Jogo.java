package leda.main;
import java.util.Scanner;

import leda.model.Dados;
import leda.model.MenorMaior;

public class Jogo {
	
	public static void main(String[] args) {
		
		MenorMaior menorMaior = new MenorMaior();
		Dados dados = new Dados();
		final int UM = 1;
		final int DOIS = 2;
		
		System.out.println("----------------Seja Bem vindo---------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("\n");
		System.out.println("Escolha o jogo");
		System.out.println("Digite 1 para: 'Cedulas'");
		System.out.println("Digite 2 para: 'Menor Maior'");
			
		Scanner entrada = new Scanner(System.in);
		int entradaUsuario = entrada.nextInt();
		
		if (entradaUsuario == UM) {
			System.out.println("Digite um valor");
			dados.jogar();
		} 
			
		if(entradaUsuario == DOIS) {
			System.out.println("Digite um valor");
			menorMaior.jogar();
		} else {
			System.out.println("Opção inválida!");
		}
		
		entrada.close();

	}

}
