
public class Instagram extends RedSocial {
    private int id;
    private String historia;
    private boolean estado;

    public Instagram() {
    }

    public Instagram(int id, String historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Usuario: " + usuario);
        System.out.println("Historia: " + historia);
    }
    
    @Override
    public void listar(){
        System.out.println("Usuario : " + usuario);
        System.out.println("Password: " + password);
        System.out.println("Id      : " + id);
        System.out.println("Historia: " + historia);
        System.out.println("Estado  : "+ estado);
    }
    
}
