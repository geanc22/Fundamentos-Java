/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.pruebas;

import com.mycompany.ejemplo.entidades.Alumno;

/**
 *
 * @author Gean C
 */
public class Prueba02 {
     
    public static void main(String[] args) {
         Alumno alumno = new Alumno(5, 100, "juan", true);
         //Persona alumno  = new Alumno(5,"aprobado", 100, "juan", true);
       
        System.out.println(alumno);
    }
}
