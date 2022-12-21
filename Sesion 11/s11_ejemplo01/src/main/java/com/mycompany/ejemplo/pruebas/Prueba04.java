/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.pruebas;

import com.mycompany.ejemplo.modelo.entidades.Administrador;
import com.mycompany.ejemplo.servicio.AdministradorService;
import com.mycompany.ejemplo.servicio.impl.AdministradorServiceImpl;

/**
 *
 * @author Gean C
 */
public class Prueba04 {
    public static void main(String[] args) {
        AdministradorService servicio = new AdministradorServiceImpl();
        Administrador adm = servicio.validar("admin", "admin");
        if(adm!=null){
            System.out.println("bienvenido: "+adm.getNombre());
        }else{
            System.out.println("No ingreso");
        }
            
    }
}
