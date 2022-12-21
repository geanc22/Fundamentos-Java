/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.pruebas;

import com.mycompany.ejemplo.entidades.Alumno;
import com.mycompany.ejemplo.entidades.Curso;

/**
 *
 * @author Gean C
 */
public class Prueba04 {
    public static void main(String[] args) {
     Curso curso = new Curso(100, "Mate", 20, 5);
     Alumno alumno = new Alumno(15, 100, "juan", true);
     alumno.setCurso(curso);
        System.out.println("Curso"+alumno.getEstado());
    }
}