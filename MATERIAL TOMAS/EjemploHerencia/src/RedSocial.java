
public class RedSocial {
    protected String usuario;
    protected String password;

    public RedSocial() {
    }

    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void mostrarInfo(){
        System.out.println("Usuario: " + usuario);
    }
    
    public void listar(){
        System.out.println("Usuario: " + usuario);
        System.out.println("Password: " + password);
    }
    
}
