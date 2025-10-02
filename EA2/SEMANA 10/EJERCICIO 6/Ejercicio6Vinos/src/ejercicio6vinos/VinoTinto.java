
package ejercicio6vinos;


public class VinoTinto extends Producto implements IDescuento
{
    private int añoCosecha;

    public VinoTinto(int añoCosecha, Datos unDato, double volumen, String viña, String cepa) {
        super(unDato, volumen, viña, cepa);
        this.añoCosecha = añoCosecha;
    }

    public int getAñoCosecha() {
        return añoCosecha;
    }

    public void setAñoCosecha(int añoCosecha) {
        this.añoCosecha = añoCosecha;
    }
    
    // METODO VERDE
    
    public void verde()
    {
        int total = getUnDato().getValorBase();
        if (añoCosecha == 2017)
        {
            total -=(int)(total*0.178);
            getUnDato().setValorBase(total);
        }
    }
    
    @Override
    public abstract int precio()
    {
        return (int)
    }
    
    
    @Override
    public double descuentoDesc()
    {
        if (añoCosecha>2015 && getViña().compareToIgnoreCase("san pedro") == 0)
            return (int)(DESC*0.096);
        return 0;
    }
}
