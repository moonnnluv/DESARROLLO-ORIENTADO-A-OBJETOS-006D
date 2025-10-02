package empresa_losinformáticos_menu;


public class Menu2 {

    public static void main(String[] args) {
        int num1, num2, suma, peso, num3, num4, num5;
        boolean num6;
        char op;
        String nombre;
        
        System.out.print("""
                           Los informáticos
                           *** ************
                           1.Saludar
                           2.Sumar 2 números
                           3.Dieta
                           4.Ingresar tres números y mostrar al mayor de los tres
                           5.Ingresar un número y mostrar si es par o impar
                           6.Salir
                         
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
                // falta terminar el caso 4
            case '4':
                System.out.print("Ingrese el primero numero: ");
                num3=Leer.datoInt();
                System.out.print("Ingrese el segundo numero: ");
                num4=Leer.datoInt();   
                System.out.print("Ingrese el tercer numero: ");
                num5=Leer.datoInt();
                
                if (num3 > num4)
                {
                    System.out.println("");
                } else if (num4 > num5)
                {
                    System.out.println("");
                }
                break;
            case '5':
                System.out.print("Ingrese el numero: ");
                num6=Leer.datoBoolean();
                
                if (num6 % 0)
                {
                    System.out.println("El numero es par");
                } 
                else
                {
                    System.out.println("El numero es impar");
                }
                break;




                
            case '6':
                
                break;
            default:
                System.out.println("Ingrese una opción válida.");
        }
    }
    
}
