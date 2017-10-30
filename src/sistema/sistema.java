package sistema;

/**
 *
 * @author Radins Leandro-Rodriguez Fernando
 */
import controlador.controlador;
import persistencia.*;
import javax.persistence.*;

public class sistema {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integrador_2017PU");
        persistencia persi = new persistencia(emf);
        controlador c= new controlador(persi);
        c.agregar_Reclamo("hola", "23/06/18", "25/09/19");

    }
}
