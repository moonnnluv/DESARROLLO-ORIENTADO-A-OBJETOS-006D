
public class Medicamento extends Producto {

    private boolean generico;

    public Medicamento() {
    }

    public Medicamento(boolean generico, String codigo, String nombre, int precio) {
        super(codigo, nombre, precio);
        this.generico = generico;
    }

    public boolean isGenerico() {
        return generico;
    }

    public void setGenerico(boolean generico) {
        this.generico = generico;
    }

    @Override
    public double descontar(String dia) {
        if(dia.equalsIgnoreCase("lunes") && generico){
            return getPrecio() * DESCUENTO;
        }
        return 0;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", Generico: "+ generico;
    }

    @Override
    public double recargar() {
        if(!generico){
            return getPrecio()*0.2;
        }
        return 0;    
    }

    
    

    
    
}
