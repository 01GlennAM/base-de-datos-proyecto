package com.example;

public class Leccion {

    private int idLeccion;
    private String titulo;
    private String contenido;
    private String url;
    private int duracion;
    private int orden;

    private Modulo modulo; // relación con Modulo

    // CONSTRUCTOR
    public Leccion(int idLeccion, String titulo, String contenido, String url, int duracion, int orden, Modulo modulo) {

        this.idLeccion = idLeccion;
        this.titulo = titulo;
        this.contenido = contenido;
        this.url = url;
        this.duracion = duracion;
        this.orden = orden;
        this.modulo = modulo;
    }

    // GETTERS Y SETTERS

    public int getIdLeccion() {
        return idLeccion;
    }

    public void setIdLeccion(int idLeccion) {
        this.idLeccion = idLeccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Leccion{id=" + idLeccion +
                ", titulo='" + titulo +
                "', duracion=" + duracion +
                "}";
    }
}