/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.modelo.daos.impl;

import com.mycompany.ejemplo.modelo.daos.AdministradorDao;
import com.mycompany.ejemplo.modelo.entidades.Administrador;

/**
 *
 * @author Gean C
 */
public class AdministradorDaoMemory implements AdministradorDao{
    
    @Override
    public Administrador login(String us, String ps) {
         if(us.equalsIgnoreCase("admin") && ps.equalsIgnoreCase("admin"))
            return new Administrador("100", "admin", "admin", "juan", "perez");
        return null;
    }
    
}
