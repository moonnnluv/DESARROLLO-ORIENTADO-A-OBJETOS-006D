
package ejercicio6vinos;

// CLASE MADRE

public abstract class Producto {
    private Datos unDato;
    private double volumen;
    private String viña;
    private String cepa;

    public Producto(Datos unDato, double volumen, String viña, String cepa) {
        this.unDato = unDato;
        this.volumen = volumen;
        this.viña = viña;
        this.cepa = cepa;
    }

    public Datos getUnDato() {
        return unDato;
    }

    public void setUnDato(Datos unDato) {
        this.unDato = unDato;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getViña() {
        return viña;
    }

    public void setViña(String viña) {
        this.viña = viña;
    }

    public String getCepa() {
        return cepa;
    }

    public void setCepa(String cepa) {
        this.cepa = cepa;
    }
    
    // METODO PRECIO
    
    public abstract int precio();
}
