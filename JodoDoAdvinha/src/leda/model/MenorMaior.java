package leda.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MenorMaior implements JogoInterface {

	private List<Integer> numeroSorteado = new ArrayList<Integer>();
	private final int ZERO = 0;
	private int tenativas = 0;
	private boolean venceu = true;

	@Override
	public void resetar() {
		Random random = new Random();
		numeroSorteado.add(random.nextInt(100) + 1);
	}

	@Override
	public Placar jogar() {
		resetar();
		Scanner entrada = new Scanner(System.in);
		int entradaUsuario = entrada.nextInt();

		if (entradaUsuario == ZERO) {
			System.out.println("Voc� encerrou o jogo!!!");
			System.exit(ZERO);
		}

		System.out.println("O jogo Maior Menos come�ou...");

		while (entradaUsuario > numeroSorteado.get(0) || (entradaUsuario < numeroSorteado.get(0))) {
			
			if(entradaUsuario > numeroSorteado.get(0)) {
				System.out.println("Digite um n�mero: " + entradaUsuario);
				System.out.println("O numero fornecido � MAIOR que o sorteado");
				System.out.println("Tentativas: " + tenativas);
				entradaUsuario = entrada.nextInt();
				tenativas++;
			}
			
			if (entradaUsuario < numeroSorteado.get(0)) {
				System.out.println("Digite um n�mero: " + entradaUsuario);
				System.out.println("O numero fornecido � MENOR que o sorteado");
				System.out.println("Tentativas: " + tenativas);
				entradaUsuario = entrada.nextInt();
				tenativas++;
			}

		}

		if (entradaUsuario == numeroSorteado.get(0)) {
			System.out.println("Voc� venceu! " + venceu);
			System.out.println("N�mero sorteado: " + numeroSorteado);
			System.out.println("Quantidade de tentativas: " + tenativas);
		}
		
		entrada.close();
		return null;
	}

	@Override
	public String obterNomeJogo() {
		return "Menor Maior";
	}

}
