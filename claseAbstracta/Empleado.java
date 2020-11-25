/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Aaron
 */
public class Empleado extends Persona{
    
    //Atributos
    private double sueldo;
    private Date altaContrato;

        
    public Empleado(String nombre,double sueldo, int anios, int mes, int dia) {
        
        super(nombre);//constructor de la clase padre
        
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anios, mes - 1, dia);
        altaContrato = calendario.getTime();//muestra la fecha
    }
    
//Implementar mi metodo abstracto

    /**
     *
     * @return
     */
    
    @Override
    public String dameDescripcion (){//se sobre escribe el metodo
        return "Este empleado tiene un sueldo: "+sueldo;
    }
    
    
    public String dame_sueldo() {//getter
        return " El sueldo es: $" + sueldo;
    }

    public Date dame_fecha_contrado() {//getter
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {// metodo

        double aumento = (sueldo * porcentaje) / 100;

        sueldo += aumento; //sueldo = sueldo +aumento

    }

}
