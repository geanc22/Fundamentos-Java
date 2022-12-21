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
public class Alumno extends Persona{
    
    private double promedio;
    private String estado;

    public Alumno() {
    }

      public Alumno(double promedio,  int id, String nombre, boolean sexo) {
        super(id, nombre, sexo);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
      this.estado= (this.promedio>=Util.PROMEDIO)?Util.MSGAPROBADO:Util.MSGDESAPROBADO;
        return estado;
    }

  /*  public void setEstado(String estado) {
        this.estado = estado;
    }*/

   @Override
    public String toString() {
        return "Alumno{" +super.toString()+ "promedio=" + promedio + ", estado=" + getEstado()+ '}';
    }
    
    
    
    
    
}
