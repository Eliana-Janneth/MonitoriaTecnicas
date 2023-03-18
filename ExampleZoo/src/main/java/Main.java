public class Main {
    /* En el método main, se crean instancias de animales de diferentes tipos y se agregan a diferentes hábitats utilizando la composición.
    Luego, se crean dos instancias de tours que agregan los hábitats a través de la agregación.
     */

    public static void main(String[] args) {
        /* La clase "Animal" es la clase base de la jerarquía de clases. Las clases "AnimalDomestico" y "AnimalSalvaje" heredan de la clase "Animal".
         Esto significa que heredan los atributos y métodos de la clase base.
        */

        AnimalDomestico perro = new AnimalDomestico("Perro", "Canino", "Labrador");
        AnimalSalvaje tigre = new AnimalSalvaje("Tigre", "Felino","Mamifero");
        AnimalSalvaje flamenco = new AnimalSalvaje("Flamenco", "Équido","Aves");


        /*En la clase "Habitat" se puede ver un ejemplo de composición ya que esta clase contiene una
        lista de animales que se encuentran en un habitat
        Es decir, la existencia de la lista de animales depende de la existencia del hábitat, por lo que si se elimina el hábitat,
        también se eliminan los animales asociados a él.
        */

        Habitat granja = new Habitat("Granja");
        granja.agregarAnimal(perro);

        Habitat jungla = new Habitat("Jungla");
        jungla.agregarAnimal(tigre);

        Habitat laguna = new Habitat("Laguna");
        laguna.agregarAnimal(flamenco);

       /* En la clase "Tour" se tiene un ejemplo de agregación ya que contiene la lista de habitats que se realizan en un tour.
        Es decir, los hábitats existen independientemente del tour y pueden estar asociados a varios tours diferentes.
        */

        Tour tour1 = new Tour("Tour de Mascotas");
        tour1.agregarHabitat(granja);

        Tour tour2 = new Tour("Safari Salvaje");
        tour2.agregarHabitat(jungla);
        tour2.agregarHabitat(laguna);


    }}
