/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo01;

import java.util.Scanner;

/**
 *Ejercicios:
    Ejercicio 01:
        Desarrollar una aplicacion que ingreso los datos de 5 alumnos(id, nombre, pc1,pc2,pc3)
        Mostrar el promedio de la practicas de cada alumno
        Mostrar el promedio mayor de los alumnos
        Mostrar el promedio de promedios.
[contadores, acumuladores y bucles]
 * @author Gean C
 */
public class EjercicioPropuesto {
    
    public static void main(String[] args) {
      double promedioTotal =0;
      int cont =0;
      double mayor =0;
     // double acomuPromedio = 0;
    while(true){
     //   Scanner nm= new Scanner (System.in);
       System.out.println("ingrese su nombre:");
      // String nombre = nm.next());
       
       double promedio=0;
              
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese nota1:");
        double n1 = sc.nextInt();
        System.out.println("ingrese nota2:");
        double n2 = sc.nextInt();
        System.out.println("ingrese nota3:");
        double n3 = sc.nextInt();

        promedio = (n1 + n2 + n3) /3;
        System.out.println("Promedio es: " + promedio);
        cont=cont+1;
        promedioTotal +=promedio;
         if(promedio>mayor){
            mayor=promedio;
        }
        System.out.println(" 'a' para continuar");
        System.out.println(" 'q' para salir");
        
       
            
        char opcion = sc.next().charAt(0);
        if(opcion=='q') break;
        
       
    }
         //System.out.println("Promedio Total es: " +  acomuPromedio);
       //  System.out.println("Contador" + cont );
        promedioTotal = promedioTotal/cont;
        System.out.println("Promedio de Promedios es: " + promedioTotal);
        System.out.println("El promedio Mayor es:  " + mayor);
    }
    
}
