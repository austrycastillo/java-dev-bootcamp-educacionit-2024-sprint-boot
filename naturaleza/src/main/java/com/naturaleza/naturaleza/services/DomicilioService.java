package com.naturaleza.naturaleza.services;

import com.naturaleza.naturaleza.entities.Domicilio;
import com.naturaleza.naturaleza.exceptions.DomicilioNoEncontradoException;
import com.naturaleza.naturaleza.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService {
    @Autowired
    private DomicilioRepository domicilioRepository;

    //CREAR NUESTROS METODOS UTILIZANDO EL REPOSITORIO Y SUS METODOS JPA PARA HACER EL CRUD
    //insert
    public Domicilio crearDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }

    //select
    public List<Domicilio> listarDomicilios() {
        return domicilioRepository.findAll();
    }

    public Iterable<Domicilio> listarDomicilios2() {
        return domicilioRepository.findAll();
    }

    public Domicilio buscarDomicilioPorId(Long id) {
        return domicilioRepository.findById(id).orElseThrow(
                () -> new DomicilioNoEncontradoException("Domicilio no encontrado, id " + id)
        );
    }

    public List<Domicilio> findDomicilioByDireccion(String direccion) {
        return domicilioRepository.findDomicilioByDireccion(direccion);
    }

    //delete
    public void eliminarDomicilio(Long id) {
        domicilioRepository.deleteById(id);
    }

    //update
    public Domicilio actualizarDomicilio(Long id, Domicilio domicilioNuevo) {
        Domicilio domicilioActual = buscarDomicilioPorId(id);
        domicilioActual.setCodigo(domicilioNuevo.getCodigo());
        domicilioActual.setDireccion(domicilioNuevo.getDireccion());
        return domicilioRepository.save(domicilioActual);
    }

}
