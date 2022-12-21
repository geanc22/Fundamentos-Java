/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejemplo.modelo.daos;

import com.mycompany.ejemplo.modelo.entidades.Curso;
import java.util.List;

/**
 *
 * @author Gean C
 */
public interface CursoDao {
    public void create(Curso curso);
    public void update(Curso curso);
    public void delete(String id);
    public Curso find(String id);
    public List<Curso> findAll();
}
