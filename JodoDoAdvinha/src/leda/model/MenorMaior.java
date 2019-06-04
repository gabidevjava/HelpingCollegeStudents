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
			System.out.println("Você encerrou o jogo!!!");
			System.exit(ZERO);
		}

		System.out.println("O jogo Maior Menos começou...");

		while (entradaUsuario > numeroSorteado.get(0) || (entradaUsuario < numeroSorteado.get(0))) {
			
			if(entradaUsuario > numeroSorteado.get(0)) {
				System.out.println("Digite um número: " + entradaUsuario);
				System.out.println("O numero fornecido é MAIOR que o sorteado");
				System.out.println("Tentativas: " + tenativas);
				entradaUsuario = entrada.nextInt();
				tenativas++;
			}
			
			if (entradaUsuario < numeroSorteado.get(0)) {
				System.out.println("Digite um número: " + entradaUsuario);
				System.out.println("O numero fornecido é MENOR que o sorteado");
				System.out.println("Tentativas: " + tenativas);
				entradaUsuario = entrada.nextInt();
				tenativas++;
			}

		}

		if (entradaUsuario == numeroSorteado.get(0)) {
			System.out.println("Você venceu! " + venceu);
			System.out.println("Número sorteado: " + numeroSorteado);
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
