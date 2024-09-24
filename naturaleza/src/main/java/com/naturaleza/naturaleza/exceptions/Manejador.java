package com.naturaleza.naturaleza.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Manejador {
    @ExceptionHandler(DomicilioNoEncontradoException.class)
    public ResponseEntity<String> DomicilioNoEncontradoException(DomicilioNoEncontradoException dne){
        return  new ResponseEntity<>(dne.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> manejarExceptionGeneral(Exception ex){
        return  new ResponseEntity<>("Error interno del servidor" + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
