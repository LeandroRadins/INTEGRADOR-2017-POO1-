package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Reclamo")
public class reclamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reclamo;
    private String descripcion_reclamo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_ingreso;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_estimada;
    @ManyToMany(mappedBy = "reclamos")
    @OrderBy("id_articulo")
    private Set<articulo> reclamo_articulos;

    public reclamo() {
    }

    public reclamo(String descripcion_reclamo, Date fecha_ingreso, Set<articulo> reclamo_articulos) {
        this.descripcion_reclamo = descripcion_reclamo;
        this.fecha_ingreso = fecha_ingreso;
        this.reclamo_articulos = new HashSet();
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

    public Set<articulo> getReclamo_articulos() {
        return reclamo_articulos;
    }

    public void setReclamo_articulos(Set<articulo> reclamo_articulos) {
        this.reclamo_articulos = reclamo_articulos;
    }

}
