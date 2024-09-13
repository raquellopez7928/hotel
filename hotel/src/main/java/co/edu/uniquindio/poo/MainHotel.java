package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.factory.ModelFactory;
import co.edu.uniquindio.poo.model.*;
import co.edu.uniquindio.poo.model.builder.ReservaBuilder;

import java.time.LocalDate;

public class MainHotel {

    public static void main(String[] args) {
    Hotel hotel = new Hotel();

    // Gestionar los clientes y reservas
    crudCliente(hotel);
    crudReserva(hotel);
}

// CRUD para clientes
public static void crudCliente(Hotel hotel) {
    crearCliente(hotel);
    listarClientes(hotel);
    editarCliente(hotel);
    eliminarCliente(hotel);
}

// CRUD para reservas
public static void crudReserva(Hotel hotel) {
    crearReserva(hotel);
    listarReservas(hotel);
    eliminarReserva(hotel);
}

// Métodos CRUD para Cliente
public static void crearCliente(Hotel hotel) {
    boolean creado = hotel.crearCliente("Raquel", "123456789");
    System.out.println("El proceso de creación de cliente ha finalizado con un estado de: " + creado);
}

public static void listarClientes(Hotel hotel) {
    System.out.println("Lista de clientes:");
    for (Cliente cliente : hotel.listarClientes()) {
        System.out.println(cliente.getNombre() + " - " + cliente.getNumeroIdentificacion());
    }
}

public static void editarCliente(Hotel hotel) {
    boolean editado = hotel.editarCliente("Raquel", "987654321");
    System.out.println("El proceso de edición de cliente ha finalizado con un estado de: " + editado);
}

public static void eliminarCliente(Hotel hotel) {
    boolean eliminado = hotel.eliminarCliente("Raquel");
    System.out.println("El proceso de eliminación de cliente ha finalizado con un estado de: " + eliminado);
}

// Métodos CRUD para Reserva
public static void crearReserva(Hotel hotel) {
    LocalDate fechaEntrada = LocalDate.of(2024, 9, 20);
    LocalDate fechaSalida = LocalDate.of(2024, 9, 25);

    boolean creada = hotel.crearReserva(fechaEntrada, fechaSalidad);
    System.out.println("El proceso de creación de reserva ha finalizado con un estado de: " + creada);
}

public static void listarReservas(Hotel hotel) {
    System.out.println("Lista de reservas:");
    for (Reserva reserva : hotel.listarReservas()) {
        System.out.println(reserva);
    }
}

public static void eliminarReserva(Hotel hotel) {
    LocalDate fechaEntrada = LocalDate.of(2024, 9, 20);
    LocalDate fechaSalida = LocalDate.of(2024, 9, 25);

    boolean eliminada = hotel.eliminarReserva(fechaEntrada, fechaSalidad);
    System.out.println("El proceso de eliminación de reserva ha finalizado con un estado de: " + eliminada);
}

    public static void modificarReserva(Hotel hotel) {
        LocalDate fechaEntradaOriginal = LocalDate.of(2024, 9, 20);
        LocalDate fechaSalidaOriginal = LocalDate.of(2024, 9, 25);
        LocalDate nuevaFechaEntrada = LocalDate.of(2024, 9, 22);  // Nuevas fechas
        LocalDate nuevaFechaSalida = LocalDate.of(2024, 9, 27);

        String resultado = hotel.modificarReserva(fechaEntradaOriginal, fechaSalidaOriginal, nuevaFechaEntrada, nuevaFechaSalida);
        System.out.println("El proceso de modificación de reserva ha finalizado con: " + resultado);
    }

    /**    // Singleton para crear la instancia del hotel
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
     */
    
}
