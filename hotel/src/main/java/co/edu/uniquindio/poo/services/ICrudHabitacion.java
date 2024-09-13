package co.edu.uniquindio.poo.services;

import co.edu.uniquindio.poo.model.Habitacion;

import java.util.List;

public interface ICrudHabitacion {
  public boolean crearHabitacion(int numero, double precio);

  public Habitacion leerHabitacion(int numero);

  public boolean actualizarHabitacion(int numero,double precio);

  public boolean eliminarHabitacion(int numero);

  public List<Habitacion> getHabitaciones();
}

