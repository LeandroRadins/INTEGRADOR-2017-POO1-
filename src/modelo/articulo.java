/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class articulo {
    private int id_articulo;
    private String nombre_articulo;
    private String descripcion_articulo;
    private ArrayList<reclamo> articulo_reclamos;

    public articulo(String nombre_articulo, String descripcion_articulo) {
        this.nombre_articulo = nombre_articulo;
        this.descripcion_articulo = descripcion_articulo;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }
    public ArrayList<reclamo> getArticulo_reclamos() {
        return articulo_reclamos;
    }

      public String getDescripcion_articulo() {
        return descripcion_articulo;
    }

    public void setDescripcion_articulo(String descripcion_articulo) {
        this.descripcion_articulo = descripcion_articulo;
    }
    
    public void setArticulo_reclamos(ArrayList<reclamo> articulo_reclamos) {
        this.articulo_reclamos = articulo_reclamos;
    }
    
}
