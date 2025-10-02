
package sistemaflota;

/**
 *
 * La constante TARIFA_BASE_ALQUILER: $30,000.
   Un método para calcular el costo total del alquiler en función de los días de uso.
 */
public interface IAlquiler {
    
   int TARIFA_BASE_ALQUILER = 30000; 
   
   int costoTotal(int dias);
}
