package com.certus.ejemplo.modelo.daos.impl;

import com.certus.ejemplo.modelo.daos.AdministradorDao;
import com.certus.ejemplo.util.Util;

public class DaoFactory {
    
    
    public static AdministradorDao getAdministradorDao(int opc){
        switch (opc) {
            case Util.MEMORY:
                return new AdministradorDaoMemory();
            case Util.MYSQL:
                return new AdministradorDaoMySql();
            default:
                return null;
        }
        
    }
    
}
