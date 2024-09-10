package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Creación de la clase ReservaBuilder 
 */

public class ReservaBuilder {

    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Habitacion habitacion;
    private Cliente cliente;

    /**
     * Set para el atributo FechaEntrada
     * @param fechaEntrada
     * @return
     */

    public ReservaBuilder setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
        return this;
    }

    /**
     * Set para el atributo fechaSalida
     * @param fechaSalida
     * @return
     */

    public ReservaBuilder setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    /**
     * Set de habitacion
     * @param habitacion
     * @return
     */

    public ReservaBuilder setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        return this;
    }

    /**
     * Set de Cliente
     * @param cliente
     * @return
     */

    public ReservaBuilder setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    /**
     * implementación del patrón Builder para la clase ReservaBuilder
     * @return Reserva
     */

    public Reserva build() {
        System.out.println("Reserva creada satisfactoriamente");
        return new Reserva(fechaEntrada, fechaSalida, habitacion, cliente);
    }
}
