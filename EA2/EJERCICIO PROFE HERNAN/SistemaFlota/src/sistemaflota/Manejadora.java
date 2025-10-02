/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaflota;

import java.util.ArrayList;

public class Manejadora {
    public ArrayList<Vehiculos> listaVehiculos;

    public Manejadora() {
        
        listaVehiculos = new ArrayList<>();
        
    }
    
    
    // BUSCAR
    
    public boolean buscar(String codigo){
        for (Vehiculos vehic : listaVehiculos) {
            if (vehic.getCodigo().compareToIgnoreCase(codigo)) {
                return true;
                
            }
        }
        return false;
    }
   
        // AGREGAR
    public void agregar(Vehiculos vehic) {
        if (buscar(vehic.getCodigo()) == false) {
            listaVehiculos.add(vehic);
            System.out.println("Vehiculo agregado exitosamente!");
        } else {
            System.out.println("Ya existe el vehiculo");
        }
    }

    // LISTAR
    public void listar() {
        for (Vehiculos vehi : listaVehiculos) {
            vehi.mostrarInformacion();
        }
    }

    // CONTAR
    public int contar() {
        int total = listaVehiculos.size();
        return total;
    }

    // COSTO TOTAL FINAL
    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (Vehiculos ve : listaVehiculos) {
            costoTotal = costoTotal + ve.costoTotal(ve.getDiasDisponible());
        }
        return costoTotal;
    }
    
    
}
