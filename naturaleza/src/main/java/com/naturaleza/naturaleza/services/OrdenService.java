package com.naturaleza.naturaleza.services;

import com.naturaleza.naturaleza.entities.Orden;
import com.naturaleza.naturaleza.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenService {
    @Autowired
    private OrdenRepository ordenRepository;
    public void guardarOrden(Orden orden) {
        ordenRepository.save(orden);
    }
}
