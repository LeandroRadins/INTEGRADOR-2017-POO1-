package sistema;
/**
 *
 * @author Radins Leandro-Rodriguez Fernando
 */
import persistencia.*;
import javax.persistence.*;

public class sistema {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integrador_2017PU");
        persistencia persi = new persistencia(emf);
}
