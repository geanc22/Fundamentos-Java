package com.certus.ejemplo.modelo.daos;

import com.certus.ejemplo.modelo.entidades.Administrador;

public interface AdministradorDao {
    public Administrador login(String us, String ps);
}
