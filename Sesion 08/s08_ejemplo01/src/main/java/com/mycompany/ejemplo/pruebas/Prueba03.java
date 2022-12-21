/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.pruebas;

import com.mycompany.ejemplo.entidades.Profesor;
import com.mycompany.ejemplo.util.Util;

/**
 *
 * @author Gean C
 */
public class Prueba03 {
    
    public static void main(String[] args) {
         //TODO Crear un objeto de la clase Profesor  y mostrar sus datos
    Profesor profesor = new Profesor( Util.CATEGORIAB, 20, "Elvis", true);
     Profesor p1 = new Profesor( 3, 20, "Elvis", true);
        System.out.println(profesor);
         System.out.println(p1);
        
         //TODO Crear un objeto de la clase Profesor  y mostrar sus datos
                // Tome en cuenta A->3500  B-->3000  C-->2500
          
    }
     
}
