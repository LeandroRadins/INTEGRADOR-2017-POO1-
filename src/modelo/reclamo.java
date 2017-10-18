package modelo;

import java.util.ArrayList;
import java.util.Date;

public class reclamo {

    private int id_reclamo;
    private String descripcion_reclamo;
    private Date fecha_ingreso;
    private Date fecha_estimada;
    private ArrayList <articulo> reclamo_articulos;

    public reclamo() {
    }

    public reclamo(String descripcion_reclamo, Date fecha_ingreso, ArrayList<articulo> reclamo_articulos) {
        this.descripcion_reclamo = descripcion_reclamo;
        this.fecha_ingreso = fecha_ingreso;
        this.reclamo_articulos = reclamo_articulos;
    }
    
    public int getId_reclamo() {
        return id_reclamo;
    }

    public void setId_reclamo(int id_reclamo) {
        this.id_reclamo = id_reclamo;
    }

    public String getDescripcion_reclamo() {
        return descripcion_reclamo;
    }

    public void setDescripcion_reclamo(String descripcion_reclamo) {
        this.descripcion_reclamo = descripcion_reclamo;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_estimada() {
        return fecha_estimada;
    }

    public void setFecha_estimada(Date fecha_estimada) {
        this.fecha_estimada = fecha_estimada;
    }

    public ArrayList <articulo> getReclamo_articulos() {
        return reclamo_articulos;
    }

    public void setReclamo_articulos(ArrayList <articulo> reclamo_articulos) {
        this.reclamo_articulos = reclamo_articulos;
    }
     
}
