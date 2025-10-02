/**
 *
 * @author Hernan
 */
public class Auto extends Vehiculo{

    private int cantidadAsientos;
   

    public Auto() {
    }

    public Auto(int cantidadAsientos, String codigo, String modelo, int año, int diasRenta, double kilometraje, boolean seguroAdicional) {
        super(codigo, modelo, año, diasRenta, kilometraje, seguroAdicional);
        this.cantidadAsientos = cantidadAsientos;
        
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

     
    
    
    @Override
    public void mostrarInformacion() {
        
        System.out.println("Vehiculo{" + 
                "Codigo=" + codigo + 
                "Modelo=" + modelo + 
                "Año=" + año + 
                "Dias Renta=" + diasRenta + 
                "Kilometraje=" + kilometraje + 
                "Seguro Adicional=" + seguroAdicional +
                "Cantidad de Asientos = " + cantidadAsientos);
        
    }
    
    
    @Override
    public double costoTotalAlquiler(int dias) {
        
        double costo = Alquiler.TARIFA_BASE_ALQUILER * dias;
        if (this.getCantidadAsientos() > 5 && (2024 - this.getAño() < 5) ) {
            costo = costo * 1.10;
        }
        return costo;
    }

   
  

    
}
