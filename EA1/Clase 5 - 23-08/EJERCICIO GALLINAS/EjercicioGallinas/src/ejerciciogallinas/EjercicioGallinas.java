
package ejerciciogallinas;


// a. Crear dos objetos de tipo Gallina
// b. Mostar la ficha de cada gallina
// c. Dar de comer a la primera gallina
// d. Modificar la cantidad total de huevos a la segunda gallina
// e. Sacar huevo a la primera gallina, mostrando la cantidad sacada
// f. Faenar a la primera gallina
// g. Mostar nuevamente la ficha de ambas gallinas

public class EjercicioGallinas {

    public static void main(String[] args)
    {
        // Atributos
    
    Gallinas g1, g2;
    String nombre;
    float peso;
    int cant_huevos;
    double porcentaje;
    
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
        
        
        g1.ficha();
        g2.ficha();
    }
    
}
