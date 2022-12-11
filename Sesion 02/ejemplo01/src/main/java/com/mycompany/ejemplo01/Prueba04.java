/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo01;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gean C
 */
public class Prueba04 {
    //TODO hacer un programa para abrir 3 calculadoras.
        public static void main(String[] args) {
        System.out.println("ingresa un numero entero");
            Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        //for(;;){
        for(int i=1; i<=n ; i++){
            try {
                Runtime.getRuntime().exec("calc");
            } catch (IOException ex) {
                System.out.println("error");
            }
        }
    } 
}
