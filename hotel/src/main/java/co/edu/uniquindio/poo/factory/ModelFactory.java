package co.edu.uniquindio.poo.factory;

import co.edu.uniquindio.poo.model.*;
import co.edu.uniquindio.poo.services.ICrudCliente;
import co.edu.uniquindio.poo.services.ICrudHabitacion;
import co.edu.uniquindio.poo.services.ICrudReserva;
import co.edu.uniquindio.poo.services.ICrudServicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Creación de la clase ModelFactory
 */

public class ModelFactory implements ICrudCliente, ICrudServicio, ICrudHabitacion, ICrudReserva {
public static ModelFactory instance;
private static Hotel hotel;

private ModelFactory(){
    inicializarDatos();
}

/**
 * Método para obtener la instancia del Hotel
 * @param
 * @return
 */

public static ModelFactory getInstance() {
    if (instance == null) {
        instance = new ModelFactory();
    }
    return instance;
}

    Reserva reserva = Reserva.reservaBuilder().setFechaEntrada(LocalDate.now()).build();

    @Override
    public boolean crearCliente(String nombre, String numeroIdentificacion) {
        return hotel.crearCliente(nombre, numeroIdentificacion);
    }

    @Override
    public boolean modificarCliente(String nombre, String numeroIdentificacion){
        return hotel.modificarCliente(nombre, numeroIdentificacion);
    }

    public static Habitacion crearHabitacion(int numero, double precio, TipoHabitacion tipo) {
        System.out.println("Habitación creada satisfactoriamente");
        return new Habitacion(numero, precio, tipo);
    }


    @Override
    public String editarCliente(Cliente cliente) {
        return hotel.editarCliente(cliente);
    }

    @Override
    public String eliminarCliente(int id) {
        return hotel.eliminarCliente(id);
    }

    @Override
    public List<Cliente> listarClientes() {
        return hotel.listarClientes();
    }

    @Override
    public boolean crearHabitacion(Habitacion habitacion) {
        return hotel.crearHabitacion(habitacion);
    }

    @Override
    public Habitacion leerHabitacion(int numero) {
        return hotel.leerHabitacion(numero);
    }

    @Override
    public boolean actualizarHabitacion(Habitacion habitacion) {
        return hotel.actualizarHabitacion(habitacion);
    }

    @Override
    public boolean eliminarHabitacion(int numero) {
        return hotel.eliminarHabitacion(numero);
    }

    @Override
    public List<Habitacion> getHabitaciones() {
        return hotel.getHabitaciones();
    }

    @Override
    public String crearReserva(Reserva reserva) {
        return hotel.crearReserva(reserva);
    }

    @Override
    public String listarReservas() {
        return hotel.listarReservas();
    }

    @Override
    public String eliminarReserva(int id) {
        return hotel.eliminarReserva(id);
    }

    @Override
    public String modificarReserva(Reserva reserva) {
        return hotel.modificarReserva(reserva);
    }

    @Override
    public Reserva consultarReserva(int id) {
        return hotel.consultarReserva(id);
    }

    @Override
    public String crearServicio(Servicio servicio) {
        return hotel.crearServicios(servicio);
    }

    @Override
    public String eliminarServicio(int id) {
        return hotel.eliminarServicio(id);
    }

    @Override
    public String modificarServicio(Servicio servicio) {
        return hotel.modificarServicio(servicio);
    }

    @Override
    public Servicio consultarServicio(int id) {
        return hotel.consultarServicio(id);
    }

    @Override
    public ArrayList<Servicio> consultarServicios() {
        return hotel.consultarServicios.;
    }
    private static void inicializarDatos(){
        Hotel hotel= new Hotel();
        hotel.setNombre("Hotel Paradise");

        //clientes
        Cliente cliente1= new Cliente();
        cliente1.setNombre("Raquel");
        cliente1.setNumeroIdentificacion("1091884575");

        Cliente cliente2= new Cliente();
        cliente1.setNombre("Leidy");
        cliente1.setNumeroIdentificacion("1087643301");

        Cliente cliente3=new Cliente();
        cliente3.setNombre("Lawrence");
        cliente3.setNumeroIdentificacion("1114541590");

        //habitaciones
        Habitacion habitacion1 = new Habitacion();
        habitacion1.setNumero(105);
        habitacion1.setPrecio(3000.7);

        Habitacion habitacion2= new Habitacion();
        habitacion2.setNumero(203);
        habitacion2.setPrecio(4000.2);

        Habitacion habitacion3= new Habitacion();
        habitacion3.setNumero(400);
        habitacion3.setPrecio(5500.6);

        //reservas
        Reserva reserva1 = new Reserva();
        reserva1.setFechaEntrada(LocalDate.now());
        reserva1.setFechaSalida(LocalDate.now());
        reserva1.setHabitacion(habitacion1);

        Reserva reserva2 = new Reserva() ;
        reserva2.setFechaEntrada(LocalDate.now());
        reserva2.setFechaSalida(LocalDate.now());
        reserva2.setHabitacion(habitacion2);

        Reserva reserva3 = new Reserva();
        reserva3.setFechaEntrada(LocalDate.now());
        reserva3.setFechaSalida(LocalDate.now());
        reserva3.setHabitacion(habitacion3);

        //Servicios
        Servicio servicio1 = new Servicio();
        servicio1.setNombre("Servicio Spa");
        servicio1.setCosto(50300.98);

        Servicio servicio2 = new Servicio();
        servicio2.setNombre("Servicio Restaurante");
        servicio2.setCosto(5000.00);

        Servicio servicio3 =new Servicio();
        servicio3.setNombre("Servicio Laptop");
        servicio3.setCosto(6000.00);
        }


    }
}
