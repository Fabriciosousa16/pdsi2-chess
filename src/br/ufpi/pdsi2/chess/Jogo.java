package br.ufpi.pdsi2.chess;

public class Jogo {

	private Jogador jogadorBrancas;
	private Jogador jogadorPretas;

	public boolean temGanhador() {
		return false;
	}

	public void inicia() {
		criaJogadores();

	}

	private void criaJogadores() {
		this.jogadorBrancas = new Jogador(Pecas.BRANCAS);
		this.jogadorPretas = new Jogador(Pecas.PRETAS);
	}

	public Jogador getJogadorPretas() {
		return this.jogadorPretas;
	}

	public Jogador getJogadorBrancas() {
		return this.jogadorBrancas;
	}

}
