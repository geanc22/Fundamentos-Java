/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo01;

import java.util.Scanner;

/**
 *
 * @author Gean C
 */
public class Prueba05 {
      //TODO Hacer un programa para leer 4 opciones (sumar, restar, 
    //multiplicar y dividir) , salir del menu 
    // cuando ser presiona 'q'
    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double resultado=0;
    System.out.println("ingresa un numero entero 1");
    double n1 = sc.nextInt();
    System.out.println("ingresa un numero entero 2");
    double n2 = sc.nextInt();
    
    while(true){
        System.out.println("ingrese su opcion:");
        System.out.println("s: sumar");
        System.out.println("r: restar");
        System.out.println("m: multiplicar ");
        System.out.println("d: dividir");
        System.out.println("q: salir");

        char opcion = sc.next().charAt(0);

            switch (opcion) {
                case 's':
                    resultado = n1+n2;
                    break;
                case 'r':
                    resultado = n1-n2;
                    break;
                case 'm':
                    resultado = n1*n2;
                    break;
                case 'd':
                    resultado = n1/n2;
                    break;
                default:
                    System.out.println("ingresar opcion valida");;
             }
             System.out.println("resultado= "+resultado);
             if(opcion=='q') break;
    }
    
    }
}


