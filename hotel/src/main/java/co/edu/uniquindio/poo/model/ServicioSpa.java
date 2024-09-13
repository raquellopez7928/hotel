package co.edu.uniquindio.poo.model;

public class ServicioSpa extends Servicio {

    /**
     * Clase abstracta Servicio spa derivada de Servicio
     * @param nombre
     * @param costo
     */
    public ServicioSpa(String nombre, double costo){
        super(nombre, costo);
    }

    public ServicioSpa() {
        super();
    }

    @Override
    public void consumir() {
        System.out.println("Servicio elegido");
    }



}
