/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Nancy
 */
public class Cliente {
//<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private int run, telefono;
    private String nombre,mail,direccion;
    private char dv;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Cliente() {
    }

    public Cliente(int run, int telefono, String nombre, String mail, String direccion, char dv) {
        this.run = run;
        this.telefono = telefono;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.dv = dv;
    }    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="GET&SET">   

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }
    
//</editor-fold>

    @Override
    public String toString() {
        return "Cliente{" + "run=" + run + ", telefono=" + telefono + ", nombre=" + nombre + ", mail=" + mail + ", direccion=" + direccion + ", dv=" + dv + '}';
    }
    
    
}
