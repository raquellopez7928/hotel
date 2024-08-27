package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Creación de clase Habitación
 */
public class Habitacion {

    private int numero;
    private double precio;
    private TipoHabitacion tipoHabitacion;
    private ArrayList<Servicio> servicios;
    
    /**
     * método constructor de la clase Habitacion
     * @param numero
     * @param precio
     * @param tipoHabitacion
     */
    public Habitacion(int numero, double precio, TipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
        this.servicios = new ArrayList<>();
    }

    /**
     * método agregarServicio
     * @param servicio
     */
    public void agregarServicio(Servicio servicio) {
        if (servicio == null) {
            System.out.println("Servicio no válido.");
            return;
        }
        servicios.add(servicio);
        System.out.println("Servicio añadido a la habitación " + this.numero);
    }

    public void consumirServicios() {
        for (Servicio servicio : servicios) {
            servicio.consumir();
        }
    }

    /**
     * get atributo nombre
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * set atributo numero
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * get atributo precio
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * set atributo precio
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * get ripoHabitacion
     * @return
     */
    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * set tipoHabitacion
     * @param tipoHabitacion
     */

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    /**
     * get de la lista Servicios
     * @return
     */
    public List<Servicio> getServicios() {
        return servicios;
    }

    /**
     * set de la lista Servicios
     * @param servicios
     */

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
    
    /**
     * método toString
     */
    @Override
    public String toString() {
        return "Habitacion [numero=" + numero + ", precio=" + precio + ", tipoHabitacion=" + tipoHabitacion
                + ", servicios=" + servicios + "]";
    }
}

