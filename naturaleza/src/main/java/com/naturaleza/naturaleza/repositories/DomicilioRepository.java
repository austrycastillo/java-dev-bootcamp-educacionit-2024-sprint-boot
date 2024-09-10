package com.naturaleza.naturaleza.repositories;

import com.naturaleza.naturaleza.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
}
