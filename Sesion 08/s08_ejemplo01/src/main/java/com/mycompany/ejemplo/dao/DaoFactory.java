/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.dao;

/**
 *
 * @author Gean C
 */
public class DaoFactory {
       public static EntidadDao getAlumoDao(int op){
        switch (op) {
            case 1:
                return new AlumnoDaoMemory();
            case 2:
                return new AlumnoDaoDataBase();
            case 3:
                return new AlumnoDaoMysql();
                
            default:
                return  null;
        }
    }
}
