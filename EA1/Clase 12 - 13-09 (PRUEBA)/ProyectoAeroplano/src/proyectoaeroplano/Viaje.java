/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaeroplano;

/**
 *
 * @author PC05
 */
public class Viaje {
    
    private Pasajero pj;
    private String tipo, destino;
    private int valorViaje;

    public Viaje(Pasajero pj, String tipo, String destino, int valorViaje) {
        this.pj = pj;
        this.tipo = tipo;
        this.destino = destino;
        this.valorViaje = valorViaje;
    }

    
    
    // Get

    public String getTipo() {
        return tipo;
    }

    public String getDestino() {
        return destino;
    }

    public Pasajero getPj() {
        return pj;
    }

    

    public int getValorViaje() {
        return valorViaje;
    }
    
    // Set

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPj(Pasajero pj) {
        this.pj = pj;
    }

    public void setValorViaje(int valorViaje) {
        this.valorViaje = valorViaje;
    }
    
    // Metodo asignarValor
    
    public int asignarValor(String destino)
    {
        if(destino == "Isla De Pascua")
        {
        valorViaje = 35000;    
        }
        if(destino == "Isla Juan Fernandez")
        {
        valorViaje = 25000;    
        }
        if(destino == "Valle de Azapa")
        {
        valorViaje = 18000;    
        }
        return valorViaje;
    }
    
    // Metodo pagar
    
    public int pagar(int cantDias, int totalPersonas)
    {
        int pagoFinal = 0;
        int pago = 0;
        if(totalPersonas == 6 && tipo == "extra")
        {
           pago = ((valorViaje * cantDias * totalPersonas) - pj.getDepositoInicial());
           pagoFinal = (int) (pago - (pago * 0.35));
        }
        else
        {
           pago = ((valorViaje * cantDias * totalPersonas) - pj.getDepositoInicial());
           pagoFinal = pago;
        }  
        return pagoFinal;    
    }
    
}
