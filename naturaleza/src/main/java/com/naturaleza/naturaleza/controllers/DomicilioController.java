package com.naturaleza.naturaleza.controllers;

import com.naturaleza.naturaleza.entities.Domicilio;
import com.naturaleza.naturaleza.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//METODOS HTTP POST, GET, DELETE,PUT
@RestController
public class DomicilioController {
    @Autowired
    private DomicilioService domicilioService;
    //ENDPOINT BÁSICO PARA GUARDAR INFO
    @PostMapping("/crearDomicilio")
    public Domicilio crearDomicilio(@RequestBody Domicilio domicilio) {
        return domicilioService.crearDomicilio(domicilio);
    }
    @GetMapping("/listar")
    public List<Domicilio> listarDomicilios() {
        return domicilioService.listarDomicilios();
    }
}
