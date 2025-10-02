
package alejandrareyes006d_prueba2;


public class AlejandraReyes006D_Prueba2 {

    
    public static void main(String[] args) {
        Pan pa;
        Pasteles pas;
        Manejadora mane;
        String codigo,nombre,tipoMasa, medida;
        int valor, stock, op=0, cantidad; 
        boolean relleno;
        mane = new Manejadora();
        
        do {
            System.out.print("==== PRODUCTOS ====\n"+
                    "1.	\n" + // MANEJADORA
                    "2.	\n" +
                    "3.	\n" + // MANEJADORA
                    "4.	\n" + // MANEJADORA
                    "5.	\n" +
                    "6.	Ingresar producto\n" +
                    "7.	Mostrar nombre, valor y relleno\n" +
                    "8.	Cantidad de pasteles rellenos\n" +
                    "9.	Venta de producto x\n" +
                    "10. Salir\n" +
                    "");
            System.out.println("\tElija su opción: ");
            op = Leer.datoInt();
            
            switch (op) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                     System.out.println("\tAdios");
                    break;   
            }
            
        } while (op!=10);
        
    }
    
}
