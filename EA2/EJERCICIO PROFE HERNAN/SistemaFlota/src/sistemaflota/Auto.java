/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaflota;

/**
 *
 * @author aleja
 */
public class Auto extends Vehiculos
{
    private int cantAsientos;

    public Auto(int cantAsientos, String modelo, String codigo, int año, int diasDisponible, double km, boolean seguroAdicional) {
        super(modelo, codigo, año, diasDisponible, km, seguroAdicional);
        this.cantAsientos = cantAsientos;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
    
    
    

    @Override
    public void mostrarInformacion() {
        
        System.out.println("Vehiculo{" + 
                "Codigo=" + codigo + 
                "Modelo=" + modelo + 
                "Año=" + año + 
                "Dias Renta=" + diasDisponible + 
                "Kilometraje=" + km + 
                "Seguro Adicional=" + seguroAdicional +
                "Cantidad de Asientos = " + cantAsientos);
    }
    

    @Override
    public int costoTotal(int dias) {
        double costo = IAlquiler.TARIFA_BASE_ALQUILER * dias;
        if (this.cantAsientos > 5 && (2024 - this.getAño()) < 5) {
            
            costo = (double) costo * 1.10;
        }
        return (int) costo;
        
    }

    
    
}
