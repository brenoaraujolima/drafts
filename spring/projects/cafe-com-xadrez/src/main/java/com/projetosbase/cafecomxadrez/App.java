package com.projetosbase.cafecomxadrez;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Tabuleiro tab = (Tabuleiro) context.getBean("tabuleiro");
        tab.fazerJogada();

    }
}
