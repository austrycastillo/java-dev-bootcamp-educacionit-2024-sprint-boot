package com.clase45.clase45.uno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Uno uno = (Uno) context.getBean("primerBean");
        uno.mostrarNombre();
        uno.setNombre("Elon Musk");
        uno.mostrarNombre();
    }
}
