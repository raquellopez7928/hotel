package co.edu.uniquindio.poo.model;

public class ServicioLimpieza extends Servicio{

    /**
     * Método constructor de la clase servicioLimpieza
     * @param nombre
     * @param costo
     */
    public ServicioLimpieza(String nombre, double costo){ super(nombre, costo); }

    public ServicioLimpieza() {

    }

    @Override
    public void consumir() {
        System.out.println("Servicio elegido");
    }


}
