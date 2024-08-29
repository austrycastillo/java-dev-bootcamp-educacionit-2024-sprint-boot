package com.clase45.clase45.tres;

import com.clase45.clase45.dos.Dos;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Persona persona = (Persona) context.getBean("tercerBean");
        context.getBean("tercerBean");
        System.out.println(persona);
    }
}
