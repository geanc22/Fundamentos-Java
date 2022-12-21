/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejemplo.servicio;

import com.mycompany.ejemplo.modelo.entidades.Curso;
import java.util.List;

/**
 *
 * @author Gean C
 */
public interface CursoService {
      public void grabar(Curso curso);
    public void actualizar(Curso curso);
    public void eliminar(String id);
    public Curso buscar(String id);
    public List<Curso> listar();
}
