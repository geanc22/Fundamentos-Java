/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.entidades;

/**
 *
 * @author Gean C
 */
public class Persona {
    private int id;
    private String nombre;
    private boolean sexo;
    
    private Curso curso;

    public Persona() {
    }

    public Persona(int id, String nombre, boolean sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
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
    
        public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + '}';
    }
    
    
}
