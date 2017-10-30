package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "Tarea")
public class tarea implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tarea;
    private String nombre;
    private String descripcion;
    @ManyToMany(mappedBy = "Articulos")
    @OrderBy("id_articulo")
    private Set<articulo> tarea_articulos;

    public tarea() {
    }

    public tarea(ArrayList<articulo> tarea_articulos) {
        this.tarea_articulos = new HashSet();
    }

    public tarea(String nombre, String descripcion, ArrayList<articulo> tarea_articulos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tarea_articulos = new HashSet();
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<articulo> getTarea_articulos() {
        return tarea_articulos;
    }

    public void setTarea_articulos(Set<articulo> tarea_articulos) {
        this.tarea_articulos = tarea_articulos;
    }

}
