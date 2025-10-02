
import java.time.LocalDate;


public class Twitter extends RedSocial{
    private int id;
    private String noticia;
    private LocalDate fecha;

    public Twitter() {
    }

    public Twitter(int id, String noticia, LocalDate fecha, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Noticia: " + noticia);
    }
            
    
}
