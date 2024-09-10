package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Creación de la clase Hotel
 */

public class Hotel {
    /**
     * Atributos de la clase Hotel y aplicación del patrón Singleton
     */

    private static Hotel instance;
    private String nombre;
    private ArrayList<Habitacion> habitaciones;

    /**
     * Constructor de la clase Hotel
     * @param nombre
     */

    private Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }

    /**
     * Método para obtener la instancia del Hotel
     * @param nombre
     * @return
     */

    public static Hotel getInstancia(String nombre) {
        if (instance == null) {
            instance = new Hotel(nombre);
            System.out.println("Instancia de Hotel creada.");
        }
        return instance;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
        System.out.println("Habitación añadida al hotel.");
    }

    // CRUD - Leer
    public Habitacion obtenerHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                System.out.println("Habitación obtenida.");
                return habitacion;
            }
        }
        System.out.println("Habitación no encontrada.");
        return null;
    }

    /**
     * Método para actualizar habitación
     * @param numero
     * @param nuevoPrecio
     */
    public void actualizarHabitacion(int numero, double nuevoPrecio) {
        Habitacion habitacion = obtenerHabitacion(numero);
        if (habitacion != null) {
            habitacion.setPrecio(nuevoPrecio);
            System.out.println("Habitación actualizada.");
        }
    }

    /**
     * Método eliminar Habitación
     * @param numero
     */
    
    public void eliminarHabitacion(int numero) {
        Habitacion habitacion = obtenerHabitacion(numero);
        if (habitacion != null) {
            habitaciones.remove(habitacion);
            System.out.println("Habitación eliminada.");
        }
    }

    /**
     * get atributo nombre
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * set atributo nombre
     * @param nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * get lista de habitaciones
     * @return
     */
    public List<Habitacion>getHabitaciones(){
        return habitaciones;
    }

    /**
     * Set para la instancia de Hotel
     * @param instance
     */

    public static void setInstance(Hotel instance) {
        Hotel.instance = instance;
    }

    /**
     * Set para la Lista de habitaciones 
     * @param habitaciones
     */

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    
}
