package com.certus.ejemplo.modelo.daos.impl;

import com.certus.ejemplo.modelo.daos.AdministradorDao;
import com.certus.ejemplo.modelo.entidades.Administrador;

public class AdministradorDaoMemory implements AdministradorDao{

    @Override
    public Administrador login(String us, String ps) {
        if(us.equalsIgnoreCase("admin") && ps.equalsIgnoreCase("admin"))
            return new Administrador("100", "admin", "admin", "juan", "perez");
        return null;
    }
    
}
