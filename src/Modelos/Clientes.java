package Modelos;

import java.sql.Date;

public class Clientes {   
    
    int id;
    String Nombre;
    String Correo;
    String Celular;
    Date date;
    
    public Clientes(int id, String Nombre, String Correo, String Celular, Date date) {
        this.id = id;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Celular = Celular;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }  
    
}