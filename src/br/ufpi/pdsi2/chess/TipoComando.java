package br.ufpi.pdsi2.chess;

public enum TipoComando {

	HELP("@help"), MOVE("@move"), APELIDARW("@apelidarw"), APELIDARB(
			"@apelidarb"), DESISTIR("@desistir"), ESTATISTICAS("@estatisticas"), EMPATE(
			"@empate");

	private String description;

	TipoComando(String tipo) {
		this.description = tipo;
	}

}
