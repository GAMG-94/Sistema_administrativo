package Modelos;

import java.sql.Date;

public class Registros {
    
    int id;
    float IngresosMes;
    float EgresosMes;
    float NominaMes;
    float TotalMes;
    Date Fecha;

    public Registros(int id, float IngresosMes, float EgresosMes, float NominaMes, float TotalMes, Date Fecha) {
        this.id = id;
        this.IngresosMes = IngresosMes;
        this.EgresosMes = EgresosMes;
        this.NominaMes = NominaMes;
        this.TotalMes = TotalMes;
        this.Fecha = Fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getIngresosMes() {
        return IngresosMes;
    }

    public void setIngresosMes(float IngresosMes) {
        this.IngresosMes = IngresosMes;
    }

    public float getEgresosMes() {
        return EgresosMes;
    }

    public void setEgresosMes(float EgresosMes) {
        this.EgresosMes = EgresosMes;
    }

    public float getNominaMes() {
        return NominaMes;
    }

    public void setNominaMes(float NominaMes) {
        this.NominaMes = NominaMes;
    }

    public float getTotalMes() {
        return TotalMes;
    }

    public void setTotalMes(float TotalMes) {
        this.TotalMes = TotalMes;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
}
