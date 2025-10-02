
package sistemaflota;


public class SistemaFlota {

    
    public static void main(String[] args) {
        Manejadora mane = new Manejadora();
        Vehiculos auto1 = new Auto(5, "V01", "Familiar", 2024, 2, 1200, true);
        mane.agregar(auto1);
        mane.agregar(new Auto(6, "V02", "Familiar", 2023, 1, 4200, false));
        mane.agregar(new Auto(3, "V03", "Single", 2022, 4, 5200, true));

        mane.agregar(new Motocicletas(550, "V04", "una", 2024, 3, 1230, true));
        mane.agregar(new Motocicletas(650, "V05", "dos", 2022, 1, 1200, false));

        mane.agregar(new Bicicletas("montaña", "V06", "HH", 2024, 3, 100, false));
        mane.agregar(new Bicicletas("ciudad", "V07", "NN", 2023, 4, 200, false));

        mane.listar();
        System.out.println("Total Vehiculos: " + mane.contar());

        System.out.println("Costo total: " + mane.calcularCostoTotal());

        mane.agregarVehiculo(new Motocicletas(601, "V07", "una", 2024, 3, 1230, true));
        mane.listar();
        System.out.println("Total Vehiculos: " + mane.contar());

        System.out.println("Costo total: " + mane.calcularCostoTotal());
    }
    
}
