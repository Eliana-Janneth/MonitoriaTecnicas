import java.util.ArrayList;
import java.util.List;
public class Habitat {
    private String nombre;
    private List<Animal> animales;

    public Habitat(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public String getNombre() {
        return nombre;
    }
}
