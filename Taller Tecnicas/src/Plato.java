public class Plato implements IPlato{

    private String nombre;
    private String descripcion;
    private Costo costo;
    private double precioVenta;
    private String tipoComida;

    Plato(String nombre, String descripcion, Costo costo, double venta, String tipoComida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = venta;
        this.tipoComida = tipoComida;
    }

    public String getNombrePlato() {
        return this.nombre;
    }
    public double getPrecioVenta( ) {
        return this.precioVenta;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                ", precioVenta=" + precioVenta +
                ", tipoComida='" + tipoComida + '\'' +
                '}';
    }

    @Override
    public void crearplato() {

    }
}
