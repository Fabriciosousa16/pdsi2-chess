package br.ufpi.pdsi2.chess;

public class Comando {

	TipoComando tipo;
	String parametro;
	
	public Comando(TipoComando umTipo, String parametro) {
		setTipo(umTipo);
		setParametro(parametro);
	}

	public TipoComando getTipo() {
		return this.tipo;
	}

	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public void setTipo(TipoComando tipo) {
		this.tipo = tipo;
	}

}
