package co.edu.uniquindio.poo;

import java.util.List;

public class Habitacion {

    private int numero;
    private double precio;
    private TipoHabitacion tipoHabitacion;
    private List <Servicio> servicios;

    public Habitacion(int numero, double precio, TipoHabitacion tipoHabitacion, List<Servicio> servicios) {
        this.numero = numero;
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
        this.servicios = servicios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
    @Override
    public String toString() {
        return "Habitacion [numero=" + numero + ", precio=" + precio + ", tipoHabitacion=" + tipoHabitacion
                + ", servicios=" + servicios + "]";
    }
}

