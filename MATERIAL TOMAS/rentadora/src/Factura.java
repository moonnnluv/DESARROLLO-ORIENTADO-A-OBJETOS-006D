
public interface Factura {
    
    double IVA = 0.19;
    double DESCUENTOCARGA = 0.03;
    double DESCUENTOPASAJEROS = 0.07;

    double calcularPrecioTotal();
    String obtenerTipo();
    void mostrarBoleta();

}
