import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class BergendePerson extends Person {
    // Additional properties specific to BergendePerson
    private List<Geisternetz> zuBergendeNetze;

    // Constructor
    public BergendePerson(String name) {
        setName(name);
        this.zuBergendeNetze = new ArrayList<>();
    }

    public List<Geisternetz> getZuBergendeNetze() {
        return zuBergendeNetze;
    }

    public void setZuBergendeNetze(List<Geisternetz> zuBergendeNetze) {
        this.zuBergendeNetze = zuBergendeNetze;
    }

    public void registerForBergung(Geisternetz geisternetz) {
        zuBergendeNetze.add(geisternetz);
    }

    public List<Geisternetz> getGeisternetzeToRecover() {
        List<Geisternetz> geisternetzeToRecover = new ArrayList<>();
        for (Geisternetz geisternetz : zuBergendeNetze) {
            if (geisternetz.getStatus() != Status.GEBORGEN) {
                geisternetzeToRecover.add(geisternetz);
            }
        }
        return geisternetzeToRecover;
    }
}