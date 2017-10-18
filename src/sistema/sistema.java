package sistema;
/**
 *
 * @author Radins Leandro-Rodriguez Fernando
 */
import persistencia.*;
import javax.persistence.*;

public class sistema {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("integradorPU2017");
        persistencia persi = new persistencia(emf);
}
