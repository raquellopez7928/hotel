package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    /**
    * creación de la clase Cliente y su constructor
    */

    public class Cliente {

    private String nombre;
    private String numeroIdentificacion;
    private ArrayList<Reserva> reservas;
    
    /**
     * método constructor clase Cliente
     * @param nombre
     * @param numeroIdentificacion
     */
    public Cliente(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.reservas = new ArrayList<>();
    }

    /**
     * método para mostrar las reservas activas en un cliente
     */
    public void listarReservasYServicios() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas activas para " + this.nombre);
            return;
        }

        System.out.println("Reservas activas para " + this.nombre + ":");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
            Habitacion habitacion = reserva.getHabitacion();
            System.out.println("Servicios asociados a la habitación " + habitacion.getNumero() + ":");
            habitacion.consumirServicios();
        }
    }

    /**
    * método get del atributo nombre
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * método set del atributo nombre
    * @param nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
    * método get del atributo NumeroIdentificación
    * @return numeroIdentificacion
    */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
    * método set del atributo numeroIdentificacion
    * @param numeroIdentificacion
    */
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    /**
    * método de la lista de reservas derivada de la clase Reserva
    * @return reservas
    */
    public List<Reserva> getReservas() {
        return reservas;
    }

    /**
    * método set de la lista reservas derivada de la clase Reserva
    * @param reservas
    */    
    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    /**
    * funcionalidad de crear reserva
    */
    public Reserva crearReserva(Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        if (habitacion == null) {
            System.out.println("Habitación no válida.");
            return null;
        }

        Reserva nuevaReserva = new Reserva(fechaEntrada, fechaSalida, habitacion, null);
        this.reservas.add(nuevaReserva);
        System.out.println("Reserva creada exitosamente para " + this.nombre);
        return nuevaReserva;
    }

}
