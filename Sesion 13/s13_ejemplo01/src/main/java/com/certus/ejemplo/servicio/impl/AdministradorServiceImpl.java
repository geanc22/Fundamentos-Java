package com.certus.ejemplo.servicio.impl;

import com.certus.ejemplo.modelo.daos.AdministradorDao;
import com.certus.ejemplo.modelo.daos.impl.DaoFactory;
import com.certus.ejemplo.modelo.entidades.Administrador;
import com.certus.ejemplo.servicio.AdministradorService;
import com.certus.ejemplo.util.Util;

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
