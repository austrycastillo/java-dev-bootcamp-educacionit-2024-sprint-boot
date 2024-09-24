package com.naturaleza.naturaleza.entities;

import jakarta.persistence.*;

@Entity
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    public Orden(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Orden() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
