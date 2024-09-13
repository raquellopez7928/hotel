package co.edu.uniquindio.poo.services;

import co.edu.uniquindio.poo.model.Servicio;

import java.util.ArrayList;

public interface ICrudServicio {
    public String crearServicio(String nombre);

    public String eliminarServicio(String nombre);

    public String modificarServicio(String nombre);

    public Servicio consultarServicio(String nombre);

    public ArrayList<Servicio> consultarServicios();
}
