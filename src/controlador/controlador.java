package controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import modelo.*;
import persistencia.*;

public class controlador {

    persistencia persi_Cont;

    public controlador(persistencia persi) {
        this.persi_Cont = persi;
    }

    public List listar_Tareas() {
        return this.persi_Cont.buscarTodosOrdenadosPor(tarea.class, tarea_.id_tarea);
    }

    public tarea buscar_Tarea(int id) {
        return persi_Cont.buscar(tarea.class, id);
    }

    public List listar_Reclamos() {
        return this.persi_Cont.buscarTodosOrdenadosPor(reclamo.class, reclamo_.id_reclamo);
    }

    public reclamo buscar_Reclamo(int id) {
        return this.persi_Cont.buscar(reclamo.class, id);
    }

    public List listar_Reparaciones() {
        return this.persi_Cont.buscarTodosOrdenadosPor(reparacion.class, reparacion_.id_reparacion);
    }

    public reparacion buscar_Reparacion(int id) {
        return this.persi_Cont.buscar(reparacion.class, id);
    }

    /*
    public List listar_Tecnicos_Jornaleros (){
        return this.persi_Cont.buscarTodosOrdenadosPor(jornalero.class, jornalero_.dni);
    }
     */
    public jornalero buscar_Tecnico_Jornal(int id) {
        return this.persi_Cont.buscar(jornalero.class, id);
    }

    /*
    public List listar_Tecnicos_Mensuales(){
        return this.persi_Cont.buscarTodosOrdenadosPor(mensual.class, mensual_.dni);
    }
     */
    public mensual buscar_Tecnico_Mensual(int id) {
        return this.persi_Cont.buscar(mensual.class, id);
    }

    public List listar_Articulos() {
        return this.persi_Cont.buscarTodosOrdenadosPor(articulo.class, articulo_.id_articulo);
    }

    public articulo buscar_Articulo(int id) {
        return this.persi_Cont.buscar(articulo.class, id);
    }

    /*
    public void agregar_Articulo(String nombre_Articulo, String descripcion_Articulo, reclamo r) {
        persi_Cont.iniciarTransaccion();
        try {
            articulo a = new articulo(nombre_Articulo, descripcion_Articulo);
            if (r != null) {
                r.agregar_Articulos(a);
                this.persi_Cont.modificar(r);
            }
            this.persi_Cont.insertar(a);
            this.persi_Cont.confirmarTransaccion();
        } catch (ParseException la) {
            this.persi_Cont.descartarTransaccion();
            System.out.println("No se puede cargar el articulo");
        }
    }
}
}*/
    public void agregar_Reclamo(String descripcion_reclamo, String fecha_ingreso, String fecha_estimada) {
        this.persi_Cont.iniciarTransaccion();
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            reclamo r = new reclamo(descripcion_reclamo.toUpperCase(), formatoFecha.parse(fecha_ingreso),formatoFecha.parse(fecha_estimada));
            this.persi_Cont.insertar(r);
            this.persi_Cont.confirmarTransaccion();
        } catch (ParseException ex) {
            this.persi_Cont.descartarTransaccion();
            System.out.println("No se puede cargar el reclamo");
        }
    }
    
}
