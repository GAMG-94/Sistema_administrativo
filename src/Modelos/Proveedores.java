package Modelos;

import java.sql.Date;

public class Proveedores {
    
    int id;
    String Empresa;
    String Vendedor;
    String Celular;
    String Correo;
    Date Fecha;

    public Proveedores(int id, String Empresa, String Vendedor, String Celular, String Correo, Date Fecha) {
        this.id = id;
        this.Empresa = Empresa;
        this.Vendedor = Vendedor;
        this.Celular = Celular;
        this.Correo = Correo;
        this.Fecha = Fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
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

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
}
