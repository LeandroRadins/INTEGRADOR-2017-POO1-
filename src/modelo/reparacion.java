package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Reparacion")
public class reparacion implements Serializable {

    @Id
    private int id_reparacion;
    @Temporal(TemporalType.DATE)
    private Date fecha_finalizacion;
    @ManyToOne
    private reclamo reparacion_reclamos;
    @OneToMany(mappedBy = "reparacion")
    @OrderBy("id_tarea")
    private ArrayList<tarea> reparacion_tareas;
    @ManyToOne
    private tecnico reparacion_tecnicos;

    public int getId_reparacion() {
        return id_reparacion;
    }

    public void setId_reparacion(int id_reparacion) {
        this.id_reparacion = id_reparacion;
    }

    public Date getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(Date fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public ArrayList<tarea> getReparacion_tareas() {
        return reparacion_tareas;
    }

    public void setReparacion_tareas(ArrayList<tarea> reparacion_tareas) {
        this.reparacion_tareas = reparacion_tareas;
    }

    public reclamo getReparacion_reclamos() {
        return reparacion_reclamos;
    }

    public void setReparacion_reclamos(reclamo reparacion_reclamos) {
        this.reparacion_reclamos = reparacion_reclamos;
    }

    public tecnico getReparacion_tecnicos() {
        return reparacion_tecnicos;
    }

    public void setReparacion_tecnicos(tecnico reparacion_tecnicos) {
        this.reparacion_tecnicos = reparacion_tecnicos;
    }


}
