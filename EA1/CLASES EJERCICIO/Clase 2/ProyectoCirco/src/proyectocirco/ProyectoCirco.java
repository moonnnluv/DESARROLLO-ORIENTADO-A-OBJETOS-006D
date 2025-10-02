
package proyectocirco;


public class ProyectoCirco {

  
  
    public static void main(String[] args) {
        
        Trabajador tr = null;
        DatosPersonales dp = null;
        int op, sueldo, edad, añosServicio;
        String nombre, rut, puesto;
        boolean aviso;
        
        do {
            System.out.println("Circo Trululu\n" +
                            "1. Crear trabajador\n" +
                            "2. Mostrar toda la información del trabajador\n" +
                            "3. Modificar el sueldo del trabajador\n" +
                            "4. Pagar\n" +
                            "5. Finiquitar\n" +
                            "6. Salir\n"+
                            "Ingrese una opcion: ");
            
            op = Leer.datoInt();
            
            switch (op) {
                // Crear trabajador
                case 1:
                    System.out.println("Creando trabajador...");
                    System.out.println("Ingrese nombre: ");
                    nombre = Leer.dato();
                    // do {
                    //    System.out.print("Ingrese nombre Trabajador, no puede estar vacío: "); 
                    //    nombre=Leer.dato();
                    //} while (nombre.trim().length()<3); trim -> vacios
                    System.out.println("Ingrese rut: ");
                    rut = Leer.dato();
                    System.out.println("Ingrese edad: ");
                    edad = Leer.datoInt();
                    System.out.println("Ingrese sueldo: ");
                    sueldo = Leer.datoInt();
                    
                    dp=new  DatosPersonales(nombre, rut, sueldo, edad);
                    
                    do {
                        System.out.print("Ingrese años de servicio en el circo: ");
                        añosServicio=Leer.datoInt();
                    } while (añosServicio<1);
                    System.out.print("Ingrese puesto de trabajo administrativo, gerente, trabajador: ");
                    puesto=Leer.dato();
                    
                    // alt + shift + N
                    tr=new   Trabajador(dp, añosServicio, puesto);
                    
                    break;
                // Mostrar Trabajador
                case 2:
                     if(tr!=null)
                    {
                        System.out.println(tr.toString());  // Override
                    }
                    else
                        System.out.println("Debe crear antes al Trabajador");
                    break;
                // Modificar el sueldo del trabajador
                case 3:
                    if(tr!=null)
                    {
                        System.out.println("Ingrese nuevo sueldo: ");
                        sueldo = Leer.datoInt();
                        tr.getDatosPersonalesCon().setSueldo(sueldo); // SET MODIFICA
                        System.out.println("Sueldo modificado");
                    }
                    else
                    {
                        System.out.println("Debe crear antes al Trabajador");
                    }
                    break;
                // Pagar
                case 4:
                    if(tr!=null)
                    {
                        System.out.println("Su sueldo es: $"+tr.pagar());
                    }
                    else
                    {
                        System.out.println("Debe crear antes al Trabajador");
                    }
                    break;  
                // Finiquitar
                case 5:
                    if(tr!=null)
                    {
                        System.out.print("Recibió aviso de despido true/false? "); 
                        aviso=Leer.datoBoolean();
                        System.out.println("Su finiquito es de: $"+tr.finiquitar(aviso));
                    }
                    else
                    {
                        System.out.println("Debe crear antes al Trabajador");
                    }
                    break;
                case 6:
                    System.out.println("SALIENDO DE LA APP...");
                    break;
            }
            
        } while (op!=6);
    }
    
    
    
}
