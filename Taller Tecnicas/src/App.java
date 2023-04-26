import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] ingredientes;

        // Lista de platos
        List<Plato> platos = new ArrayList<>();

        // Lista de ventas
        List<Venta> ventas = new ArrayList<>();

        // Lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        // Menú principal
        boolean seguir = true;
        while (seguir) {
            System.out.println("Bienvenido al sistema de gestión del restaurante");
            System.out.println("1. Registrar un nuevo plato");
            System.out.println("2. Registrar una nueva venta");
            System.out.println("3. Registrar un nuevo cliente");
            System.out.println("4. Mostrar Ventas");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del plato:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese una descripción breve del plato:");
                    String descripcion = sc.nextLine();
                    System.out.println("Ingrese el precio de venta del plato:");
                    double precio = sc.nextDouble();
                    System.out.println("Ingrese el tipo de comida (desayuno, almuerzo o cena):");
                    sc.nextLine();
                    String tipoComida = sc.nextLine();
                    System.out.println("Ingrese la cantidad de ingredientes del plato");

                    // Crear el costo del plato
                    int cantIngredientes = sc.nextInt();
                    ingredientes = new String[cantIngredientes];
                    System.out.println("Ingrese los ingredientes del plato");
                    sc.nextLine();
                    for (int i = 0; i < cantIngredientes; i++) {
                        System.out.println("Ingrediente " + i);
                        ingredientes[i] = sc.nextLine();
                    }
                    System.out.println("Ingrese la mano de obra");
                    int manoObra = sc.nextInt();

                    Costo costo = new Costo(ingredientes, manoObra);

                    // Crear y agregar el nuevo plato a la lista
                    Plato plato = new Plato(nombre, descripcion, costo, precio, tipoComida);
                    platos.add(plato);
                    System.out.println("Plato registrado con éxito.");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del plato vendido:");
                    String nombrePlato = sc.nextLine();

                    // Buscar el plato en la lista
                    Plato platoVendido = null;
                    for (Plato p : platos) {
                        if (p.getNombrePlato().equals(nombrePlato)) {
                            platoVendido = p;
                            System.out.println("Ingrese la cantidad de platos vendidos:");
                            int cantidadVendida = sc.nextInt();

                            Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
                            double precioPagado = p.getPrecioVenta() * cantidadVendida;

                            // Crear el nuevo cliente o buscarlo en la lista
                            Cliente cliente = null;
                            sc.nextLine();
                            System.out.println("Ingrese el documento del cliente (cedula o NIT):");
                            String documento = sc.nextLine();
                            for (Cliente c : clientes) {
                                if (c.getDocumento().equals(documento)) {
                                    cliente = c;
                                    break;
                                } else {
                                    System.out.println("Ingrese el tipo de documento del cliente (cedula o NIT):");
                                    sc.nextLine();
                                    String tipoDocumento = sc.nextLine();
                                    System.out.println("Ingrese el nombre completo del cliente:");
                                    String nombreCliente = sc.nextLine();

                                    // Crear cliente
                                    cliente = new Cliente(documento, tipoDocumento, nombreCliente);
                                    clientes.add(cliente);
                                    System.out.println("Cliente registrado con éxito.");
                                    break;
                                }
                            }
                            Venta venta = new Venta(nombrePlato, cantidadVendida, precioPagado, cliente, fecha);
                            ventas.add(venta);
                            System.out.println("Venta registrada con éxito.");
                            break;
                        }
                        // Si no se encontró el plato, mostrar mensaje de error
                        else if (platoVendido == null) {
                            System.out.println("Error: el plato no se encuentra registrado en el sistema.");
                            break;
                        }
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre completo del cliente:");
                    String nombreCliente = sc.nextLine();
                    System.out.println("Ingrese el número de documento del cliente:");
                    String documento = sc.nextLine();
                    System.out.println("Ingrese el tipo de documento del cliente (cedula o NIT):");
                    String tipoDocumento = sc.nextLine();

                    Cliente cliente = new Cliente(documento, tipoDocumento, nombreCliente);
                    clientes.add(cliente);
                    System.out.println("Cliente registrado con éxito.");
                    break;
                case 4:
                    int sumar = 0;
                    for (Venta venta : ventas) {
                        System.out.println(venta);
                        sumar = sumar + venta.getCantidad();
                    }
                    System.out.println("Las cantidad de platos vendidos es: " + sumar);

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor ingrese una opción válida.");
                    break;
            }
        }
    }
}
