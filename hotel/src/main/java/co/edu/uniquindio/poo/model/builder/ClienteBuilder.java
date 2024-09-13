package co.edu.uniquindio.poo.model.builder;

import co.edu.uniquindio.poo.model.Cliente;

/**
 * Instancias del Builder de la clase Cliente
 */
public class ClienteBuilder {

    protected String nombre;
    protected String numeroIdentificacion;

    public Cliente build() {
        return new Cliente(nombre, numeroIdentificacion);
    }

    public ClienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ClienteBuilder numeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
        return this;
    }
}

