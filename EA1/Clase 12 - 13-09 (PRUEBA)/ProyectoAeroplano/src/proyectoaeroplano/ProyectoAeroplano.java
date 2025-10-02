/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoaeroplano;

/**
 *
 * @author PC05
 */
public class ProyectoAeroplano {

    
    public static void main(String[] args) {
        
        // Atributos
        Viaje vj = null;
        Pasajero pj = null;
        String tipo, destino, nombre = null;
        int op, valorViaje, id, depositoInicial, edad, cantDias = 0, totalPersonas = 0, pago;
        
        do {
            System.out.println("==== Viajes 'Mientras sigamos vivos' ====\n"+
                           "1. Crear viaje\n"+
                           "2. Informacion\n"+
                           "3. Pagar\n"+
                           "4. Salir\n"+
                           "Ingrese una opcion: ");
            
            op = Leer.datoInt();
            
            switch (op) {
                // Crear vije
                case 1:
                    System.out.println("Creando viaje...");
                    System.out.println("Ingrese nombre del pasajero; ");
                    nombre = Leer.dato();
                    do {
                        System.out.println("Ingrese RUT (id): ");
                        id = Leer.datoInt();
                    } while (id>=8);
                    do {
                        System.out.println("Ingrese edad: ");
                        edad = Leer.datoInt();
                    } while (edad>16);
                    do {
                        System.out.println("Ingrese destino: ");
                        destino = Leer.dato();
                        valorViaje = vj.getValorViaje();
                    } while (destino != "Isla de Pascua" && 
                    destino != "Isla Juan Fernandez" && 
                    destino != "Valle de Azapa");
                    do {
                        System.out.println("Ingrese tipo de viaje: ");
                        tipo = Leer.dato();
                    } while (tipo != "normal" &&
                            tipo != "extra");
                    do {
                        System.out.println("Ingrese cuanto pagará como deposito inicial: ");
                        depositoInicial = Leer.datoInt();
                    } while (depositoInicial>0);
                    System.out.println("Ingrese cantidad de dias que viajará: ");
                    cantDias = Leer.datoInt();
                    System.out.println("Ingrese total de personas que viajará: ");
                    totalPersonas = Leer.datoInt();
                    
                    // NO DEJA INSTANCIAR, LO HICE A MANO Y AUN ASI FALLA :(
                    // ayer me dio el mismo error desde mi pc, utilicé la forma que nos enseñó en clases
                    // alt + shift + n
                    
                    vj=new Viaje(pj, tipo, destino, valorViaje);
                    break;
                // Mostrar informacion
                case 2:
                    if (vj!=null) {
                    System.out.println("Mostrando informacion...");
                    System.out.println("Nombre pasajero: "+nombre);
                    System.out.println("RUT (id): "+vj.getPj().getId());
                    System.out.println("Edad: "+vj.getPj().getEdad());
                    System.out.println("Nombre destino: "+vj.getDestino());
                    System.out.println("Valor a pagar: "+vj.getValorViaje());
                    System.out.println("Deposito inicial: "+vj.getPj().getDepositoInicial());
                    System.out.println("Dias de viaje: "+cantDias);
                    System.out.println("Total personas: "+totalPersonas);
                    }
                    else
                    {
                        System.out.println("Debe crear un viaje.");
                    }
                    break;
                // Pagar
                case 3:
                    if(vj!=null)
                    {
                        System.out.println("Debe pagar: $"+vj.pagar(cantDias, totalPersonas));
                    }
                    else
                    {
                        System.out.println("Debe crear un viaje.");
                    }
                    break;
                // Salir
                case 4:
                    System.out.println("Gracias por elegir Viajes 'Mientras sigamos vivos'");
                    break;
            }
        } while (op!=4);
        
    }
    
}
