/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.dao;

import com.mycompany.ejemplo.entidades.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gean C
 */
public class AlumnoDaoMemory implements EntidadDao{
    
    List<Alumno> lista;
       public AlumnoDaoMemory() {
        lista = new ArrayList<>();
    }
    
    public void create(Alumno alumno){
        lista.add(alumno);
    }
    
    public List<Alumno> findAll(){
        return lista;
    }
    
    public Alumno find(int id){
        for(Alumno alumno:lista){
            if(alumno.getId()==id)
                return alumno;
        }
        return null;
    }
    public void update(Alumno objAlumno){
         for(int i=0; i<lista.size();i++){
            if(lista.get(i).getId()==objAlumno.getId()){
                lista.set(i, objAlumno);
                break;
            }
         }
     }
     
    public void delete (Alumno alumno){
        lista.remove(alumno);
    }
}
