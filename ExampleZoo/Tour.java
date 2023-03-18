import java.util.ArrayList;
import java.util.List;

public class Tour {
    private String nombre;
    private List<Habitat> habitats;

    public Tour(String nombre) {
        this.nombre = nombre;
        this.habitats = new ArrayList<>();
    }

    public void agregarHabitat(Habitat habitat) {
        habitats.add(habitat);
    }

    public List<Habitat> getHabitats() {
        return habitats;
    }
}
