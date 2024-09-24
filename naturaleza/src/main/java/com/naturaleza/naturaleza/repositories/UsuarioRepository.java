package com.naturaleza.naturaleza.repositories;

import com.naturaleza.naturaleza.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //JPQL
//    @Query("SELECT u FROM Usuario u INNER JOIN orden o WHERE o.id =:id")
//    List<Usuario>findUsuarioByOrderById();
}
