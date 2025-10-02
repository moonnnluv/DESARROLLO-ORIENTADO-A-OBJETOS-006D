
package proyectocirco;


public class Trabajador {
    
    private DatosPersonales DatosPersonalesCon;
    private int añosServicio;
    private String puesto;

    public Trabajador(DatosPersonales DatosPersonalesCon, int añosServicio, String puesto) {
        this.DatosPersonalesCon = DatosPersonalesCon;
        this.añosServicio = añosServicio;
        this.puesto = puesto;
    }
    
    // Get

    public DatosPersonales getDatosPersonalesCon() {
        return DatosPersonalesCon;
    }

    public int getAñosServicio() {
        return añosServicio;
    }

    public String getPuesto() {
        return puesto;
    }
    
    // Set (todo menos añosServicio)

    public void setDatosPersonalesCon(DatosPersonales DatosPersonalesCon) {
        this.DatosPersonalesCon = DatosPersonalesCon;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    // Metodo Pagar
    
    public int pagar()
    {
        // sueldo
        int ss = 0 ;
        if(añosServicio >= 1 && añosServicio <=5 || DatosPersonalesCon.getEdad() >=18 && DatosPersonalesCon.getEdad() <= 30)
        {
            ss = DatosPersonalesCon.getSueldo();
        }
        if(añosServicio >= 6 && añosServicio <= 10 || DatosPersonalesCon.getEdad() >=31 && DatosPersonalesCon.getEdad() <= 50)
        {
            ss = (int)(DatosPersonalesCon.getSueldo() * 1.15);
        }
        if(añosServicio > 10 || DatosPersonalesCon.getEdad() > 50)
        {
            ss =(int)(DatosPersonalesCon.getSueldo() * 1.25);
        }
        return ss;
        
    }
    
    // Metodo mostrarTrabajador
    
    @Override
    public String toString() {
        return "Trabajador  {  " + "añosServicio=" + añosServicio + ", puesto=" + puesto + '}'+DatosPersonalesCon.toString();
    }
    
    
    // Metodo Finiquitar
    
    public int finiquitar(boolean aviso)
    {
        int pago = 0;
        if(añosServicio > 11)
        {
        pago = pagar() * 11;
        } 
        else 
        {
        pago = pagar() * añosServicio;
        } 
        if(aviso!=true)
        {
            pago = pago + pagar();
        }
        return pago;
    }
    
}
