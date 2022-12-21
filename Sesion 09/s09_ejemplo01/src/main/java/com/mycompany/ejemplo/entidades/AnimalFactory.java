/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.entidades;

import com.mycompany.ejemplo.util.EAnimal;

/**
 *
 * @author Gean C
 */
public class AnimalFactory {
    public static Animal getAnimal(EAnimal op){
           switch (op) {
            case PERRO:
                return new Perro();
            case GATO:
                return new Gato();
            case CONEJO:
                return new Conejo();
            case VACA:
                return new Vaca();
            case CERDO:
                return new Cerdo();
            default:
                return null;
        }
    
       /* switch (op) {
            case 1:
                return new Perro();
            case 2:
                return new Gato();
            case 3:
                return new Conejo();
            case 4:
                return new Vaca();
            default:
                return null;
        }*/
    }
}
