package com.naturaleza.naturaleza.repositories;

import com.naturaleza.naturaleza.entities.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
}
