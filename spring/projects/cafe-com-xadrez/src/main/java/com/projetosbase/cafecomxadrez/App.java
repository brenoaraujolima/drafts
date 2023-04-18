package com.projetosbase.cafecomxadrez;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projetosbase.cafecomxadrez.entities.Tabuleiro;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Tabuleiro tab = (Tabuleiro) context.getBean("tabuleiro");
    }
}
