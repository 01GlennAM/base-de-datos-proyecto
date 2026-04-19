package com.example;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

public class Curso {
    private int idCurso;
    private String titulo;
    private String descripcion;
    private String url;
    private double valor;
    private boolean estaPublicado;
    private Usuario instructor;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    
    private Categoria categoria;
    private List<Modulo> modulos;

    public Curso(int idCurso, String titulo, String descripcion, String url, double valor,
                 boolean estaPublicado, Usuario instructor,
                 Date fechaCreacion, Date fechaActualizacion, Categoria categoria) {

        this.idCurso = idCurso;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.valor = valor;
        this.estaPublicado = estaPublicado;
        this.instructor = instructor;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.categoria = categoria;

        this.modulos = new ArrayList<>();
    }

    public void agregarModulo(Modulo modulo) {
        if (modulo != null) {
            this.modulos.add(modulo);
        }
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    // Getters y setters

    public int getIdCurso() { return idCurso; }
    public void setIdCurso(int idCurso) { this.idCurso = idCurso; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public boolean isEstaPublicado() { return estaPublicado; }
    public void setEstaPublicado(boolean estaPublicado) { this.estaPublicado = estaPublicado; }

    public Usuario getInstructor() { return instructor; }
    public void setInstructor(Usuario instructor) { this.instructor = instructor; }

    public Date getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public Date getFechaActualizacion() { return fechaActualizacion; }
    public void setFechaActualizacion(Date fechaActualizacion) { this.fechaActualizacion = fechaActualizacion; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}