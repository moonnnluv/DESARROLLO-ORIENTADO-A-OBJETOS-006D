package ejercicio_3;


public class Ejercicio_3 {

    
    public static void main(String[] args)
    {
        Alumno al = null;
        int op = 0;
        float nota1, nota2, cont1, cont2, cont3, examen;
        String nombre;
        
        // Equivalente al while true (menu en bucle)
        do {
            System.out.println("Alumnos\n" +
                                            "1. Crear alumno\n" +
                                            "2. Mostrar toda la información del alumno (nombre y notas de pruebas y controles)\n" +
                                            "3. Modificar la nota de la prueba 2, mostrando la nueva nota\n" +
                                            "4. Promedio de controles\n" +
                                            "5. Nota final y si aprobó o no la asignatura\n" +
                                            "6. Salir");
            System.out.println("Ingrese una opción: ");
            op=Leer.datoInt();
            
            
            switch (op) {
                case 1:
                    System.out.print("Creando alumno...");
                    System.out.println("Nombre: ");
                    nombre = Leer.dato();
                    System.out.println("Nota 1: "); nota1 = Leer.datoFloat();
                    System.out.println("Nota 2: "); nota2 = Leer.datoFloat();
                    System.out.println("Control 1: "); cont1 = Leer.datoFloat();
                    System.out.println("Control 2: "); cont2 = Leer.datoFloat();
                    System.out.println("Control 3: "); cont3 = Leer.datoFloat();
                    
                    // instanciar (crear) Alumno (ctrl + espacio)
                    
                    al = new Alumno(nombre, nota1, nota2, cont1, cont2, cont3);

                    break;
                case 2:
                    
                    if (al == null) 
                    {
                        System.out.println("Ingrese datos en opción 1 para crear a alumno");
                    }
                    else
                    {
                    System.out.print("Información Alumno");
                    System.out.print(" Nombre: "+al.getNombre());
                    System.out.print(" Nota 1: "+al.getNota1());
                    System.out.print(" Nota 2: "+al.getNota2());
                    System.out.print(" Control 1: "+al.getCont1());
                    System.out.print(" Control 2: "+al.getCont2());
                    System.out.print(" Control 3: "+al.getCont3());
                    }
                    
                    break;   
                case 3:
                    
                    if (al == null) 
                    {
                        System.out.println("Ingrese datos en opción 1 para crear a alumno");
                    }
                    else
                    {
                        System.out.println("Ingrese nueva nota 2: ");
                        nota2 = Leer.datoFloat();
                        
                        al.setNota2(nota2);
                        System.out.println("Nueva nota 2: "+al.getNota2());

                    }
                    
                    break;
                case 4:
                
                     if (al == null) 
                    {
                        System.out.println("Ingrese datos en opción 1 para crear a alumno");
                    }
                    else
                    {
                        
                        System.out.println("Promedio de controles: "+al.promCont());
                        
                    }             
                    break;
                case 5:
                    
                    if (al == null) 
                    {
                        System.out.println("Ingrese datos en opción 1 para crear a alumno");
                    }
                    else
                    {
                        System.out.println("Ingrese nota examen: ");
                        examen = Leer.datoFloat();
                        
                        System.out.println("Su nota final es: "+al.notaFinal(examen));
                        System.out.println(al.aprobacion(examen));
                    }                    
                    break;
                case 6:
                    System.out.print("");
                    break;                   
                default:
                    System.out.print("Ingrese opción válida.");
            }
        } while (op!=6);
    }
    
}
