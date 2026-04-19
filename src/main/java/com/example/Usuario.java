package com.example;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String email;
    private String contrasena;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    private boolean activo;

    private List<Pago> pago;
    private List<Inscripcion> inscripcion;

    public Usuario(int idUsuario, String nombre, String email, String contrasena, Date fechaCreacion,
            Date fechaActualizacion, boolean activo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        setEmail(email);
        this.contrasena = contrasena;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.activo = activo;


        this.pago = new ArrayList<>();
        this.inscripcion = new ArrayList<>();
    }

    
     /* Permite ver los pagos, pero no permite hacer .add() ni .clear() en las listas */ 
      public List<Pago> getPago() {
        return Collections.unmodifiableList(pago);
    }

    public List<Inscripcion> getInscripcion() {
        return Collections.unmodifiableList(inscripcion);
    }

    public void agregarPago(Pago pago) {
        if (pago != null) {
            this.pago.add(pago);
        }
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        if (inscripcion != null) {
            this.inscripcion.add(inscripcion);
        }
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    /* confirmamos que el email debe llevar @ */ public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}