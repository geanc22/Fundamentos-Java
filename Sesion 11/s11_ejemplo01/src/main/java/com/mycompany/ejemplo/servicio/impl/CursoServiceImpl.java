/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.servicio.impl;

import com.mycompany.ejemplo.modelo.daos.CursoDao;
import com.mycompany.ejemplo.modelo.daos.impl.DaoFactory;
import com.mycompany.ejemplo.modelo.entidades.Curso;
import com.mycompany.ejemplo.servicio.CursoService;
import com.mycompany.ejemplo.util.Util;
import java.util.List;

/**
 *
 * @author Gean C
 */
public class CursoServiceImpl implements CursoService{
    
    private CursoDao dao;

    public CursoServiceImpl() {
        dao = DaoFactory.getCursoDao(Util.opc);
    }
    
    @Override
    public void grabar(Curso curso) {
        dao.create(curso);
    }

    @Override
    public void actualizar(Curso curso) {
        dao.update(curso);
    }

    @Override
    public void eliminar(String id) {
        dao.delete(id);
    }

    @Override
    public Curso buscar(String id) {
        return dao.find(id);
    }

    @Override
    public List<Curso> listar() {
        return dao.findAll();
    }
}
