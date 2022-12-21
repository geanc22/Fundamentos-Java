/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.modelo.daos.impl;

import com.mycompany.ejemplo.modelo.daos.CursoDao;
import com.mycompany.ejemplo.util.Util;

/**
 *
 * @author Gean C
 */
public class DaoFactory {
    public static CursoDao getCursoDao(int opc){
          switch (opc) {
            case Util.MEMORY:
                return new CursoDaoMemory();
            case Util.MYSQL:
                return new CursoDaoMySql();
            default:
                return null;
        }
    }
    
}
