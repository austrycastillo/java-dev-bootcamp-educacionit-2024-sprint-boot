package com.naturaleza.naturaleza.controllers;

import com.naturaleza.naturaleza.entities.Auto;
import com.naturaleza.naturaleza.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class AutoController {
    @Autowired
    private AutoService autoService;
    //INSERT DE AUTO
    @PostMapping("/crearAuto")
    public Auto crearAuto(@RequestBody Auto auto) {
        return autoService.crearAuto(auto);
    }
}
