/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejemplo.modelo.daos;

import com.mycompany.ejemplo.modelo.entidades.Alumno;
import java.util.List;

/**
 *
 * @author Gean C
 */
public interface AlumnoDao {
     public void create(Alumno alumno);
    public void update(Alumno alumno);
    public void delete(String id);
    public Alumno find(String id);
    public List<Alumno> findAll();
}
