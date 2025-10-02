
public class vehiculoPasajeros extends vehiculo {
    
    private int cantidadPasajeros;

    public vehiculoPasajeros(int cantidadPasajeros, String patente, double precioDiario, int diasArriendo) {
        super(patente, precioDiario, diasArriendo);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    
    
}
