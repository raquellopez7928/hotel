package co.edu.uniquindio.poo;

public class ServicioDeHabitacion extends Servicio {

    public ServicioDeHabitacion(String nombre, double costo){
        super(nombre, costo);
    }
    @Override
    public void consumir() {
        System.out.println("Servicio de habitación " + getNombre() + " consumido.");
    }


}
