
package proyectocirco;


public class DatosPersonales {
    private String nombre, rut;
    private int sueldo, edad;

    public DatosPersonales(String nombre, String rut, int sueldo, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.sueldo = sueldo;
        this.edad = edad;
    }
    
    // Get

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getEdad() {
        return edad;
    }
    
    // Set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    @Override
    public String toString() {
        return " " + "nombre=" + nombre + ", rut=" + rut + ", sueldo=" + sueldo + ", edad=" + edad + '}';
    }
    
}
