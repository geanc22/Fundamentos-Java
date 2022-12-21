/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejemplo.dao;

import com.mycompany.ejemplo.entidades.Alumno;
import java.util.List;

/**
 *
 * @author Gean C
 */
public interface EntidadDao {
    public void create(Alumno alumno);
    
    public List<Alumno> findAll();
    
    public Alumno find(int id);
    
    public void update(Alumno objAlumno);
     
    public void delete (Alumno alumno);
}





