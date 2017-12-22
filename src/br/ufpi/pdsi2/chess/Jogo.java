package br.ufpi.pdsi2.chess;

import java.util.Scanner;

public class Jogo {

	private Jogador jogadorBrancas;
	private Jogador jogadorPretas;

	public boolean temGanhador() {
		return false;
	}

	public void inicia() {
		criaJogadores();
		/*
		 * 1. Avisar que está pronto pra jogar
		 */
		System.out.println("Jogo iniciado! Digite comando para iniciar!");

		/*
		 * 2. (LOOP) Aguardar o comando do jogador equanto o jogo não tiver um
		 * ganhador ou um dos jogadores desistir; 2.1. ler comando; 2.2.
		 * interpretar o comando; 2.2.1. julgar se o comando é válido; 2.3.
		 * executar a tarefa; 3. avisar que o jogo terminou;
		 */

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

	public String lerComando(){
		Scanner s = new Scanner(System.in);
		String comandoDoJogador = s.next();
		s.close();
		return comandoDoJogador;
	}
	
	public Comando getComandoDoJogador(String comandoDoJogador) {
		String[] partesDoComando = comandoDoJogador.split(" ");

		Comando novoComando = null;
		switch (partesDoComando[0]) {
		case "@help":
			novoComando = new Comando(TipoComando.HELP, null);
			break;
		case "@move":
			if(partesDoComando.length!=2) return null;
			novoComando = new Comando(TipoComando.MOVE, partesDoComando[1]);
			break;
		case "@apelidarw":
			if(partesDoComando.length!=2) return null;
			novoComando = new Comando(TipoComando.APELIDARW, partesDoComando[1]);
			break;
		case "@apelidarb":
			if(partesDoComando.length!=2) return null;
			novoComando = new Comando(TipoComando.APELIDARB, partesDoComando[1]);
			break;
		case "@desistir":
			novoComando = new Comando(TipoComando.DESISTIR, null);
			break;
		case "@estatisticas":
			novoComando = new Comando(TipoComando.ESTATISTICAS, null);
			break;
		case "@empate":
			novoComando = new Comando(TipoComando.EMPATE, null);
			break;
		}

		return novoComando;
	}

	public boolean ehComandoValido(Comando c) {
		if (c == null)
			return false;
		else if ((c.getTipo() == TipoComando.MOVE && (c.getParametro()
				.isEmpty() || c.getParametro() == null))
				|| (c.getTipo() == TipoComando.APELIDARW && (c.getParametro()
						.isEmpty() || c.getParametro() == null))
				|| (c.getTipo() == TipoComando.APELIDARB && (c.getParametro()
						.isEmpty() || c.getParametro() == null)))
			return false;

		if(c.getTipo() == TipoComando.MOVE && ehParametroValido(c.getParametro())){
			return true;
		}
		if(c.getTipo() == TipoComando.APELIDARW && ehParametroValido(c.getParametro())){
			return true;
		}
		if(c.getTipo() == TipoComando.APELIDARB && ehParametroValido(c.getParametro())){
			return true;
		}
		// TODO testar notaçao algebrica
		return true;
	}

	private boolean ehParametroValido(String parametro) {
		
		if(parametro == null) return false;
		
		else if(parametro.isEmpty()) return false;
		
		return true;
	}
	
	private boolean ehParametroInvalido(String parametro) {
		
		return false;
	}

}
