package co.edu.uniquindio.poo;

/**
 * Creación clase Servicio
 */
public abstract class Servicio implements Consumible{
    private String nombre;
    private double costo;

    /**
     * método constructor de la clase Hotel
     * @param nombre
     * @param costo
     */
    public Servicio(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
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
     * get atributo costo
     * @return
     */
    public double getCosto() {
        return costo;
    }

    /**
     * set atributo costo
     * @param costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    /**
     * Implementación del método abstracto implementado de la interface consumir
     */
    @Override
    public abstract void consumir();
}