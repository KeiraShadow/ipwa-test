import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MeldendePerson extends Person {
    // Additional properties specific to MeldendePerson
    private boolean anonymous;

    // Constructor
    public MeldendePerson(String name, boolean anonymous) {
        setName(name);
        this.anonymous = anonymous;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }
}
