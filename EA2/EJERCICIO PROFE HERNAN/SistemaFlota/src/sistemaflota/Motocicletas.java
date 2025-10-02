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
public class Motocicletas extends Vehiculos
{
    private String cilindrada;

    public Motocicletas(String cilindrada, String modelo, String codigo, int año, int diasDisponible, double km, boolean seguroAdicional) {
        super(modelo, codigo, año, diasDisponible, km, seguroAdicional);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
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
                "Cilindrada = " + cilindrada);
    }

    @Override
    public int costoTotal(int dias) {
        double costo = IAlquiler.TARIFA_BASE_ALQUILER * dias;
        if (cilindrada > 600) {
            costo = costo * 1.08;
            
        }
        return (int) costo;
    }
    
}
