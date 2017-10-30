package modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Mensual")
public class mensual extends tecnico {

    private double sueldo;

    public mensual() {
        super();
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
