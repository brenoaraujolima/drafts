package com.projetosbase.cafecomxadrez.entities;

public class Tabuleiro {
	public Casa[][] casas;

	public Tabuleiro(Casa[][] casas) {
		this.casas = casas;
	}

	public void fazerJogada() {
		System.out.println("Parabens! Jogada realizada.");
	}
}
