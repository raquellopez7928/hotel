package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */

public class App {

    public static void main(String[] args) {
        // Crear algunas habitaciones
        Habitacion habitacion1 = new Habitacion(101, 50.0, TipoHabitacion.SIMPLE);
        Habitacion habitacion2 = new Habitacion(102, 80.0, TipoHabitacion.DOBLE);

        // Crear algunos servicios
        ServicioDeHabitacion servicio1 = new ServicioDeHabitacion("Desayuno", 15.0);

        // Añadir servicios a las habitaciones
        habitacion1.agregarServicio(servicio1);

        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan Perez", "12345678");

        // Crear una reserva y asociarla a una habitación
        Reserva reserva1 = cliente1.crearReserva(habitacion1, LocalDate.now(), LocalDate.now().plusDays(3));

        // Consumir los servicios de la habitación reservada
        habitacion1.consumirServicios();
    }
}
