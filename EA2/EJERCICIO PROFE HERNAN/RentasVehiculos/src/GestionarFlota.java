
import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public class GestionarFlota {

    public ArrayList<Vehiculo> listaVehiuculos;

    public GestionarFlota() {
        listaVehiuculos = new ArrayList<>();
    }

    public boolean buscarFlota(String codigo) {
        //fore+tab
        for (Vehiculo vehic : listaVehiuculos) {
            if (vehic.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

    public void agregarVehiculo(Vehiculo vehic) {
        if (buscarFlota(vehic.getCodigo()) == false) {
            listaVehiuculos.add(vehic);
            System.out.println("Vehiculo agregado exitosamente!");
        } else {
            System.out.println("Ya existe el vehiculo");
        }
    }

    public void listarVehiculos() {
        for (Vehiculo vehi : listaVehiuculos) {
            vehi.mostrarInformacion();
        }
    }

    public int contarVehiculos() {
        int total = listaVehiuculos.size();
        return total;
    }

    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (Vehiculo ve : listaVehiuculos) {
            costoTotal = costoTotal + ve.costoTotalAlquiler(ve.getDiasRenta());
        }
        return costoTotal;
    }

}
