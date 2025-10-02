/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofutbol;

public class Partido {
    
    private String local, visita, codigo;
    private int golesL, golesV;

    public Partido(String local, String visita, String codigo, int golesL, int golesV) {
        this.local = local;
        this.visita = visita;
        this.codigo = codigo;
        this.golesL = golesL;
        this.golesV = golesV;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        this.visita = visita;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getGolesL() {
        return golesL;
    }

    public void setGolesL(int golesL) {
        this.golesL = golesL;
    }

    public int getGolesV() {
        return golesV;
    }

    public void setGolesV(int golesV) {
        this.golesV = golesV;
    }
    
    
    // Metodo ganador y cuantos goles
    
    public String resultado()
    {
        if (golesV>golesL)
            // System.out.println("El equipo de visita ganó con "+golesV+"-"+golesL);
            // String ganador = "VISITA";
            return "El equipo de visita ganó con "+golesV+"-"+golesL;
        else if (golesL>golesV)
            // System.out.println("El equipo de local ganó con "+golesL+"-"+golesV);
            // String ganador = "LOCAL";
            return "El equipo de local ganó con "+golesL+"-"+golesV;
        else 
            // System.out.println("Ambos equipos empataron con "+golesL+"-"+golesV);
            // String ganador = "EMPATE";
            return "Ambos equipos empataron con "+golesL+"-"+golesV;
    
 
    } 
    
    // METODO MOSTRAR INFO DEL MAIN
    // to string = devuelve todos los atributos de la clase

    @Override
    public String toString() {
        return "Partido{" + "local=" + local + ", visita=" + visita + ", codigo=" + codigo + ", golesL=" + golesL + ", golesV=" + golesV + '}';
    }
    
    // otra manera
    
    public String mostrarInformacion()
    {
        return "Nombre equipo local: " + local + "\n" +
                "Nombre equipo visitante: " + visita + "\n" +
                "Goles equipo local: " + golesL + "\n" +
                "Goles equipo visitante: " + golesV;
    }
    
    
}
