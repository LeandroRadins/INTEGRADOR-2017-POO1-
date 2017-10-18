package modelo;

import java.util.ArrayList;

abstract class tecnico {
    private int dni;
    private String nombre;
    private String apellido;
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
