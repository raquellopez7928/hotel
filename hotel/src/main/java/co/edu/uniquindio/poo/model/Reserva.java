package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.model.builder.ReservaBuilder;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

/**
 * Creación de la clase Reserva
 */
public class Reserva {

    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Habitacion habitacion;
    private Cliente cliente;

    /**
     * método constructor de la clase Reserva
     * @param fechaEntrada
     * @param fechaSalida
     * @param habitacion
     * @param cliente
     */
    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, Habitacion habitacion, Cliente cliente) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
        this.cliente = cliente;
    }

    /**
     * get atributo entrada
     * @return
     */
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * set atributo fechaEntrada
     * @param fechaEntrada
     */
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * get atributo fechaSalida
     * @return
     */
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    /**
     * set fechaSalida
     * @param fechaSalidad
     */
    public void setFechaSalida(LocalDate fechaSalidad) {
        this.fechaSalida = fechaSalidad;
    }

    /**
     * get habitacion
     * @return
     */
    public Habitacion getHabitacion() {
        return habitacion;
    }

    /**
     * set habitacion
     * @param habitacion
     */  
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    /*
     * get cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * set cliente
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método para calcular el valor total de la estadía
     * @return
     */
    public double calcularValorEstadia() {
        if (fechaEntrada == null || fechaSalida == null || habitacion == null) {
            System.out.println("Datos incompletos para calcular el valor de la estadía.");
            return 0.0;
        }
        //se calcula el número de noches que el cliente permanece en el hotel utilizando un 
        //cronograma entre la fecha Entrada y fecha de Salida

        long noches = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
        double precioPorNoche = habitacion.getPrecio();
        double valorTotal = noches * precioPorNoche;

        return valorTotal;
    }

    public static ReservaBuilder reservaBuilder(){
        return new ReservaBuilder();
    }
    
    /**
     * creación del método to string 
     * de la clase Reserva
     */
    @Override
    public String toString() {
        return "Reserva [Habitacion: " + habitacion.getNumero() +
               ", Fecha de Entrada: " + fechaEntrada +
               ", Fecha de Salida: " + fechaEntrada + "]";
    }
}

