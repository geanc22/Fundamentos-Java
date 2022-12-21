/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.pruebas;

import com.mycompany.ejemplo.dao.AlumnoDaoMemory;
import com.mycompany.ejemplo.entidades.Alumno;

/**
 *
 * @author Gean C
 */
public class Prueba05 {
     public static void main(String[] args) {
        Alumno a1 = new Alumno(15, 100, "juan", true);
        Alumno a2 = new Alumno(10, 200, "carlos", true);
        Alumno a3 = new Alumno(18, 300, "Maria", false);
        
        AlumnoDaoMemory dao = new AlumnoDaoMemory();
        dao.create(a1);
        dao.create(a2);
        dao.create(a3);
        dao.create(new Alumno(5,400, "Mario", true));
        
        dao.delete(a2);
        
        for(Alumno a: dao.findAll()){
            System.out.println(a);
        }
        
    }
}
