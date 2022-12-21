/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.entidades;

import com.mycompany.ejemplo.util.Util;

/**
 *
 * @author Gean C
 */
public class Profesor extends Persona{
    
    private int categoria;
    private double sueldo;

    public Profesor() {
    }

    public Profesor(int categoria,  int id, String nombre, boolean sexo) { //double sueldo,
        super(id, nombre, sexo);
        this.categoria = categoria;
        //this.sueldo = sueldo;
    }

    public double getSueldo() {
        switch (this.categoria) {
            case Util.CATEGORIAA:
                this.sueldo = Util.SueldoA;
                break;
            case Util.CATEGORIAB:
                this.sueldo = Util.SueldoB;
                break;
            case Util.CATEGORIAC:
                this.sueldo = Util.SueldoC;
                break;
            default:
                throw new AssertionError();
        }
        return sueldo;
    }

   /*public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }*/

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Profesor{"+super.toString() + "categoria=" + categoria + ", sueldo=" + getSueldo() + '}';
    }
    
    
    
}
