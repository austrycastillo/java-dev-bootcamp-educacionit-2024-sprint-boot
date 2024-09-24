package com.naturaleza.naturaleza.services;

import com.naturaleza.naturaleza.entities.Usuario;
import com.naturaleza.naturaleza.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    //insert
    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
