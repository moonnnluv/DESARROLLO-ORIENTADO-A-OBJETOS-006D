/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaeroplano;

/**
 *
 * @author PC05
 */
public class Pasajero {
    // Deposito es no modificable, no se debe crear el Set
    private int id, depositoInicial, edad;

    public Pasajero(int id, int depositoInicial, int edad) {
        this.id = id;
        this.depositoInicial = depositoInicial;
        this.edad = edad;
    }
    
    // Set

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Get

    public int getId() {
        return id;
    }

    public int getDepositoInicial() {
        return depositoInicial;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
    
    
}
