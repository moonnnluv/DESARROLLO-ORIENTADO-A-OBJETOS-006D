
/**
 *
 * @author Hernan
 */
public class Motocicleta extends Vehiculo{

    private int cilindrada;

    public Motocicleta() {
    }

    public Motocicleta(int cilindrada, String codigo, String modelo, int año, int diasRenta, double kilometraje, boolean seguroAdicional) {
        super(codigo, modelo, año, diasRenta, kilometraje, seguroAdicional);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
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
                "Cilindrada= " + cilindrada);
    }

    @Override
    public double costoTotalAlquiler(int dias) {
        double costo = Alquiler.TARIFA_BASE_ALQUILER * dias;
        if (cilindrada > 600) {
            costo = costo * 1.08;
        }
        return costo;
    }
    
}
