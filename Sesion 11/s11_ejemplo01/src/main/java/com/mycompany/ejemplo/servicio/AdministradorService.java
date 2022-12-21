/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejemplo.servicio;

import com.mycompany.ejemplo.modelo.entidades.Administrador;

/**
 *
 * @author Gean C
 */
public interface AdministradorService {
    
    public Administrador validar(String usuario,String password);
}
