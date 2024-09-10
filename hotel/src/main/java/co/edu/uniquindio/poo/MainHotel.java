package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class MainHotel {

    public static void main(String[] args) {

        // Singleton para crear la instancia del hotel
        Hotel hotel = Hotel.getInstancia("Hotel El Paraíso");

        // Crear habitaciones usando Factory Method
        Habitacion habitacion1 = Hotel.crearHabitacion(TipoHabitacion.DOBLE, 101);
        Habitacion habitacion2 = Hotel.crearHabitacion(TipoHabitacion.SUITS, 102);
        
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);

        // Crear cliente
        Cliente cliente1 = new Cliente("Leidy Vanesa", "1087643301");

        // Crear reserva usando Builder
        Reserva reserva = new ReservaBuilder()
                .setFechaEntrada(LocalDate.now())
                .setFechaSalida(LocalDate.now().plusDays(3))
                .setHabitacion(habitacion1)
                .setCliente(cliente1)
                .build();

        cliente1.getReservas().add(reserva);

        // Consumir servicios y clonarlos usando Prototype
        ServicioDeHabitacion servicio = new ServicioDeHabitacion("Desayuno", 15.0);
        habitacion1.agregarServicio(servicio);

        ServicioDeHabitacion servicioClonado = servicio.clone();
        habitacion1.agregarServicio(servicioClonado);

        // Listar reservas y servicios
        cliente1.listarReservasYServicios();
    }
}
