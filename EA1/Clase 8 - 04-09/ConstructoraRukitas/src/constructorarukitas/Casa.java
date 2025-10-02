
package constructorarukitas;


public class Casa 
{
    private DatosBase dato;
    private String TipoCasa;
    private boolean Venta;

    public Casa(DatosBase dato, String TipoCasa, boolean Venta) {
        this.dato = dato;
        this.TipoCasa = TipoCasa;
        this.Venta = Venta;
    }
    
    // Get
    public DatosBase getDato() {
        return dato;
    }

    public String getTipoCasa() {
        return TipoCasa;
    }
    
    public boolean isVenta() {    
        return Venta;
    }

    // Set
    public void setDato(DatosBase dato) {
        this.dato = dato;
    }

    public void setTipoCasa(String TipoCasa) {
        this.TipoCasa = TipoCasa;
    }

    public void setVenta(boolean Venta) {
        this.Venta = Venta;
    }
    
    
    // Metodo Oferton
    public boolean oferton(int personas)
    {
    if(personas<5 && TipoCasa.compareToIgnoreCase("pareada")==0)
    {
        Venta=true;
        return true;
    }
    return false;
    }
    
    
    // Metodo Casa Válida
    
    public boolean CasaValida()
    {
        if(TipoCasa.compareToIgnoreCase("Pareada") == 0 || TipoCasa.compareToIgnoreCase("Individual") == 0 ||
                TipoCasa.compareToIgnoreCase("Concreto") == 0 ||
                TipoCasa.compareToIgnoreCase("Madera") == 0 ||
                TipoCasa.compareToIgnoreCase("Vulcanita") == 0)
        {
            return true;
        }
        return false; 
    }
    
    
    // Metodo Costo Propiedad
    
    public int CostoPropiedad(int personas, int metros)
    {
        if(oferton(personas))
        {
            return(int)(dato.getValorMetro()* metros-dato.descuento(personas));
        }
        return (int)(dato.getValorMetro()*metros);
    }
}
