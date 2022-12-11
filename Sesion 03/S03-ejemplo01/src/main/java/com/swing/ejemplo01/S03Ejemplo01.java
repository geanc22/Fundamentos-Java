/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.swing.ejemplo01;

import com.swing.ejemplo01.gui.MiVentana;

/**
 *
 * @author Gean C
 */
public class S03Ejemplo01 {

    public static void main(String[] args) {
        //TODO abrir una ventana
        
        MiVentana v1 = new MiVentana(args[0]);
        v1.setVisible(true);
        
    }
}
