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

        Peca peca = (Peca) context.getBean("torre");
        System.out.println(peca.id);
        System.out.println(peca.isWhite);

        Casa casa = (Casa) context.getBean("casa1x1");
        System.out.println(casa.peca.id);
        System.out.println(casa.peca.isWhite);
    }
}
