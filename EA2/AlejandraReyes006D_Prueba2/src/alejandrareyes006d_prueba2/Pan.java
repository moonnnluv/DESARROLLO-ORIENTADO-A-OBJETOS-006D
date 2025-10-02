/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alejandrareyes006d_prueba2;

/**
 *
 * @author PC11
 */
public class Pan extends Producto {
    
    // atributos solo de pan
    private String tipoMasa, medida;
    
    
    // constructor

    public Pan(String tipoMasa, String medida, String nombre, String codigo, int valor, int stock) {
        super(nombre, codigo, valor, stock);
        this.tipoMasa = tipoMasa;
        this.medida = medida;
    }
    
    // get y set

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public int descuentoDesc() 
    {
        if (tipoMasa.compareToIgnoreCase("madre") == 0)
        {
            return (int)(Producto.getValor*DESC);
            
        } return 0;
    }

   
    
    
   
    
    
    
}
