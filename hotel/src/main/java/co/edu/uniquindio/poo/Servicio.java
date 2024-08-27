package co.edu.uniquindio.poo;

public abstract class Servicio implements Consumible{
    private String nombre;
    private double costo;
    /**
     * crea
     * @param nombre
     * @param costo
     */

    public Servicio(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    /**
     * 
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    // Implementación del método consumir
    @Override
    public abstract void consumir();
}