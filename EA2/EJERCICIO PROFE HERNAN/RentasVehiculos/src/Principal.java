
/**
 *
 * @author Hernan
 */
public class Principal {

    public static void main(String[] args) {

        GestionarFlota gf = new GestionarFlota();

        Vehiculo auto1 = new Auto(5, "V01", "Familiar", 2024, 2, 1200, true);
        gf.agregarVehiculo(auto1);
        gf.agregarVehiculo(new Auto(6, "V02", "Familiar", 2023, 1, 4200, false));
        gf.agregarVehiculo(new Auto(3, "V03", "Single", 2022, 4, 5200, true));

        gf.agregarVehiculo(new Motocicleta(550, "V04", "una", 2024, 3, 1230, true));
        gf.agregarVehiculo(new Motocicleta(650, "V05", "dos", 2022, 1, 1200, false));

        gf.agregarVehiculo(new Bicicleta("montaña", "V06", "HH", 2024, 3, 100, false));
        gf.agregarVehiculo(new Bicicleta("ciudad", "V07", "NN", 2023, 4, 200, false));

        gf.listarVehiculos();
        System.out.println("Total Vehiculos: " + gf.contarVehiculos());

        System.out.println("Costo total: " + gf.calcularCostoTotal());

        gf.agregarVehiculo(new Motocicleta(601, "V07", "una", 2024, 3, 1230, true));
        gf.listarVehiculos();
        System.out.println("Total Vehiculos: " + gf.contarVehiculos());

        System.out.println("Costo total: " + gf.calcularCostoTotal());

    }

}
