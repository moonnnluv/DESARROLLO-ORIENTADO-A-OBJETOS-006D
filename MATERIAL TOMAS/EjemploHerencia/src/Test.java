
import java.time.LocalDate;


public class Test {
    
    public static void main(String[] args) {
        Instagram i = new Instagram(1, "plop", true, "Ronix", "Winner");
        Twitter t = new Twitter(1, "Ganadores", LocalDate.now(), "Foppa", "123456");
        
        i.listar();
        System.out.println("*********************************");
        t.listar();
    }
}
