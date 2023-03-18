//Esta clase hereda de la clase Animal
public class AnimalSalvaje extends Animal{
    private String clase;

    public AnimalSalvaje(String nombre, String especie, String clase) {
        super(nombre, especie);
        this.clase = clase;
    }

    public String getclase() {
        return clase;
    }
}
