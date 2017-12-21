package br.ufpi.pdsi2.chess.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.ufpi.pdsi2.chess.Jogo;

public class JogoTest {

	@Test
	public void testExemplo() {
		// Dado que...
		// Quando eu...
		// Espera-se que...
	}

	@Test
	public void testTemGanhadorComJogoZerado() {
		// Dado que...
		Jogo j = new Jogo();
		// Quando eu...
		j.inicia();
		// Espera-se que...
		assertFalse("não deveria ter terminado!", j.temGanhador());
	}

	@Test
	public void testJogadoresCriadosAoIniciar() {
		// Dado que...
		Jogo j =  new Jogo();
		// Quando eu...
		j.inicia();
		// Espera-se que...
		assertNotNull("o jogador não deveria ser nulo!", j.getJogadorBrancas());
		assertNotNull("o jogador não deveria ser nulo!", j.getJogadorPretas());
	}

	@Test
	public void test4() {
		// Dado que...
		// Quando eu...
		// Espera-se que...
	}
}
