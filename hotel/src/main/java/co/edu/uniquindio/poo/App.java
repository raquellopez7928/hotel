package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Crear algunas habitaciones
        Habitacion habitacion1 = new Habitacion(101, 250000.0, TipoHabitacion.DOBLE, new ArrayList<>());
        Habitacion habitacion2 = new Habitacion(102, 300000, TipoHabitacion.SUITS, new ArrayList<>());

        // Crear un cliente
        ArrayList<Reserva> reservas = new ArrayList<>();
        Cliente cliente1 = new Cliente("Leidy Vanesa Muñoz Bolaños", "1087643301", new ArrayList<>());

        // Crear una reserva y asociarla a una habitación
        cliente1.crearReserva(habitacion1, LocalDate.now(), LocalDate.now().plusDays(3));

        // Añadir y consumir un servicio en la habitación
        ServicioDeHabitacion servicio1 = new ServicioDeHabitacion("Desayuno", 15.0);
        habitacion1.agregarServicio(servicio1);

        // Listar las reservas y servicios asociados
        cliente1.listarReservasYServicios();
    }
}