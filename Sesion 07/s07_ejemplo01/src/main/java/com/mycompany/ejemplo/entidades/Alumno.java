/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.entidades;

/**
 *
 * @author Gean C
 */
public class Alumno {
    private int id;
    private String nombre;
    private String correo;
    private double promedio;
    private String estado;
    private String sexo;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String correo, double promedio, String estado, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.promedio = promedio;
        this.estado = estado;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", promedio=" + promedio + ", estado=" + estado + ", sexo=" + sexo + '}';
    }
    
    
    
}
