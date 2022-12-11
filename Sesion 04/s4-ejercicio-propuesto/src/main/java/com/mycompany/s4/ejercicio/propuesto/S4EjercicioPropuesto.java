/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.s4.ejercicio.propuesto;

import java.util.Scanner;

/**
 *
 * @author Gean C
 */
public class S4EjercicioPropuesto {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double promedio = 0;
    double mayorNumero  =0;
    double segundoMayor =0;
    double menorNumero  = 0;

    
    System.out.println("ingresa un numero entero 1");
    double nota1 = sc.nextInt();
    System.out.println("ingresa un numero entero 2");
    double nota2 = sc.nextInt();
    System.out.println("ingresa un numero entero 2");
    double nota3 = sc.nextInt();
    
        System.out.println("ingrese su opcion:");
        System.out.println("r: Regular");
        System.out.println("e: Especial");
        System.out.println("q: salir");

        char opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'r':
                    promedio = (nota1+nota2+nota3)/3;
                    break;
                case 'e':
                    if (nota1 > nota2 && nota2 > nota3) {
                     mayorNumero = nota1;
                     segundoMayor = nota2;
                    }else if(nota2 > nota1 && nota1 > nota3){
                     mayorNumero = nota2;
                     segundoMayor = nota1;
                    }else if(nota3 > nota2 && nota2>nota1){
                     mayorNumero = nota3;
                     segundoMayor = nota1;
                    }else if(nota2 > nota1 && nota3>nota1){
                     mayorNumero = nota2;
                     segundoMayor = nota3;
                    }
                    promedio = (mayorNumero +segundoMayor )/2;
                    break;
                default:
                    System.out.println("ingresar opcion valida");;
             }
           
             System.out.println("resultado= "+promedio);
              if(promedio>=11){
                System.out.println("APROBADO");
            }else{
                  System.out.println("JALADO");
            }
             
    
    }
                
        
}

