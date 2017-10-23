package modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Jornalero")
public class jornalero extends tecnico {

    private double jornal;

    public double getJornal() {
        return jornal;
    }

    public void setJornal(double jornal) {
        this.jornal = jornal;
    }

}
