
package constructorarukitas;


public class DatosBase 
{
    private int valorMetro;
    private String tipoConstruccion;

    public DatosBase(int valorMetro, String tipoConstruccion) {
        this.valorMetro = valorMetro;
        this.tipoConstruccion = tipoConstruccion;
    }
    
    // Get
    public int getValorMetro() {
        return valorMetro;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }
    
    // Set
    public void setValorMetro(int valorMetro) {
        this.valorMetro = valorMetro;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }
    
    
    // Metodo Descuento
    
    public int descuento(int personas)
    {
        int dd = 0;
        if(tipoConstruccion.compareToIgnoreCase("Concreto") == 0 && personas > 8)
        {
            dd=(int)(valorMetro*0.150);
        }
        if(tipoConstruccion.compareToIgnoreCase("Madera") == 0 && personas > 5)
        {
            dd=(int)(valorMetro*0.282);
        }
        if(tipoConstruccion.compareToIgnoreCase("Vulcanita") == 0 && personas > 6)
        {
            dd=(int)(valorMetro*0.066);
        }
        return dd;
    } 
}
