/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.pruebas;

import com.mycompany.ejemplo.modelo.entidades.Curso;
import com.mycompany.ejemplo.servicio.CursoService;
import com.mycompany.ejemplo.servicio.impl.CursoServiceImpl;

/**
 *
 * @author Gean C
 */
public class Prueba03 {
     public static void main(String[] args) {
         Curso c = new Curso("c09","TypeSCript 2",2);
         CursoService servicio = new CursoServiceImpl();
         servicio.grabar(c);
         for(Curso curso: servicio.listar()){
             System.out.println(curso+"\n");
         }
    }
}
