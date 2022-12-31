package Modelos;

import java.sql.Date;

public class Empleados {
    
    int id;
    String Nombres;
    String Apellidos;
    String Celular;
    String Correo;
    String Direccion;
    String Documento;
    Date Ingreso;
    Date Salida;

    public Empleados(int id, String Nombres, String Apellidos, String Celular, String Correo, String Direccion, String Documento, Date Ingreso, Date Salida) {
        this.id = id;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Celular = Celular;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Documento = Documento;
        this.Ingreso = Ingreso;
        this.Salida = Salida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public Date getIngreso() {
        return Ingreso;
    }

    public void setIngreso(Date Ingreso) {
        this.Ingreso = Ingreso;
    }

    public Date getSalida() {
        return Salida;
    }

    public void setSalida(Date Salida) {
        this.Salida = Salida;
    }
    
    
    
}
