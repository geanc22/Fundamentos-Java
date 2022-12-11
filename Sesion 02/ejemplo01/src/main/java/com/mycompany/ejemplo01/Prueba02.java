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
public class Prueba02 {
    public static void main(String[] args) {
        System.out.println("Ingrese un Numero Entero");
   
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();//captura un numero entero y lo asigna a n
      if(n<0)
             System.out.println("es negativo");
        else if (n>0)
             System.out.println("es positivo");
        else
             System.out.println("es CERO");
    }
    
    
}
