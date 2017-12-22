package br.ufpi.pdsi2.chess.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ufpi.pdsi2.chess.Comando;
import br.ufpi.pdsi2.chess.Jogo;

public class JogoTest {


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
	public void testComandoMoveValido() {
		// Dado que...
		Jogo j = new Jogo();
		j.inicia();
		// Quando eu jogador digitar o comando 
		Comando c =  j.getComandoDoJogador("@move Pe4");
		// Espera-se que...
		assertTrue("o comando é invalido!", j.ehComandoValido(c));
	}
	
	@Test
	public void testComandoMoveInvalidoSemParamento() {
		// Dado que...
		Jogo j = new Jogo();
		j.inicia();
		// Quando eu jogador digitar o comando 
		Comando c =  j.getComandoDoJogador("@move");
		// Espera-se que...
		assertFalse("o comando é valido!", j.ehComandoValido(c));
	}
	
	@Test
	public void testComandoMoveInvalidoSemParamentroEComandoErrado() {
		// Dado que...
		Jogo j = new Jogo();
		j.inicia();
		// Quando eu jogador digitar o comando 
		Comando c =  j.getComandoDoJogador("@mov");
		// Espera-se que...
		assertFalse("o comando é valido!", j.ehComandoValido(c));
	}
	@Test
	public void testComandoMoveInvalido() {
		// Dado que...
		Jogo j = new Jogo();
		j.inicia();
		// Quando eu jogador digitar o comando 
		Comando c =  j.getComandoDoJogador("@move #");
		// Espera-se que...
		assertFalse("o comando é valido!", j.ehComandoValido(c));
	}
	
	@Test
	public void testComandoHelpValido() {
		// Dado que...
		Jogo j = new Jogo();
		j.inicia();
		// Quando eu jogador digitar o comando 
		Comando c =  j.getComandoDoJogador("@help");
		// Espera-se que...
		assertTrue("o comando é invalido!", j.ehComandoValido(c));
	}
	@Test
	public void testComandoHelpInvalido() {
		// Dado que...
		Jogo j = new Jogo();
		j.inicia();
		// Quando eu jogador digitar o comando 
		Comando c =  j.getComandoDoJogador("@helpp");
		// Espera-se que...
		assertFalse("o comando é valido!", j.ehComandoValido(c));
	}
	@Test
	public void testComandoEmpateValido() {
		// Dado que...
		Jogo j = new Jogo();
		j.inicia();
		// Quando eu jogador digitar o comando 
		Comando c =  j.getComandoDoJogador("@empate");
		// Espera-se que...
		assertTrue("o comando é invalido!", j.ehComandoValido(c));
	}
	
	@Test
	public void testComandoEmpateInvalido() {
		// Dado que...
		Jogo j = new Jogo();
		j.inicia();
		// Quando eu jogador digitar o comando 
		Comando c =  j.getComandoDoJogador("@empatte");
		// Espera-se que...
		assertFalse("o comando é valido!", j.ehComandoValido(c));
	}
	@Test
	public void testComandomoValidoMovimentoValido() {
		// Dado que...
		Jogo j = new Jogo();
		j.inicia();
		// Quando eu jogador digitar o comando 
		Comando c =  j.getComandoDoJogador("@move PH4");
		
	}

}
