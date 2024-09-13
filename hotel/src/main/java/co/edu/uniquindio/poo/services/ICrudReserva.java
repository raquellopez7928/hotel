package co.edu.uniquindio.poo.services;

import co.edu.uniquindio.poo.model.Reserva;

import java.time.LocalDate;

public interface ICrudReserva {
  public String crearReserva(LocalDate fechaEntrada, LocalDate fechaSalidad);

  public String listarReservas();

  public String eliminarReserva(LocalDate fechaEntrada, LocalDate fechaSalida);

  public String modificarReserva(LocalDate fechaEntrada, LocalDate fechaSalida);


}
