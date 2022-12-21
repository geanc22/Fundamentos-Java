package com.certus.ejemplo.controladores;

import com.certus.ejemplo.modelo.entidades.Administrador;
import com.certus.ejemplo.servicio.AdministradorService;
import com.certus.ejemplo.servicio.impl.AdministradorServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginController", urlPatterns = {"/loginController"})
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String us = request.getParameter("txtUsuario");
        String ps = request.getParameter("txtPassword");
        AdministradorService servicio = new AdministradorServiceImpl();
        Administrador adm = servicio.validar(us, ps);
        System.out.println(adm.getNombre());
        HttpSession sesion = request.getSession();
        
        if(adm!=null){
           sesion.setAttribute("elAdministrador", adm);
           
           response.sendRedirect("principal.jsp");
        }else
           response.sendRedirect("error.html");
       
    }

}
