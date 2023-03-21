package com.projetosbase.cafecomxadrez;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projetosbase.cafecomxadrez.entities.Casa;
import com.projetosbase.cafecomxadrez.entities.Peca;
import com.projetosbase.cafecomxadrez.entities.Tabuleiro;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Peca tab = (Peca) context.getBean("peaoBranco1");
        System.out.println("Alo alo");
    }
}
