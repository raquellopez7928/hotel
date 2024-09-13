package co.edu.uniquindio.poo.services;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Habitacion;
import co.edu.uniquindio.poo.model.Reserva;

import java.util.ArrayList;
import java.util.List;

public interface ICrudCliente {
    public String crearCliente(String nombre, String numeroIdentificacion, ArrayList<Reserva> reservas);

    public String editarCliente(String nombre, String numeroIdentificacion);

    public String eliminarCliente(String nombre, String numeroIdentificacion);

    public List<Cliente> listarClientes();

}
