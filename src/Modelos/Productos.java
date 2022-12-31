package Modelos;

import com.mysql.jdbc.Blob;
import java.sql.Date;

public class Productos {
    
    int id;
    String Nombre;
    int Cantidad;
    Double Precio;
    String Proveedor;
    Double Total;
    Date Fecha;
    Blob Imagen;

    public Productos(int id, String Nombre, int Cantidad, Double Precio, String Proveedor, Double Total, Date Fecha, Blob Imagen) {
        this.id = id;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Proveedor = Proveedor;
        this.Total = Total;
        this.Fecha = Fecha;
        this.Imagen = Imagen;
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

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
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

    public Blob getImagen() {
        return Imagen;
    }

    public void setImagen(Blob Imagen) {
        this.Imagen = Imagen;
    }
    
    
    
}
