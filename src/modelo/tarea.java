
package modelo;

import java.util.ArrayList;

public class tarea {
    private int id_tarea;
    private String nombre;
    private String descripcion;
    private ArrayList <articulo> tarea_articulos;

    public tarea(ArrayList<articulo> tarea_articulos) {
        this.tarea_articulos = new ArrayList<>();
    }

    public tarea(String nombre, String descripcion, ArrayList<articulo> tarea_articulos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tarea_articulos = new ArrayList<>();
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

    public ArrayList <articulo> getTarea_articulos() {
        return tarea_articulos;
    }

    public void setTarea_articulos(ArrayList <articulo> tarea_articulos) {
        this.tarea_articulos = tarea_articulos;
    }
    
}
