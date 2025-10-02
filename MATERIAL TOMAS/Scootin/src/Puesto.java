
public class Puesto {

    private String codigo;
    private String nombre;

    public Puesto() {
    }

    public Puesto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

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

    @Override
    public String toString() {
        return "Puesto{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    

}
