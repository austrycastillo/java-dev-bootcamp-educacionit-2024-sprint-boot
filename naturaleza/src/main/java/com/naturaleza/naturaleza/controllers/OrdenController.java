package com.naturaleza.naturaleza.controllers;

import com.naturaleza.naturaleza.entities.Orden;
import com.naturaleza.naturaleza.services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdenController {
    @Autowired
    private OrdenService ordenService;
    @PostMapping("/crearOrden")
    public void guardarOrden(@RequestBody Orden orden) {
       ordenService.guardarOrden(orden);
    }
}
