package com.example;

public class UsuarioRol {

    private Usuario usuario;
    private Rol rol;

    public UsuarioRol(Usuario usuario, Rol rol) {
        this.usuario = usuario;
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "UsuarioRol{usuario=" +
                (usuario != null ? usuario.getNombre() : "null") +
                ", rol=" +
                (rol != null ? rol.getNombre() : "null") +
                "}";
    }
}