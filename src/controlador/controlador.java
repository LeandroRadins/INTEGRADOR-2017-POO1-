package controlador;

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
    
    public tarea buscar_Tarea(){
        
    }

}
