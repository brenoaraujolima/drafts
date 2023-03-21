package com.projetosbase.cafecomxadrez.entities;

public class Tabuleiro {
	public Casa[][] casas;

	public Tabuleiro() {

	}

	public Tabuleiro(Casa[][] casas) {
		this.casas = casas;
	}

	public void setCasas(Casa[][] casas) {
		this.casas = casas;
	}

	public Casa[][] getCasas() {
		return this.casas;
	}

	public void fazerJogada() {
		System.out.println("Parabens! Jogada realizada.");
	}
}
