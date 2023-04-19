package com.projetosbase.cafecomxadrez.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("peca")
public class Peca {
	public int id;

//	public Boolean isWhite;

	public Peca(	@Value("4") int id) {
		this.id = id;
//		this.isWhite = isWhite;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public void setIsWhite(boolean isWhite) {
//		this.isWhite = isWhite;
//	}
}
