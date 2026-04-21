package com.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Modulo {/* comentarios */

    private int idModulo;
    private String titulo;
    private String descripcion;
    private int orden;

    private Curso curso; // relación con Curso
    private List<Leccion> lecciones;

    // CONSTRUCTOR
    public Modulo(int idModulo, String titulo, String descripcion, int orden, Curso curso) {
        this.idModulo = idModulo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.orden = orden;
        this.curso = curso;

        this.lecciones = new ArrayList<>();
    }

    // se agrega por este metodo
    public void agregarLeccion(Leccion leccion) {
        if (leccion != null) {
            this.lecciones.add(leccion);
        }
    }

    // solo deja leer
    public List<Leccion> getLecciones() {
        return Collections.unmodifiableList(lecciones);
    }

    // GETTERS Y SETTERS

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Modulo{id=" + idModulo +
                ", titulo='" + titulo +
                "', curso=" + (curso != null ? curso.getTitulo() : "null") +
                "}";
    }
}