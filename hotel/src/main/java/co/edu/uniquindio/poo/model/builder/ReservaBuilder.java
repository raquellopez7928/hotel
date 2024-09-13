package co.edu.uniquindio.poo.model.builder;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Habitacion;
import co.edu.uniquindio.poo.model.Reserva;

import java.time.LocalDate;

/**
 * Creación de la clase ReservaBuilder 
 */

public class ReservaBuilder {

    protected LocalDate fechaEntrada;
    protected LocalDate fechaSalida;
    protected Habitacion habitacion;
    protected Cliente cliente;

    /**
     * implementación del patrón Builder para la clase ReservaBuilder
     * @return Reserva
     */

    public Reserva build() {
        return new Reserva(fechaEntrada, fechaSalida, habitacion, cliente);
    }

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
}
