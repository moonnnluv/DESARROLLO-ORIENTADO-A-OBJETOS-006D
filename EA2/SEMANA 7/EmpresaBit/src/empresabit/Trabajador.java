/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresabit;

/**
 *
 * @author PC03
 */
public class Trabajador {
    // UnDato, Cargo (Supervisor, Profesional, Técnico), cantidad horas normales trabajadas en el mes (arreglo
    // de largo 20, llenado al azar) y cantidad de horas extras trabajadas en el mes (arreglo de largo 20, llenado al azar).
    
    DatosPersonales unDato;
    private String Cargo;
    
    // ARREGLOS
    private int []horasNormales=new int[20];
    private int []horasExtra=new int[20];

    public Trabajador(DatosPersonales unDato, String Cargo) {
        this.unDato = unDato;
        this.Cargo = Cargo;
        
        for (int i = 0; i < horasNormales.length; i++) {
            horasNormales[i]= (int)(Math.random()*9);
        }
        
        for (int i = 0; i < horasExtra.length; i++) {
            horasExtra[i]= (int)(Math.random()*9);
        }
    }

    public DatosPersonales getUnDato() {
        return unDato;
    }

    public void setUnDato(DatosPersonales unDato) {
        this.unDato = unDato;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int[] getHorasNormales() {
        return horasNormales;
    }

    public void setHorasNormales(int[] horasNormales) {
        this.horasNormales = horasNormales;
    }

    public int[] getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int[] horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    
    public int valorHoraNormal()
    {
        int valor = 12000;
        
        if (Cargo.compareToIgnoreCase("Supervisor") == 0) 
        {
            valor = 18500;
        }
        if (Cargo.compareToIgnoreCase("Profesional") == 0) 
        {
            valor = 15700;
        }
        if (Cargo.compareToIgnoreCase("Tecnico") == 0) 
        {
            valor = 12000;
        }
        return valor;
    }
    
    public int sueldoBruto()
    {
        int sueldo = 0, s1 = 0, s2 = 0;
        
        for (int i = 0; i < horasNormales.length; i++) {
            s1+=horasNormales[i];
            s2+=horasExtra[i];
        }
        
        sueldo = (s1 * valorHoraNormal()) + (int)(s2 *(valorHoraNormal() * 1.5));
        
        return sueldo;
    }
    
    
}
