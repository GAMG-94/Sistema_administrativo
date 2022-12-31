package Modelos;

import java.sql.Date;

public class Ventas {
    
    int id;
    String Nom_Producto;
    int Cantidad;
    Double Total;
    Date Fecha;

    public Ventas(int id, String Nom_Producto, int Cantidad, Double Total, Date Fecha) {
        this.id = id;
        this.Nom_Producto = Nom_Producto;
        this.Cantidad = Cantidad;
        this.Total = Total;
        this.Fecha = Fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_Producto() {
        return Nom_Producto;
    }

    public void setNom_Producto(String Nom_Producto) {
        this.Nom_Producto = Nom_Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
}
