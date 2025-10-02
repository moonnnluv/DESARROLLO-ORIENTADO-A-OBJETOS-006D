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
public class Bicicletas extends Vehiculos {
    
    private String tipoBici;

    public Bicicletas(String tipoBici, String modelo, String codigo, int año, int diasDisponible, double km, boolean seguroAdicional) {
        super(modelo, codigo, año, diasDisponible, km, seguroAdicional);
        this.tipoBici = tipoBici;
    }

    public String getTipoBici() {
        return tipoBici;
    }

    public void setTipoBici(String tipoBici) {
        this.tipoBici = tipoBici;
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
                "Tipo Bicicleta = " + tipoBici);
    }

    @Override
    public int costoTotal(int dias) {
        double costo = IAlquiler.TARIFA_BASE_ALQUILER * dias;
        if (tipoBici.compareToIgnoreCase("montaña")) {
            costo = costo = 0.95;
            
        }
        return (int) costo;
    }
    
}
