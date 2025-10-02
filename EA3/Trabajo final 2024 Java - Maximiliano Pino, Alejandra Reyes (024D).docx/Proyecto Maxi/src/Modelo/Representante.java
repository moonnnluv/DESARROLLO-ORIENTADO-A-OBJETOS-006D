package modelo;

public class Representante {
    private int idRepresentante;
    private String rut;
    private String nombre;
    private String nacionalidad;

    public Representante() {
        // Constructor vacío para inicializar un objeto sin parámetros
    }

    public Representante(int idRepresentante, String rut, String nombre, String nacionalidad) {
        this.idRepresentante = idRepresentante;
        this.rut = rut;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public Representante(String rut, String nombre, String nacionalidad) {
        this.rut = rut;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public int getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(int idRepresentante) {
        this.idRepresentante = idRepresentante;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
