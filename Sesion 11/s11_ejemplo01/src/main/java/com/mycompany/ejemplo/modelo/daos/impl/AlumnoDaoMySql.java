/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.modelo.daos.impl;

import com.mycompany.ejemplo.modelo.daos.AlumnoDao;
import com.mycompany.ejemplo.modelo.entidades.Alumno;
import com.mycompany.ejemplo.util.DbConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gean C
 */
public class AlumnoDaoMySql implements AlumnoDao{
   private List<Alumno> lista;
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public AlumnoDaoMySql() {
        lista = new ArrayList<>();
    }
    
    @Override
    public void create(Alumno alumno) {
        try {
           cn = DbConn.getConnection();
            ps = cn.prepareStatement("insert Alumno values(?,?,?,?,?)");
            ps.setString(1,alumno.getId()); 
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellidos());
            ps.setString(4, alumno.getFechaNacimiento());
            ps.setString(5, alumno.getSexo());
          
            ps.executeUpdate();
            System.out.println("Alumno Grabado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
      }
    }

    @Override
    public void update(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Alumno find(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Alumno> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
