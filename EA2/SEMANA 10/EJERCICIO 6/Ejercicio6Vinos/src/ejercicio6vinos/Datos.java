
package ejercicio6vinos;


public class Datos {
    private String codigo;
    private String nombre;
    private int valorBase;

    public Datos(String codigo, String nombre, int valorBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valorBase = valorBase;
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
        this.nombre = nombre;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }
    
    
}
