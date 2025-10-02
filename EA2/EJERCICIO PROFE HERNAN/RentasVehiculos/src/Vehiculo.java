

/**
 *
 * @author Hernan
 */
public abstract class Vehiculo implements Alquiler{
    
    protected String codigo,modelo;
    protected int año,diasRenta;
    protected double kilometraje;
    protected boolean seguroAdicional;

    public Vehiculo() {
    }

    public Vehiculo(String codigo, String modelo, int año, int diasRenta, double kilometraje, boolean seguroAdicional) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.año = año;
        this.diasRenta = diasRenta;
        this.kilometraje = kilometraje;
        this.seguroAdicional = seguroAdicional;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDiasRenta() {
        return diasRenta;
    }

    public void setDiasRenta(int diasRenta) {
        this.diasRenta = diasRenta;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isSeguroAdicional() {
        return seguroAdicional;
    }

    public void setSeguroAdicional(boolean seguroAdicional) {
        this.seguroAdicional = seguroAdicional;
    }

   
    public abstract void mostrarInformacion();

     
    
    
}
