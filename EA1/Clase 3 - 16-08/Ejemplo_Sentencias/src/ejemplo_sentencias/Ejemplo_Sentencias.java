package ejemplo_sentencias;


public class Ejemplo_Sentencias {

   
    public static void main(String[] args) {
        // Ver que numero es mayor
        
        int num1, num2, i=1;
        char op;
        
        System.out.print("Ingrese un numero: ");num1=Leer.datoInt();
        System.out.print("Ingrese otro numero: ");num2=Leer.datoInt();
        
        if (num1>num2)
        {
            System.out.println("El primer numero ("+num1+") es mayor.");
        }
        else if (num1<num2)
        {
            System.out.println("El segundo numero ("+num2+") es mayor.");
        }
        else
                {
                System.out.println("Ambos numeros son iguales");
                }
        
        // probamos el switch
        System.out.print("Ingrese opción: "
                + "A."
                + "B."
                + "C.");
        op=Leer.datoChar();
        
        switch (op) {
            case 'A':
                System.out.println("Opcion A");
                break;
            case 'B':
                System.out.println("Opcion B");
                break;
            case 'C':
                System.out.println("Opcion C");
                break;
            default:
                System.out.println("Ingrese una opción válida.");
        }
        
        // PROBAMOS EL DO-WHILE
        
        System.out.println("===== VALOR DE i =====");
        do {
            System.out.println("Valor de i: "+i);
            i++;
        } while (i<=10);
    }
    
}
