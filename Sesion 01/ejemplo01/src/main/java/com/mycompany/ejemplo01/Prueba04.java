/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo01;

/**
 *
 * @author Gean C
 */
public class Prueba04 {
    
    
     public static void main(String[] args) {
         //Tipos de datos en JAVA
         //ENTEROS
         byte a = 0b0000_0010;  //8 bits  00000010   2^8 = 256   -128 ...0 ... 127
         short b = 2; //16 bits 00000000_00000010   2^16= 
         int c = 2;   //32 bits                     2^32=
         long d = 2;  //64 bits                     2^64=
         var e = 2;
         
         System.out.println("a: "+a);
         System.out.println("b: "+b);
         System.out.println("c: "+c);
         System.out.println("d: "+d);
         System.out.println("e: "+e);  
         
         //Con punto flotante
         double x = 2; //32 bits
         float  y = 2; //64  bits
         System.out.println("x: "+x);
         System.out.println("y: "+y);
         
     }
    
}
