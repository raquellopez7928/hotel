package co.edu.uniquindio.poo;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Habitacion;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ClienteCRUD clienteCRUD = new ClienteCRUD();

        // Crear Clientes
        Cliente cliente1 = new Cliente("Juan Perez", "12345678");
        Cliente cliente2 = new Cliente("Maria Gomez", "87654321");
        clienteCRUD.crearCliente(cliente1);
        clienteCRUD.crearCliente(cliente2);

        // Leer Cliente
        System.out.println("Leer Cliente: " + clienteCRUD.leerCliente("12345678"));

        // Actualizar Cliente
        clienteCRUD.actualizarCliente("12345678", "Juan Perez Actualizado");

        // Eliminar Cliente
        clienteCRUD.eliminarCliente("87654321");

        // Listar Clientes
        clienteCRUD.listarClientes();
        HabitacionCRUD habitacionCRUD = new HabitacionCRUD();

        // Crear Habitaciones
        Habitacion habitacion1 = new Habitacion(101, "simple", 100.0);
        Habitacion habitacion2 = new Habitacion(102, "doble", 150.0);
        habitacionCRUD.crearHabitacion(habitacion1);
        habitacionCRUD.crearHabitacion(habitacion2);

        // Leer Habitación
        System.out.println("Leer Habitación: " + habitacionCRUD.leerHabitacion(101));

        // Actualizar Habitación
        habitacionCRUD.actualizarHabitacion(101, "suite", 200.0);

        // Eliminar Habitación
        habitacionCRUD.eliminarHabitacion(102);

        // Listar Habitaciones
        habitacionCRUD.listarHabitaciones();


    }
}