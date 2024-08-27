package com.ar.tupropiedad.gestion_inmueble;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioApp {
    @GetMapping("/") //endpoint básico
    public String saludar(){
        return "¡Hola Spring Boot en un lunes!";
    }
}
