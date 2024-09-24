package com.naturaleza.naturaleza.services;

import com.naturaleza.naturaleza.entities.Auto;
import com.naturaleza.naturaleza.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoService {
    @Autowired
    private AutoRepository autoRepository;
    public Auto crearAuto(Auto auto) {
        return autoRepository.save(auto);
    }
}
