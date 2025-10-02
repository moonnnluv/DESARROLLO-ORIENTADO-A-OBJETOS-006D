
public abstract class Producto implements Controlable {

    private String codigo;
    private String nombre;
    private int precio;

    public Producto() {
    }

    public Producto(String codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio > 0){
        this.precio = precio;
        } else {
            System.out.println("Ingrese mayor a cero!.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 2){
        this.nombre = nombre;
    } else{
            System.out.println("Error ingrese un minimo de 3 caracteres!.");
        }
    }

    @Override
    public String mostrar() {
        return "Codigo: " + codigo + ", Nombre: " + nombre +", Precio: " + precio ;
    }

    public abstract double recargar();
    
    public double totalizar(int cantidad, String dia){
        return (precio - descontar(dia) + recargar()) * cantidad;
    }
    
}
