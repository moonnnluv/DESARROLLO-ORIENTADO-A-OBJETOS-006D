
package alejandrareyes006d_prueba2;


public abstract class Producto implements IDescuentos {
    
    // atributos en comun entre pan y pasteles
    private String nombre;
    private String codigo;
    private int valor;
    private int stock;
    
   
    // constructor

    public Producto(String nombre, String codigo, int valor, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.valor = valor;
        this.stock = stock;
    }
    
    // get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int total_pago(int valor, int cantidad){
        pago = (valor*cantidad) - Pan.ecologico(int valor);
        return pago;
    } 
    
    
    
}
