/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo01;

import java.io.IOException;

/**
 *
 * @author Gean C
 */
public class Prueba03 {
   public static void main(String[] args) {
        
        try {
            Runtime.getRuntime().exec("winword");
            System.out.println("Comando ejecutado con exito");
        } catch (IOException ex) {
            System.out.println("Comando con error");
        }
        
    }
}

