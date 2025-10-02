
public class Test {

    public static void main(String[] args) {
        Puesto p1 = new Puesto("01", "Asistente");
        Puesto p2 = new Puesto("02", "Programador");

        Empleado e1 = new Empleado("12345678-9", "Juan Perez", 'M', 2, 26, p1);
        Empleado e2 = new Empleado("98765432-1", "Sebastian Negro", 'M', 6, 32, p2);
        
        Empresa emp = new Empresa();
        
        System.out.println(emp.agregar(e1));
        System.out.println(emp.agregar(e2));
        System.out.println(emp.agregar(e2));
        
        emp.listar();
        
        System.out.println(emp.eliminar("12345678-9"));
        System.out.println(emp.eliminar("11111111-1"));
        
        emp.listar();
    }
}
