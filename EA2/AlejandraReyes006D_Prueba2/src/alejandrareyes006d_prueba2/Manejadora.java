/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alejandrareyes006d_prueba2;
import java.util.ArrayList;
/**
 *
 * @author PC11
 */
public class Manejadora {
    private ArrayList<Producto>pro = new ArrayList<Producto>();

    public Manejadora() {
    }

    public ArrayList<Producto> getPro() {
        return pro;
    }

    public void setPro(ArrayList<Producto> pro) {
        this.pro = pro;
    }
    
    
    
    public int buscarProducto(String codigo)
    {
        for (int i = 0; i < pro.size(); i++) 
        {
            if(codigo.compareToIgnoreCase(pro.get(i).getCodigo())==0)
                return i;
        }
        return -1;
    }
    
    public String ingresarProducto(Producto p)
    {
        if(buscarProducto(p.getCodigo())==-1)
        {
            pro.add(p);
            return "\t Producto agregado\n";
            
        }
        return "\t Producto ya existe, no se puede agregar\n";
    }  
}
