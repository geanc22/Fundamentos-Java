/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.pruebas;

import com.mycompany.ejemplo.entidades.Animal;
import com.mycompany.ejemplo.entidades.AnimalFactory;
import com.mycompany.ejemplo.util.EAnimal;
import com.mycompany.ejemplo.util.Util;

/**
 *
 * @author Gean C
 */
public class Prueba02 {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(EAnimal.CERDO);
        System.out.println(animal.pedirAyuda());
    }
}
