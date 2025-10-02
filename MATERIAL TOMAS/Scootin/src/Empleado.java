
public class Empleado {

    private String rut;
    private String nombre;
    private char genero;
    private int aniosServicio;
    private int edad;
    private Puesto puesto;

    public Empleado() {
    }

    public Empleado(String rut, String nombre, char genero, int aniosServicio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
        this.aniosServicio = aniosServicio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAniosServicio() {
        return aniosServicio;
    }

    public void setAniosServicio(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", nombre=" + nombre + ", genero=" + genero + ", aniosServicio=" + aniosServicio + ", edad=" + edad + ", puesto=" + puesto + '}';
    }

}
