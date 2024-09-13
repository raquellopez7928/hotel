package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.services.IConsumible;

public class ServicioFactory {

    public IConsumible getServicio(String eleccionServicio) {

        switch (eleccionServicio.toLowerCase()) {

            case "ServicioLimpieza":
                return new ServicioLimpieza();

            case "ServicioRestaurante":
                return new ServicioRestaurante();

            case "ServicioSpa":
                return new ServicioSpa();

            case "ServicioVacio":
                return new ServicioVacio();

            default:
                return null;


        }

    }
}

