import java.util.ArrayList;
import java.util.List;

public class ClaseAux {
   private List<ArriendoVehiculo> vehiculos = new ArrayList<>();

    public void agregarVehiculo(ArriendoVehiculo vehiculo) {
        if (!existeVehiculo(vehiculo.getPatente())) {
            vehiculos.add(vehiculo);
        }
    }
    
     public List<ArriendoVehiculo> obtenerVehiculos() {
        return vehiculos;
    }

    
}
