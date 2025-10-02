
public class vehiculoCarga extends Vehiculo implements ArriendoVehiculo {
    private double precioDiario;
    private int cantidadDias;
    private double capacidadCargaKilos;

    public vehiculoCarga(double precioDiario, int cantidadDias, double capacidadCargaKilos, String patente) {
        super(patente);
        this.precioDiario = precioDiario;
        this.cantidadDias = cantidadDias;
        this.capacidadCargaKilos = capacidadCargaKilos;
    }

    public double getCapacidadCargaKilos() {
        return capacidadCargaKilos;
    }

    public void setCapacidadCargaKilos(double capacidadCargaKilos) {
        this.capacidadCargaKilos = capacidadCargaKilos;
    }

    public double getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(double precioDiario) {
        this.precioDiario = precioDiario;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo: Carga");
        System.out.println("Patente: " + getPatente());
        System.out.println("Precio Diario: $" + precioDiario);
        System.out.println("Cantidad de Días: " + cantidadDias + " días");
        System.out.println("Capacidad de Carga: " + capacidadCargaKilos + " kg");
    }

    @Override
    public double calcularPrecioTotal() {
        return (precioDiario * cantidadDias) * (1 - DESCUENTOCARGA) * (1 + IVA);

    }

    @Override
    public String obtenerTipo() {
        return "Carga";
    }

    @Override
    public void mostrarBoleta() {
        System.out.println("Boleta de Pago para Vehículo de Carga:");
        mostrarDatos();
        System.out.println("Precio Total (con descuento y IVA): $" + calcularPrecioTotal());
    
    }
    
    
    
}
