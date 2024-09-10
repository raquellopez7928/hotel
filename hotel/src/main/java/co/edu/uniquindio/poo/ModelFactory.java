package co.edu.uniquindio.poo;

/**
 * Creación de la clase ModelFactory
 */

public class ModelFactory {

    /**
     * Método de la clase Cliente que se encarga de crear el Cliente
     * @param nombre
     * @param numeroIdentificacion
     * @return
     */
    public static Cliente crearCliente(String nombre, String numeroIdentificacion) {
        System.out.println("Cliente creado satisfactoriamente");
        return new Cliente(nombre, numeroIdentificacion);
    }

    /**
     * Método de la clase Habitación que se encarga de crear la habitación
     * @param numero
     * @param precio
     * @param tipo
     * @return
     */

    public static Habitacion crearHabitacion(int numero, double precio, TipoHabitacion tipo) {
        System.out.println("Habitación creada satisfactoriamente");
        return new Habitacion(numero, precio, tipo);
    }

    
}
