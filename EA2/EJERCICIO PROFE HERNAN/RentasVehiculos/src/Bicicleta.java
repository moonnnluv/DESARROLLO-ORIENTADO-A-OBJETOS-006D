
/**
 *
 * @author Hernan
 */
public class Bicicleta extends Vehiculo{

    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String tipo, String codigo, String modelo, int año, int diasRenta, double kilometraje, boolean seguroAdicional) {
        super(codigo, modelo, año, diasRenta, kilometraje, seguroAdicional);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
                "Tipo = " + tipo);
    }

    @Override
    public double costoTotalAlquiler(int dias) {
        double costo = Alquiler.TARIFA_BASE_ALQUILER * dias;
        if (tipo.equalsIgnoreCase("montaña")) {
            costo = costo * 0.95;
        }
        return costo;
    }
    
    
    
}
