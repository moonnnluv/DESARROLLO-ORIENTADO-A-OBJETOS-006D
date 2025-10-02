/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alejandrareyes006d_prueba2;

/**
 *
 * @author PC11
 */
public class Pasteles extends Producto {
    
    // atributos solo de pasteles
    private boolean relleno;
    
    // constructor

    public Pasteles(boolean relleno, String nombre, String codigo, int valor, int stock) {
        super(nombre, codigo, valor, stock);
        this.relleno = relleno;
    }
    
    // get y set

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    
    
    // METODO ECOLOGICO
    
    public double ecologico(int valor){
        if (relleno == false) {
            valor = (int) (valor * 0.046);
            
        } return valor;
    }



