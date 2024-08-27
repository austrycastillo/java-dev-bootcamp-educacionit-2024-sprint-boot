package com.ar.tupropiedad.gestion_inmueble.services;

import com.ar.tupropiedad.gestion_inmueble.models.Inmueble;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class InmuebleService {
    public List<Inmueble> obtenerInmuebles(){
        return Arrays.asList(
                new Inmueble("a1","departamento",64,200),
                new Inmueble("b2","casa",102,450),
                new Inmueble("c7","local",30,80),
                new Inmueble("a6","departamento",18,45)
        );
    }
}
