package modelo;

public class Empresa {
    private int idEmpresa;
    private String rut, nombre, giro, comuna;
    private boolean estado;
    private int mes;
    private int año;
    private Representante representante;

    public Empresa(int idEmpresa, String rut, String nombre, String giro, String comuna, boolean estado, int mes, int año, Representante representante) {
        this.idEmpresa = idEmpresa;
        this.rut = rut;
        this.nombre = nombre;
        this.giro = giro;
        this.comuna = comuna;
        this.estado = estado;
        this.mes = mes;
        this.año = año;
        this.representante = representante;
    }

    public Empresa(String rut, String nombre, String giro, String comuna, boolean estado, int mes, int año, Representante representante) {
        this.rut = rut;
        this.nombre = nombre;
        this.giro = giro;
        this.comuna = comuna;
        this.estado = estado;
        this.mes = mes;
        this.año = año;
        this.representante = representante;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
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

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }
}
