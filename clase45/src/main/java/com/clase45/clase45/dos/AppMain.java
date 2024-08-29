package com.clase45.clase45.dos;

import com.clase45.clase45.uno.Uno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Dos dos = (Dos) context.getBean("segundoBean");
        dos.mostrarMensaje();
        System.out.println(dos);
    }
}
