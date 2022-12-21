package com.certus.ejemplo.modelo.entidades;

public class Administrador {
    private String codigo;
    private String login;
    private String password;
    private String nombre;
    private String apellido;

    public Administrador() {
    }

    public Administrador(String codigo, String login, String password, String nombre, String apellido) {
        this.codigo = codigo;
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Administrador{");
        sb.append("codigo=").append(codigo);
        sb.append(", login=").append(login);
        sb.append(", password=").append(password);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }

  
    
    
}
