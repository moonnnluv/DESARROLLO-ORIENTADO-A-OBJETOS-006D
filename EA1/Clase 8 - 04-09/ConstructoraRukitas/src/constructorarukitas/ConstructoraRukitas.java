
package constructorarukitas;


public class ConstructoraRukitas {

    
    public static void main(String[] args) {
        
       DatosBase dat=null;
       Casa ca=null;
       int valorMetro, op=0,metros, personas;
       String tipoConst,tipoCasa;
       boolean ultimaV;
        
        

        
        do {
                System.out.println("Casa\n" +
                "1. Crear casa\n" +
                "2. Mostrar toda la información y el costo de la propiedad\n" +
                "3. Modificar el tipo casa (validar que no sea el mismo que tenía)\n" +
                "4. Mostrar valor metro cuadrado si la casa es valida y es última venta, sino mostrar “No se puede”\n" +
                "5. Aplicar oferton\n" +
                "6. Salir\n" +
                "Seleccione una opcion: ");
        
        op=Leer.datoInt();
            switch (op) 
            {
                case 1:
                    System.out.println("Creando casa...");
                    // Metro cuadrado
                    do {
                        System.out.println("Ingrese valor metro cuadrado: ");
                        valorMetro = Leer.datoInt();
                    } while (valorMetro <=1000);
                    // Material con el que se construye
                    do {
                        System.out.println("Ingrese material de construccion: ");
                        tipoConst = Leer.dato();
                    } while (tipoConst.compareToIgnoreCase("concreto")!=0 &&
                            tipoConst.compareToIgnoreCase("madera")!=0 &&
                            tipoConst.compareToIgnoreCase("vulcanita")!=0);
                    
                    // Instanciamos la Clase DatosBase
                    dat = new DatosBase(valorMetro, tipoConst);
                    ultimaV = false;
                    
                    // Seleccionamos si la casa es pareada o individual
                    do {
                        System.out.println("¿Casa pareada o Casa individual?");
                        tipoCasa = Leer.dato();
                    } while (tipoCasa.compareToIgnoreCase("pareada")!=0 &&
                            tipoCasa.compareToIgnoreCase("individual")!=0 );
                    // Se crea Casa
                    ca=new Casa(dat, tipoCasa, ultimaV);
                    
                    break;
                case 2:
                    System.out.println("Mostrando información...");
                    System.out.println("Valor Metro: "+ca.getDato().getValorMetro());
                    System.out.println("Tipo Construcción: "+ca.getDato().getTipoConstruccion());
                    System.out.println("Tipo Casa: "+ca.getTipoCasa());
                    System.out.println("¿Cuantas personas viven en la casa?");
                    personas = Leer.datoInt();
                    System.out.println("¿Cuantas metros posee la casa?");
                    metros = Leer.datoInt();
                    System.out.println("Costo de la propiedad: $"+ca.CostoPropiedad(personas, metros));

                    break;
                case 3:
                    
                    break;
                case 4:
                     if(ca.CasaValida() && ca.isVenta())
                         System.out.println("El valor del metro cuadrado es :$"+ca.getDato().getValorMetro());
                     else
                         System.out.println("No se puede mostrar");
                    break;
                case 5:
                    System.out.print("Cuantas personas viven en la casa? ");
                    personas = Leer.datoInt();
                    System.out.println("OFERTON: "+ca.oferton(personas));
                    break;
                case 6:
                    System.out.println("Gracias por comprar en Constructora Rukitas");
                    break;
            }
                 
        } while (op!=6);
        
    }
    
}
