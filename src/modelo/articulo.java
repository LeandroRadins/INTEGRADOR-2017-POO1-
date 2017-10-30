package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Articulos")
public class articulo implements Serializable {

    @Id
    @SequenceGenerator(name = "sec_arti",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "sec_arti", strategy = GenerationType.SEQUENCE)
    private int id_articulo;
    private String nombre_articulo;
    private String descripcion_articulo;
    @ManyToOne
    private tecnico tecnico;
    @ManyToMany(mappedBy = "articulos")
    @OrderBy ("id_reclamo")
    private Set <reclamo> articulo_reclamos;

    public articulo() {
    }

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
    public String getDescripcion_articulo() {
        return descripcion_articulo;
    }

    public void setDescripcion_articulo(String descripcion_articulo) {
        this.descripcion_articulo = descripcion_articulo;
    }

    public Set <reclamo> getArticulo_reclamos() {
        return articulo_reclamos;
    }

    public void setArticulo_reclamos(Set <reclamo> articulo_reclamos) {
        this.articulo_reclamos = articulo_reclamos;
    }

}
