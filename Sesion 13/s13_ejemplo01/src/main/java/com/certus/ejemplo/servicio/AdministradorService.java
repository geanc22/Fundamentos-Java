
package com.certus.ejemplo.servicio;

import com.certus.ejemplo.modelo.entidades.Administrador;

public interface AdministradorService {
    public Administrador validar(String usuario,String password);
}
