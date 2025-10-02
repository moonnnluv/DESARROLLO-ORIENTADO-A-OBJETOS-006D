package empresa_losinformáticos_menu;


public class Empresa_LosInformáticos_Menu {

    public static void main(String[] args) {
        int num1, num2, suma, peso;
        char op;
        String nombre;
        
        System.out.print("""
                           Los informáticos
                           *** ************
                           1.Saludar
                           2.Sumar 2 números
                           3.Dieta
                           4.Salir
                         
                           Elija Opción: """);
        
        op=Leer.datoChar();
        
        switch (op) {
            case '1':
                System.out.print("Ingrese su nombre: ");
                nombre = Leer.dato();
                System.out.println("Hola "+nombre+", bienvenido/a a Java");    
                break;
            case '2':
                System.out.print("Ingrese el primero numero: ");
                num1=Leer.datoInt();
                System.out.print("Ingrese el segundo numero: ");
                num2=Leer.datoInt();
                
                suma = num1 + num2;
                
                System.out.println("La suma de "+num1+" y "+num2+" es "+suma);

                break;
            case '3':
                System.out.print("Ingrese su peso: ");
                peso = Leer.datoInt();
                if (peso> 75)
                {
                    System.out.println("Debes hacer dieta");
                } 
                else if (peso >=60 && peso<= 75) 
                {
                    System.out.println("Estas en el peso ideal");
                }
                else if (peso < 60)
                {
                    System.out.println("Debes comer mas");
                }
                break;
            case '4':
                
                break;
            default:
                System.out.println("Ingrese una opción válida.");
        }
    }
    
}
