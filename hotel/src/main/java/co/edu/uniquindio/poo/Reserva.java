package co.edu.uniquindio.poo;

import java.time.LocalDate;

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

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalidad() {
        return fechaSalidad;
    }

    public void setFechaSalidad(LocalDate fechaSalidad) {
        this.fechaSalidad = fechaSalidad;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }
    
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
