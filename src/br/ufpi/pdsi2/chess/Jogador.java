package br.ufpi.pdsi2.chess;

public class Jogador {
	private String name = "Jogador";
	private Pecas tipo;

	public Jogador(Pecas umTipo) {
		this.tipo = umTipo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pecas getTipo() {
		return tipo;
	}

	public void setTipo(Pecas tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.name);
		sb.append("(");
		sb.append(this.tipo.getDescricao());
		sb.append(")");
		return sb.toString();
	}
}