
public class Formulado extends Medicamento {

    private String contraindicaciones;

    public Formulado() {
    }

    public Formulado(String contraindicaciones, boolean generico, String codigo, String nombre, int precio) {
        super(generico, codigo, nombre, precio);
        this.contraindicaciones = contraindicaciones;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", Contraindicaciones: " + contraindicaciones; 
    }

    
    
}
