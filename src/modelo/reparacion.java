package modelo;

import java.util.ArrayList;
import java.util.Date;

public class reparacion {

    private int id_reparacion;
    private Date fecha_finalizacion;
    private ArrayList<reclamo> reparacion_reclamos;
    private ArrayList<tarea> reparacion_tareas;
    private ArrayList<tecnico>reparacion_tecnicos;

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

    public ArrayList<reclamo> getReparacion_reclamos() {
        return reparacion_reclamos;
    }

    public void setReparacion_reclamos(ArrayList<reclamo> reparacion_reclamos) {
        this.reparacion_reclamos = reparacion_reclamos;
    }

    public ArrayList<tarea> getReparacion_tareas() {
        return reparacion_tareas;
    }

    public void setReparacion_tareas(ArrayList<tarea> reparacion_tareas) {
        this.reparacion_tareas = reparacion_tareas;
    }

    public ArrayList<tecnico> getReparacion_tecnicos() {
        return reparacion_tecnicos;
    }

    public void setReparacion_tecnicos(ArrayList<tecnico> reparacion_tecnicos) {
        this.reparacion_tecnicos = reparacion_tecnicos;
    }
    
    
}
