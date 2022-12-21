/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo.modelo.daos.impl;

import com.mycompany.ejemplo.modelo.daos.AdministradorDao;
import com.mycompany.ejemplo.modelo.entidades.Administrador;
import com.mycompany.ejemplo.util.DbConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gean C
 */
public class AdministradorDaoMySql implements AdministradorDao{
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    @Override
     public Administrador login(String us, String ps) {
        Administrador administrador = null;
        try {
            cn = DbConn.getConnection();
            this.ps = cn.prepareStatement(" select * from administrador where chrAdmLogin=? and chrAdmPassword=?");
            this.ps.setString(1, us);
            this.ps.setString(2, ps);
            rs = this.ps.executeQuery();
            if(rs.next()){
                administrador = new Administrador(rs.getString(1),
                                                rs.getString(2),
                                               rs.getString(3),
                                            rs.getString(4),
                                                    rs.getString(5));
            }
        } catch (SQLException ex) {
            System.out.println("Error de conexion");
        }
        return administrador;
    }
    
}
