package com.naturaleza.naturaleza.repositories;

import com.naturaleza.naturaleza.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DomicilioRepository extends JpaRepository<Domicilio, Long>, CrudRepository <Domicilio, Long> {
    List<Domicilio> findDomicilioByDireccion(String direccion);
}
