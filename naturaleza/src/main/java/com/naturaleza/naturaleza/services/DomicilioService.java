package com.naturaleza.naturaleza.services;

import com.naturaleza.naturaleza.entities.Domicilio;
import com.naturaleza.naturaleza.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService {
    @Autowired
    private DomicilioRepository domicilioRepository;
    //CREAR NUESTROS METODOS UTILIZANDO EL REPOSITORIO Y SUS METODOS JPA PARA HACER EL CRUD
    public Domicilio crearDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }
    public List<Domicilio> listarDomicilios() {
        return  domicilioRepository.findAll();
    }
}
