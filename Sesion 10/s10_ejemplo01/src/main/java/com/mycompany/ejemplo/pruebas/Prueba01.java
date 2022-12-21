/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.pruebas;

import com.mycompany.ejemplo.modelo.daos.CursoDao;
import com.mycompany.ejemplo.modelo.daos.impl.DaoFactory;
import com.mycompany.ejemplo.modelo.entidades.Curso;

/**
 *
 * @author Gean C
 */
public class Prueba01 {
    public static void main(String[] args) {
        Curso c = new Curso("c04","TypeSCript",2);
        CursoDao dao = DaoFactory.getCursoDao(1);
        dao.create(c);
        
        for(Curso curso : dao.findAll()){
            System.out.println(curso);
        }
        
    }
}
    

