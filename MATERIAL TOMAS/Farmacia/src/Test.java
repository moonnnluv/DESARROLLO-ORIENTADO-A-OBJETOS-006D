
public class Test {
    
    public static void main(String[] args) {
        Medicamento m = new Medicamento(false, "001","Paracetamol", 500);
        Suplemento s = new Suplemento(5, "Muchas Vitaminas", "002", "Esteroides", 12000);
        RegistroProductos registro = new RegistroProductos();
        
        System.out.println("Total: " + m.totalizar(3,"lunes"));
        System.out.println("Total: " + s.totalizar(3,"lunes"));

        
        System.out.println(registro.agregar(m));
        System.out.println(registro.agregar(s));
        registro.listar();
        System.out.println("Eliminados: " + registro.eliminar());
    }
    
 
}
