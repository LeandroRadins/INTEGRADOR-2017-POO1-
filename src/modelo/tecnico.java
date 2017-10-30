package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "Tecnico")
abstract class tecnico implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dni;
    private String nombre;
    private String apellido;
    @OneToMany(mappedBy = "Tecnico")
    @OrderBy("id_articulo")
    private ArrayList<articulo> tecnico_articulos;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public ArrayList<articulo> getTecnico_articulos() {
        return tecnico_articulos;
    }

    public void setTecnico_articulos(ArrayList<articulo> tecnico_articulos) {
        this.tecnico_articulos = tecnico_articulos;
    }
}
