package br.ufpi.pdsi2.chess;

enum Pecas {
	BRANCAS("Brancas"), PRETAS("Pretas");
	String descricao;

	Pecas(String desc) {
		descricao = desc;
	}

	public String getDescricao() {
		return descricao;
	}
}