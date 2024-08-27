package com.ar.tupropiedad.gestion_inmueble.controllers;

import com.ar.tupropiedad.gestion_inmueble.models.Inmueble;
import com.ar.tupropiedad.gestion_inmueble.services.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//controlador sencillo
public class InmuebleController {
    private final InmuebleService inmuebleService;
    @Autowired   //para ayudar a unir clases, inyectamos el servicio
    public InmuebleController(InmuebleService inmuebleService) {
        this.inmuebleService = inmuebleService;
    }

    @GetMapping("/inmuebles")   // indicar la ruta y el método http a utilizar
    public List<Inmueble> listarInmuebles(){
        return inmuebleService.obtenerInmuebles();
    }

}
