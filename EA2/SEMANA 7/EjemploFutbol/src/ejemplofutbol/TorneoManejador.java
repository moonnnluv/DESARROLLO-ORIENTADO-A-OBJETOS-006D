/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofutbol;

// ACA DEFINIMOS ARRAY LIST

import java.util.ArrayList;


public class TorneoManejador {
    private String nombreTorneo;
    private ArrayList<Partido> pa = new ArrayList<Partido>(); // ya instancio, no debemos usar constructor

    // Lo usamos para instanciar el objeto
    public TorneoManejador(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public ArrayList<Partido> getPa() {
        return pa;
    }

    public void setPa(ArrayList<Partido> pa) {
        this.pa = pa;
    }
    
    // METODO BUSCAR - SE USA EN EL MANEJADOR
    
    public int buscar(String codigo)
    {
        for (int i = 0; i < pa.size(); i++) 
        {
        if (codigo.compareToIgnoreCase(pa.get(i).getCodigo())== 0)
            return i; // EN QUE LUGAR ESTA    
        }
        return -1;
    }
    
    // METODO AGREGAR
    
    public String agregarPartido(Partido pp)
    {
        if (buscar(pp.getCodigo()) == -1)
        {
            pa.add(pp);
        return "Partido agregado correctamente";
        }
        return "Codigo de partido ya existe";
        
    }
    
    // METODO ELIMINAR
    
    public String eliminarPartido(String codigo)
    {
        int posicion= buscar(codigo);
        if (posicion == -1)
        {
            return "Codigo no existe, no puede ser eliminado";
        } else 
        {
            pa.remove(posicion);
            return "Partido eliminado";
        }
    }
    
    // METODO MOSTRAR INFO DEL MAIN
    public String mostrarInformacion(String codigo)
    {
        int pos=buscar(codigo);
        
        return "Nombre equipo local: " + pa.get(pos).getLocal() + "\n" +
                "Nombre equipo visitante: " + pa.get(pos).getVisita() + "\n" +
                "Goles equipo local: " + pa.get(pos).getGolesL() + "\n" +
                "Goles equipo visitante: " + pa.get(pos).getGolesV();
        
    }  
}

