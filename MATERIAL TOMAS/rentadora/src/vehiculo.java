
public abstract class vehiculo{
    private String patente;

    public vehiculo(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public abstract void mostrarDatos();
    
}
