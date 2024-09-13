package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.services.IConsumible;

public class ServicioVacio implements IConsumible {

    @Override
    public void consumir() {
        System.out.println("Servicio elegido");
    }

}
