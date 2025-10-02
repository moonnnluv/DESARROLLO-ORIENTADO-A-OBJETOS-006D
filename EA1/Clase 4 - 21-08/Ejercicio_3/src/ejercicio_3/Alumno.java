
package ejercicio_3;


public class Alumno {
    // Atributos
    
    private String nombre;
    private float nota1, nota2, cont1, cont2, cont3;
    
    // Constructor -> Método para iniciar objetos

    public Alumno(String nombre, float nota1, float nota2, float cont1, float cont2, float cont3)
    {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.cont1 = cont1;
        this.cont3 = cont2;
        this.cont3 = cont3; 
    }
    
    // Método get y set (mostrar y modificar)

    // GET
    
    public String getNombre() {
        return nombre;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getCont1() {
        return cont1;
    }

    public float getCont2() {
        return cont2;
    }

    public float getCont3() {
        return cont3;
    }
    
    // SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setCont1(float cont1) {
        this.cont1 = cont1;
    }

    public void setCont2(float cont2) {
        this.cont2 = cont2;
    }

    public void setCont3(float cont3) {
        this.cont3 = cont3;
    }
    
    // Promedio controles
    
    public float promCont()
    {
        float prom;
        prom = (cont1 + cont2 + cont3)/3;
        return prom;
    }
    
    // Nota de presentación
    
    public double notaPresentacion()
    {
        return ((nota1 * 0.35) + (nota2 * 0.40) + (promCont() * 0.25 ));
    }
    
    // Nota final
    
    public double notaFinal(float notaExamen)
    {
        return ((notaPresentacion()* 0.6 + (notaExamen * 0.4) ));
    }
    
    // Estado de aprobación
    
    public String aprobacion(float notaExamen)
    {
        if (notaFinal(notaExamen) >= 3.95)
        {
            return "Aprobaste la asignatura.";
        }
        else
        {
            return "Reprobaste la asignatura";
        }
    }
    

    
}
