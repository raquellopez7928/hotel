package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Creación de la clase Reserva
 */
public class Reserva {

    private LocalDate fechaEntrada;
    private LocalDate fechaSalidad;
    private Habitacion habitacion;
    private Cliente cliente;

    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalidad, Habitacion habitacion, Cliente cliente) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalidad = fechaSalidad;
        this.habitacion = habitacion;
        this.cliente = cliente;
    }
    /**
     * get atributo entrada
     * @return
     */
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }
    /**
     * set atributo fechaEntrada
     * @param fechaEntrada
     */
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    /**
     * get atributo fechaSalida
     * @return
     */
    public LocalDate getFechaSalidad() {
        return fechaSalidad;
    }
    /**
     * set fechaSalida
     * @param fechaSalidad
     */
    public void setFechaSalidad(LocalDate fechaSalidad) {
        this.fechaSalidad = fechaSalidad;
    }
    /**
     * get habitacion
     * @return
     */
    public Habitacion getHabitacion() {
        return habitacion;
    }
    /**
     * set habitacion
     * @param habitacion
     */  
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    /*
     * get cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * set cliente
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
