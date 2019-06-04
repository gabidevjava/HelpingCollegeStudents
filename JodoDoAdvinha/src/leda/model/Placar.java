package leda.model;
import java.util.List;

public class Placar {
	
	private boolean venceu;
	private int tentativas;
	private List<Integer> numeroSorteado;
	
	public boolean isVenceu() {
		return venceu;
	}

	public void setVenceu(boolean venceu) {
		this.venceu = venceu;
	}

	public int getTentativas() {
		return tentativas;
	}

	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}

	public List<Integer> getNumeroSorteado() {
		return numeroSorteado;
	}

	public void setNumeroSorteado(List<Integer> numeroSorteado) {
		this.numeroSorteado = numeroSorteado;
	}

}
