package co.edu.uniquindio.poo.model;

public class ServicioRestaurante extends Servicio {

    /**
     *
     * @param nombre
     * @param costo
     */
    public ServicioRestaurante(String nombre, double costo){
        super(nombre, costo);
    }

    public ServicioRestaurante() {

    }

    @Override
    public void consumir() {
        System.out.println("Servicio elegido");
    }



}

