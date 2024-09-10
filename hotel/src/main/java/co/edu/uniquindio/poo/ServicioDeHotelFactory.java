package co.edu.uniquindio.poo;

/**
 * Creación clase ServicioDeHotelFactory que hereda de la clase abstracta ServicioFactory
 */

public class ServicioDeHotelFactory extends ServicioFactory {

    /**
     * Método para crear Servicio
     */
    
    @Override
    public Servicio crearServicio(String tipo) {
        switch (tipo.toLowerCase()) {
            case "spa":
                return new ServicioDeHabitacion("Spa", 50.0);
            case "restaurante":
                return new ServicioDeHabitacion("Restaurante", 100.0);
            default:
                return null;
        }
    }
}
