package com.TP1BienEstar.BienEstar.model;

import java.util.List;

public class Grupo {
    private String id;
    private String nombre;
    private List<Miembro> miembros;

    // Constructor
    public Grupo() {}

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

    public List<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Miembro> miembros) {
        this.miembros = miembros;
    }
}