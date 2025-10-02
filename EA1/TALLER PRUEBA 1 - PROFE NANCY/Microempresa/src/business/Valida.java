/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.Date;

/**
 *
 * @author Nancy
 */
public class Valida {

    public Valida() {
    }
    /**
     * validar que un valor sea mayor a CERO
     * @param valor
     * @return 
     */
    public boolean validarMayorCero(int valor){
        return valor>0;
    }
    
    /**
     * validar que un valor numérico tenga largo 4
     * @param valor
     * @return 
     */
    public boolean validarLargo4(int valor){
        return (valor >= 1000 && valor <= 9999);
    }
    /**
     * validar que un valor numérico tenga largo 8
     * @param valor
     * @return 
     */
    public boolean validarLargo8(int valor){
        return ((valor + "").length()==8);
    }
    /**
     * validar que subcategoría se fruta o verdura
     * @param valor
     * @return 
     */
    public boolean validarSubcategoria(String valor){
        return (valor.equalsIgnoreCase("FRUTA") || valor.equalsIgnoreCase("VERDURA"));
    }
    /**
     * validar que el correo tenga al menos 6 caracteres
     * @param valor
     * @return 
     */
    public boolean validarEmail(String valor){
        return (valor.length()>=6);
    }
    
    /**
     * validar que la fecha no sea superior al día e hoy
     * @param valor
     * @return 
     */
    public boolean validaFecha(Date valor){
        Date hoy = new Date();
        return (valor.compareTo(hoy)<=0);
    }
}
