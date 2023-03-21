package com.projetosbase.cafecomxadrez.entities;

public abstract class Peca {
	public int id;
	public Boolean isWhite;

	public Peca() {

	}

	public Peca(int id, boolean isWhite) {
		this.id = id;
		this.isWhite = isWhite;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIsWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}
}
