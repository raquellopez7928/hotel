package co.edu.uniquindio.poo;

public class HabitacionFactory {

    public static Habitacion crearHabitacion(TipoHabitacion tipo, int numero) {
        switch (tipo) {
            case SIMPLE:
                System.out.println("Habitación simple creada.");
                return new Habitacion(numero, 100000, TipoHabitacion.SIMPLE);
            case DOBLE:
                System.out.println("Habitación doble creada.");
                return new Habitacion(numero, 200000, TipoHabitacion.DOBLE);
            case SUITS:
                System.out.println("Suite creada.");
                return new Habitacion(numero, 300000, TipoHabitacion.SUITS);
            default:
                System.out.println("Tipo de habitación no válido.");
                return null;
        }
    }
}
