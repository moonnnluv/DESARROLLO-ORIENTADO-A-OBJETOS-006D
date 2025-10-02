
import java.util.ArrayList;

public class Empresa {

    ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public boolean agregar(Empleado nuevo) {
        for (Empleado empleado : empleados) {
            if (empleado.getRut().equals(nuevo.getRut())) {
                return false;
            }
        }
        return empleados.add(nuevo);
    }

    public void listar() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public boolean eliminar(String rut) {
        for (Empleado empleado : empleados) {
            if (empleado.getRut().equals(rut)) {
                return empleados.remove(empleado);
            }
        }
        return false;
    }

}
