/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplofutbol;

/**
 *
 * @author PC03
 */
public class EjemploFutbol {

   
    
    public static void main(String[] args) {
        
        // ATRIBUTOS
        Partido par, p;
        TorneoManejador to;
        String equipoL, equipoV, codigoP, codigo, nombreT;
        int golesL, golesV, op = 0, pos;
        
        // INSTANCIAR MANEJADORA
        System.out.print("Ingrese nombre del torneo: ");nombreT = Leer.dato();
        to = new TorneoManejador(nombreT);
        
        // MENU
        
        do {
            System.out.println("===== Torneo "+ nombreT + " =====");
            System.out.println("1. Crear partido");
            System.out.println("2. Mostrar partido especifico");
            System.out.println("3. Eliminar un partido");
            System.out.println("4. Mostrar ganador de un partido");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");op = Leer.datoInt();
            
            switch (op) {
                case 1:
                    System.out.print("Creando partido...\n");
                    System.out.print("Ingrese codigo del partido: ");codigoP = Leer.dato();
                    System.out.print("Ingrese nombre equipo local: ");equipoL = Leer.dato();
                    System.out.print("Ingrese nombre equipo visitante: ");equipoV = Leer.dato();
                    System.out.print("Ingrese goles del equipo local: ");golesL = Leer.datoInt();
                    System.out.print("Ingrese goles del equipo visitante: ");golesV = Leer.datoInt();
                    // ctrl + espacio, enter enter
                    par = new Partido(equipoL, equipoV, codigoP, golesL, golesV);
                    System.out.println(to.agregarPartido(par));
                    break;
                case 2:
                    System.out.print("Ingrese codigo de partido a mostrar: ");codigo=Leer.dato();
                    pos = to.buscar(codigo);
                    if (pos == -1)
                    {
                        System.out.println("Partido no existe");
                    }
                    else
                    {
                      // FORMA 1 - METODO CARRETERO XD
                        
                      // System.out.println("Nombre equipo local: "+to.getPa().get(pos).getLocal());
                      //  System.out.println("Nombre equipo visitante: "+to.getPa().get(pos).getVisita());
                      //  System.out.println("Goles equipo local: "+to.getPa().get(pos).getGolesL());
                      //  System.out.println("Goles equipo visitante: "+to.getPa().get(pos).getGolesV());

                            
                      // FORMA 2 - METODO FASILITO !!!!!!!!!!!!
                      //  p = to.getPa().get(pos);
                      //  System.out.println("Nombre equipo local: "+p.getLocal());
                      //  System.out.println("Nombre equipo visitante: "+p.getVisita());
                      //  System.out.println("Goles equipo local: "+p.getGolesL());
                      //  System.out.println("Goles equipo visitante: "+p.getGolesV());
                        
                      // FORMA 3 - METODO EN MANEJADORA
                        System.out.println(to.mostrarInformacion(codigo));
                        
                      // FORMA 4 - METODO EN CLASE PARTIDO
                      
                      // toString
                        System.out.println(to.getPa().get(pos).toString());
                        
                      // metodo
                        System.out.println(to.getPa().get(pos).mostrarInformacion());    
                    }
                    break;
                case 3:
                    System.out.print("Ingrese codigo de partido a eliminar: ");codigo=Leer.dato();
                    System.out.println(to.eliminarPartido(codigo));
                    break;
                case 4:
                    System.out.print("Ingrese codigo de partido a mostrar: ");codigo=Leer.dato();
                    pos = to.buscar(codigo);
                    if (pos == -1)
                    {
                        System.out.println("Partido no existe");
                    }
                    else
                    {
                        System.out.println(to.getPa().get(pos).resultado());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                
            }
            
        } while (op!=5);
        
    }
    
}
