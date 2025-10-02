
package sistemaflota;
// Los vehículos que se gestionarán en la flota son autos, motocicletas y bicicletas. Cada vehículo se
// identifica con un modelo, año, kilometraje y los días que estará disponible para renta
// Cada vehículo debe tener un código único alfanumérico para su identificación.
// Cada vehículo puede o no requerir un seguro adicional.
// Debe existir un método para mostrar los datos del vehículo, que sea sobrescrito según el tipo de vehículo.
// Cada clase derivada debe incluir al menos un constructor vacío y otro con todos sus atributos.


// CLASE MADRE
public abstract class Vehiculos implements IAlquiler{
    private String modelo;
    private String codigo;
    private int año;
    private int diasDisponible;
    private double km;
    private boolean seguroAdicional;

    public Vehiculos(String modelo, String codigo, int año, int diasDisponible, double km, boolean seguroAdicional) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.año = año;
        this.diasDisponible = diasDisponible;
        this.km = km;
        this.seguroAdicional = seguroAdicional;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDiasDisponible() {
        return diasDisponible;
    }

    public void setDiasDisponible(int diasDisponible) {
        this.diasDisponible = diasDisponible;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public boolean isSeguroAdicional() {
        return seguroAdicional;
    }

    public void setSeguroAdicional(boolean seguroAdicional) {
        this.seguroAdicional = seguroAdicional;
    }
    
    // METODO MOSTRAR INFO
    
    public abstract void mostrarInformacion();

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
