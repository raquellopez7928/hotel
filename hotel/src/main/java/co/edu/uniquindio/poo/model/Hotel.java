package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.services.ICrudHabitacion;
import co.edu.uniquindio.poo.services.ICrudReserva;
import co.edu.uniquindio.poo.services.ICrudServicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel implements ICrudReserva, ICrudHabitacion, ICrudServicio {

    private String nombre;
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Servicio> servicios = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    public boolean crearHabitacion(int numero, double precio) {
        if (leerHabitacion(numero) != null) {
            return false; // La habitación ya existe
        }
        Habitacion nuevaHabitacion = new Habitacion(numero, precio);
        habitaciones.add(nuevaHabitacion);
        return true; // Habitación creada exitosamente
    }

    @Override
    public Habitacion leerHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                return habitacion; // Habitación encontrada
            }
        }
        return null; // Habitación no encontrada
    }

    @Override
    public boolean actualizarHabitacion(int numero, double precio) {
        Habitacion habitacion = leerHabitacion(numero);
        if (habitacion != null) {
            habitacion.setPrecio(precio);
            return true; // Habitación actualizada
        }
        return false; // Habitación no encontrada
    }

    @Override
    public boolean eliminarHabitacion(int numero) {
        Habitacion habitacion = leerHabitacion(numero);
        if (habitacion != null) {
            habitaciones.remove(habitacion);
            return true; // Habitación eliminada
        }
        return false; // Habitación no encontrada
    }

    @Override
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    @Override
    public String crearReserva(LocalDate fechaEntrada, LocalDate fechaSalidad) {
        if (fechaEntrada == null || fechaSalidad == null) {
            return "Las fechas de entrada y salida son obligatorias.";
        }
        if (fechaSalidad.isBefore(fechaEntrada)) {
            return "La fecha de salida no puede ser anterior a la fecha de entrada.";
        }
        if (clientes.isEmpty()) {
            return "No hay clientes disponibles para la reserva.";
        }
        if (habitaciones.isEmpty()) {
            return "No hay habitaciones disponibles para la reserva.";
        }
        Habitacion habitacion = habitaciones.get(0);
        Cliente cliente = clientes.get(0);
        Reserva nuevaReserva = new Reserva(fechaEntrada, fechaSalidad, habitacion, cliente);
        reservas.add(nuevaReserva);
        return "Reserva creada exitosamente.";
    }

    @Override
    public String eliminarReserva(LocalDate fechaEntrada, LocalDate fechaSalidad) {
        for (Reserva reserva : reservas) {
            if (reserva.getFechaEntrada().equals(fechaEntrada) && reserva.getFechaSalida().equals(fechaSalidad)) {
                reservas.remove(reserva);
                return "Reserva eliminada exitosamente.";
            }
        }
        return "No se encontró ninguna reserva con las fechas proporcionadas.";
    }
    @Override
    public String listarReservas() {
        if (reservas.isEmpty()) {
            return "No hay reservas disponibles.";
        }

        StringBuilder reservasStr = new StringBuilder();
        for (Reserva reserva : reservas) {
            reservasStr.append("Reserva: Fecha Entrada: ")
                    .append(reserva.getFechaEntrada())
                    .append(", Fecha Salida: ")
                    .append(reserva.getFechaSalida())  // Asegúrate de usar el nombre correcto del método
                    .append(", Habitación: ")
                    .append(reserva.getHabitacion().getNumero())
                    .append(", Cliente: ")
                    .append(reserva.getCliente().getNombre())
                    .append("\n");
        }
        return reservasStr.toString();
    }



    public String modificarReserva(LocalDate fechaEntradaOriginal, LocalDate fechaSalidaOriginal, LocalDate nuevaFechaEntrada, LocalDate nuevaFechaSalida) {
        for (Reserva reserva : reservas) {
            if (reserva.getFechaEntrada().equals(fechaEntradaOriginal) && reserva.getFechaSalida().equals(fechaSalidaOriginal)) {
                if (nuevaFechaEntrada.isAfter(nuevaFechaSalida)) {
                    return "La fecha de entrada no puede ser posterior a la fecha de salida.";
                }
                reserva.setFechaEntrada(nuevaFechaEntrada);
                reserva.setFechaSalida(nuevaFechaSalida);
                return "Reserva modificada exitosamente.";
            }
        }
        return "No se encontró una reserva con las fechas proporcionadas.";
    }
    public String crearServicio(String nombre) {
        // Verificar si el servicio ya existe
        for (Servicio servicio : servicios) {
            if (servicio.getNombre().equalsIgnoreCase(nombre)) {
                return "El servicio ya existe.";
            }
        }

        // Crear un nuevo servicio usando la subclase interna
        Servicio nuevoServicio = new Servicio(nombre, 0.0) {
            public void consumir() {

            }
        };
        // Agregar el nuevo servicio a la lista de servicios
        servicios.add(nuevoServicio);
        return "Servicio creado exitosamente.";
    }

    @Override
    public String eliminarServicio(String nombre) {
        for (Servicio servicio : servicios) {
            if (servicio.getNombre().equalsIgnoreCase(nombre)) {
                servicios.remove(servicio);
                return "Servicio eliminado exitosamente.";
            }
        }
        return "Servicio no encontrado.";
    }

    @Override
    public String modificarServicio(String nombre) {
        for (Servicio servicio : servicios) {
            if (servicio.getNombre().equalsIgnoreCase(nombre)) {
                // Aquí podrías añadir lógica para modificar el servicio si es necesario
                return "Servicio modificado exitosamente.";
            }
        }
        return "Servicio no encontrado.";
    }

    @Override
    public Servicio consultarServicio(String nombre) {
        for (Servicio servicio : servicios) {
            if (servicio.getNombre().equalsIgnoreCase(nombre)) {
                return servicio;
            }
        }
        return null; // Servicio no encontrado
    }

    @Override
    public ArrayList<Servicio> consultarServicios() {
        return new ArrayList<>(servicios); // Devolver una copia de la lista de servicios
    }
}
