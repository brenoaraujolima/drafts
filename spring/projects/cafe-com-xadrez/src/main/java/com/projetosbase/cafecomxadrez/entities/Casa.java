package com.projetosbase.cafecomxadrez.entities;

public class Casa {
	public Peca peca;

	public Casa() {

	}

	public Casa(Peca peca) {
		this.peca = peca;
	}

	public void setPeca(Peca peca) {
		System.out.println("Estou chamando o setter de casa");
		this.peca = peca;
	}
}
