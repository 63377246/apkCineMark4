package es.escam.apkcinemark.model;

import java.io.Serializable;

public class Usuario implements Serializable {

    int id;
    String Nombres, Apellidos, Correo, Telefono, Genero, FechaNacimiento;
    String Dni, Ciudad, Teatro, GeneroPelicula, Passwordd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getTeatro() {
        return Teatro;
    }

    public void setTeatro(String teatro) {
        Teatro = teatro;
    }

    public String getGeneroPelicula() {
        return GeneroPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        GeneroPelicula = generoPelicula;
    }

    public String getPasswordd() {
        return Passwordd;
    }

    public void setPasswordd(String passwordd) {
        Passwordd = passwordd;
    }

    public Usuario(int id, String nombres, String apellidos, String correo, String telefono, String genero, String fechaNacimiento, String dni, String ciudad, String teatro, String generoPelicula, String passwordd) {
        this.id = id;
        Nombres = nombres;
        Apellidos = apellidos;
        Correo = correo;
        Telefono = telefono;
        Genero = genero;
        FechaNacimiento = fechaNacimiento;
        Dni = dni;
        Ciudad = ciudad;
        Teatro = teatro;
        GeneroPelicula = generoPelicula;
        Passwordd = passwordd;
    }
}
