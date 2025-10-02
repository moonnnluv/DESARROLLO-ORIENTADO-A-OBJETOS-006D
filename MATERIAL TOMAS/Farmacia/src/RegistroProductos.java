
import java.util.ArrayList;


public class RegistroProductos {
    
    ArrayList<Producto> productos;

    public RegistroProductos() {
        productos = new ArrayList<>();
        
    }
    
    public boolean agregar(Producto nuevo){
        for (Producto producto : productos) {
            if(producto.getCodigo().equals(nuevo.getCodigo())){
                return false;
            }            
        }
        return productos.add(nuevo);
    }
    
    public void listar(){
        for (Producto producto : productos){
            System.out.println(producto.mostrar());
        }
    }
    
    public int eliminar(){
        int contador = 0;
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getPrecio() < 1000){
                productos.remove(i);
                contador ++;
                i--;
            }
                       
        }
        return contador;
    }
    
}
