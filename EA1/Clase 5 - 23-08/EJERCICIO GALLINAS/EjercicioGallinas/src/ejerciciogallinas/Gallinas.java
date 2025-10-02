
package ejerciciogallinas;

public class Gallinas {
    // Atributos
    
    private String nombre;
    private float peso;
    private int cant_huevos;

    // ctrl derecho + insert code + constructor
    
    public Gallinas(String nombre, float peso, int cant_huevos) {
        this.nombre = nombre;
        this.peso = peso;
        this.cant_huevos = cant_huevos;
    }
    
    // get

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public int getCant_huevos() {
        return cant_huevos;
    }
    
    // set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setCant_huevos(int cant_huevos) {
        this.cant_huevos = cant_huevos;
    }
    
    
    public void comer()
    {
        peso = (float) (peso * 1.135);
        cant_huevos+=(int)(peso)*0.15;
    }
    
    public int sacarHuevo()
    {
        int ss;
        ss = (int) (cant_huevos * 0.75);
        cant_huevos-=ss;
        return ss;
        
    }
    
    public void ficha()
    {
        System.out.println("---------------------------------------------\n" +
                                        "Gallina: \n"+nombre +
                                      "---------------------------------------------\n" +
                                        "Peso: .\n"+peso+ "kg." +
                                        "Total Huevos: "+cant_huevos+" huevos");
 
    }
    
    public double faenar(double x)
    {
        double carne_comible = (peso * x)/100; 
        return carne_comible;
        
    }
    
    
}
