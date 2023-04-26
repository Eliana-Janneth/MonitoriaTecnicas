import java.util.Date;

public class Venta {
    private String nombrePlato;
    private int cantidad;
    private double precioPagado;
    private Date fecha;
    private Cliente cliente;

    public Venta(String nombre, int cantidad, double precio, Cliente cliente, Date fecha) {
        this.nombrePlato = nombre;
        this.cantidad = cantidad;
        this.precioPagado = precio;
        this.cliente = cliente;
        this.fecha = fecha;
    }
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "plato=" + nombrePlato +
                ", cantidad=" + cantidad +
                ", precioPagado=" + precioPagado +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                '}';
    }
}