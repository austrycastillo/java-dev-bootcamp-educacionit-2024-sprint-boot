package com.naturaleza.naturaleza.controllers;

import com.naturaleza.naturaleza.entities.Domicilio;
import com.naturaleza.naturaleza.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/borrarDomicilio/{id}")
    public void eliminarDomicilio(@PathVariable Long id) {
        domicilioService.eliminarDomicilio(id);
    }
    @GetMapping("/listarPorId/{id}")
    public Domicilio buscarDomicilioPorId(@PathVariable Long id) {
        return domicilioService.buscarDomicilioPorId(id);
    }
    @PutMapping("/actualizar/{id}")
    public Domicilio actualizarDomicilio(@PathVariable Long id,@RequestBody Domicilio domicilioNuevo){
        return domicilioService.actualizarDomicilio(id, domicilioNuevo);
    }
}
