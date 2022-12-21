/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.pruebas;

import com.mycompany.ejemplo.modelo.daos.AdministradorDao;
import com.mycompany.ejemplo.modelo.daos.impl.DaoFactory;
import com.mycompany.ejemplo.modelo.entidades.Administrador;
import com.mycompany.ejemplo.util.Util;

/**
 *
 * @author Gean C
 */
public class Prueba02 {
       //TODO realizar prueba de ingreso al sistema con credenciales de Administrador
    public static void main(String[] args) {
        AdministradorDao dao = DaoFactory.getAdministradorDao(Util.opc);
        Administrador administrador = dao.login("admin","admin");
        if(administrador!= null)
            System.out.println("Bievenido :" +administrador.getNombre());
        else
            System.out.println("No ingreso al sistema");
    }
}
