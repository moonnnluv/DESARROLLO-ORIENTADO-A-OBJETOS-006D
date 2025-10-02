
public class Suplemento extends Producto {

    private int cantidadVitaminas;
    private String infoVitaminas;

    public Suplemento() {
    }

    public Suplemento(int cantidadVitaminas, String infoVitaminas, String codigo, String nombre, int precio) {
        super(codigo, nombre, precio);
        this.cantidadVitaminas = cantidadVitaminas;
        this.infoVitaminas = infoVitaminas;
    }

    public String getInfoVitaminas() {
        return infoVitaminas;
    }

    public void setInfoVitaminas(String infoVitaminas) {
        this.infoVitaminas = infoVitaminas;
    }

    public int getCantidadVitaminas() {
        return cantidadVitaminas;
    }

    public void setCantidadVitaminas(int cantidadVitaminas) {
        this.cantidadVitaminas = cantidadVitaminas;
    }
    
    @Override
    public double descontar(String dia) {
        if(dia.equalsIgnoreCase("lunes")){
            return getPrecio() * DESCUENTO;
        }
        return 0;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", Vitaminas: " + cantidadVitaminas + ", Informacion: " + infoVitaminas; 
    }

    @Override
    public double recargar() {
        return getPrecio()*cantidadVitaminas * 0.02;
    }

    
    
}
