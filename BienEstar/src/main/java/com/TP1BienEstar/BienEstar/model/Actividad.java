package com.TP1BienEstar.BienEstar.model;

import java.time.LocalDateTime;

public class Actividad {
    private String id;
    private String nombre;
    private LocalDateTime fechaHora;

    // Constructor
    public Actividad() {}

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}