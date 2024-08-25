package co.edu.uniquindio.poo;

import java.util.List;

public class Cliente {

    private String nombre;
    private String numeroIdentificacion;
    private List<Reserva> reservas;
    
    public Cliente(String nombre, String numeroIdentificacion, List<Reserva> reservas) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.reservas = reservas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
    
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }


}
