
package ejerciciogallinas;


public class EjercicioGallinas {

    public static void main(String[] args)
    {
        // Atributos
    
    
        Gallinas g1, g2;
        String nombre;
        float peso;
        int cant_huevos;
        double porcentaje;
    
        // a. Crear dos objetos de tipo Gallina
        System.out.println("Creando primera gallina...");    
        System.out.println("Ingrese nombre: "); nombre = Leer.dato();
        System.out.println("Ingrese peso: "); peso = Leer.datoFloat();
        System.out.println("Ingrese total huevos: "); cant_huevos = Leer.datoInt();
        
        g1 = new Gallinas(nombre, peso, cant_huevos);
        
        System.out.println("Creando segunda gallina...");    
        System.out.println("Ingrese nombre: "); nombre = Leer.dato();
        System.out.println("Ingrese peso: "); peso = Leer.datoFloat();
        System.out.println("Ingrese total huevos: "); cant_huevos = Leer.datoInt();
        
        g2 = new Gallinas(nombre, peso, cant_huevos);
        
        // b. Mostar la ficha de cada gallina
        g1.ficha();
        g2.ficha();
        
        // c. Dar de comer a la primera gallina
        g1.comer();
        System.out.println("Dando de comer a la primera gallina...");
        
        // d. Modificar la cantidad total de huevos a la segunda gallina
        
        System.out.println("Ingrese la cantidad de huevos de la segunda gallina: ");
        cant_huevos = Leer.datoInt();
        g2.setCant_huevos(int cant_huevos);
        System.out.println("Cantidad modificada");
        
        // e. Sacar huevo a la primera gallina, mostrando la cantidad sacada
        
        
        // f. Faenar a la primera gallina
        
        System.out.println("Ingrese porcentaje de carne faenable de la primera gallina: ");
        porcentaje = Leer.datoDouble();
        
        System.out.println("El porcentaje faenable es "+g1.faenar(porcentaje));
             
        // g. Mostar nuevamente la ficha de ambas gallinas

        
        
    }
    
}
