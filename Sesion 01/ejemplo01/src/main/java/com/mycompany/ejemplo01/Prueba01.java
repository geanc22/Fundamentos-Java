/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo01;

/**
 *
 * @author Gean C
 */
public class Prueba01 {
    //Metodo de arranque de una clase
    public static void main(String[] args) {
        // como se llama el software instaldo en tu pc o sistema operativo que
        //interpreta el bytecode para ejecutarlo en tu pc
        long memoriaLibre = (Runtime.getRuntime().freeMemory()/1024)/1024;
        System.out.println("Memoria libre es:" + memoriaLibre);
    }
}
