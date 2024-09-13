package co.edu.uniquindio.poo.model.builder;
import co.edu.uniquindio.poo.model.Habitacion;
import co.edu.uniquindio.poo.model.TipoHabitacion;

public class HabitacionBuilder {

    protected int numero;
    protected double precio;
    protected TipoHabitacion tipoHabitacion;

    public Habitacion build(){
        return new Habitacion(numero,precio,tipoHabitacion);
    }

    public HabitacionBuilder setNumero(int numero){
        this.numero = numero;
        return this;
    }
    public HabitacionBuilder setPrecio(double precio){
        this.precio = precio;
        return this;
    }
    public HabitacionBuilder setTipo(TipoHabitacion tipo){
        this.tipoHabitacion = tipo;
        return this;
    }


}
