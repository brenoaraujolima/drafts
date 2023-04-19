package com.projetosbase.cafecomxadrez;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projetosbase.cafecomxadrez.entities.Peca;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.refresh();
        Peca peca = (Peca) context.getBean("peca");
        System.out.println("let");
    }
}
