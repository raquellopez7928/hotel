package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class ConsumibleCRUD {

    private List<Consumible> consumibles;

    public ConsumibleCRUD() {
        this.consumibles = new ArrayList<>();
    }

    // Create - Añadir un nuevo consumible
    public void crearConsumible(Consumible consumible) {
        if (consumible != null) {
            consumibles.add(consumible);
            System.out.println("Consumible creado exitosamente: " + consumible.getNombre());
        } else {
            System.out.println("El consumible no puede ser nulo.");
        }
    }

    // Read - Leer la lista de consumibles
    public List<Consumible> leerConsumibles() {
        if (consumibles.isEmpty()) {
            System.out.println("No hay consumibles disponibles.");
        }
        return consumibles;
    }

    // Update - Actualizar un consumible existente
    public void actualizarConsumible(int index, Consumible nuevoConsumible) {
        if (index >= 0 && index < consumibles.size() && nuevoConsumible != null) {
            consumibles.set(index, nuevoConsumible);
            System.out.println("Consumible actualizado exitosamente.");
        } else {
            System.out.println("No se pudo actualizar el consumible.");
        }
    }

    // Delete - Eliminar un consumible
    public void eliminarConsumible(int index) {
        if (index >= 0 && index < consumibles.size()) {
            Consumible eliminado = consumibles.remove(index);
            System.out.println("Consumible eliminado exitosamente: " + eliminado.getNombre());
        } else {
            System.out.println("Índice no válido, no se pudo eliminar el consumible.");
        }
    }

    // Método para listar los consumibles
    public void listarConsumibles() {
        if (consumibles.isEmpty()) {
            System.out.println("No hay consumibles para listar.");
        } else {
            for (int i = 0; i < consumibles.size(); i++) {
                System.out.println("Consumible #" + (i + 1) + ": " + consumibles.get(i).getNombre() + " - Costo: " + consumibles.get(i).getCosto());
            }
        }
    }
}
