//Esta clase hereda de la clase Animal
public class AnimalDomestico extends  Animal {
    private String raza;

    public AnimalDomestico(String nombre, String especie, String raza) {
        super(nombre, especie);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }
}
