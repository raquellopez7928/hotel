package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

/**
 * Creación de la clase general Hotel
 */
public class Hotel {
    private String nombre;
    private ArrayList<Habitacion>habitaciones;
    
    /**
     * método constructor de la clase Hotel
     * @param nombre
     */
    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones=new ArrayList<>();
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
}
