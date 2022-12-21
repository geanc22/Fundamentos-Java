/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.servicio.impl;

import com.mycompany.ejemplo.modelo.daos.AdministradorDao;
import com.mycompany.ejemplo.modelo.daos.impl.DaoFactory;
import com.mycompany.ejemplo.modelo.entidades.Administrador;
import com.mycompany.ejemplo.servicio.AdministradorService;
import com.mycompany.ejemplo.util.Util;

/**
 *
 * @author Gean C
 */
public class AdministradorServiceImpl implements AdministradorService{
    private AdministradorDao dao;
    public AdministradorServiceImpl() {
        dao =  DaoFactory.getAdministradorDao(Util.opc);
    }

    @Override
    public Administrador validar(String usuario, String password) {
        return dao.login(usuario, password);
    }
}
