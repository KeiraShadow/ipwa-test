import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class BenutzerController {
    @PersistenceContext
    private EntityManager entityManager;

    // ...

    public List<Benutzer> getAllBenutzers() {
        TypedQuery<Benutzer> query = entityManager.createQuery("SELECT b FROM Benutzer b", Benutzer.class);
        return query.getResultList();
    }
}
