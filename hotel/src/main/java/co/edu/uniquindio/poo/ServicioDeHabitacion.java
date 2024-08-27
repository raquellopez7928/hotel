package co.edu.uniquindio.poo;

/**
 * Creación de la clase ServicioDeHabitacion que extiende de Servicio
 */
public class ServicioDeHabitacion extends Servicio {

    /**
     * método constructor de la clase ServicioDeHabitacion
     * @param nombre
     * @param costo
     */
    public ServicioDeHabitacion(String nombre, double costo){
        super(nombre, costo);
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de habitación " + getNombre() + " consumido.");
    }


}
