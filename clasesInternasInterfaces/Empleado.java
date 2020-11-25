package clasesInternasInterfaces;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Aaron
 */
public class Empleado implements Comparable{//se eimplementa una interface

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleado(String nombre, double sueldo, int anios, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anios, mes - 1, dia);
        altaContrato = calendario.getTime();//muestra la fecha
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String dame_nombre() {//getter

        return " El nombre es " + nombre;
    }

    public double dame_sueldo() {//getter
        return  sueldo;
    }

    public Date dame_fecha_contrado() {//getter
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {// metodo

        double aumento = (sueldo * porcentaje) / 100;

        sueldo += aumento; //sueldo = sueldo +aumento

    }

    @Override
    public int compareTo(Object miObjeto) {//se sobre escribe el metodo compare tu se agre una interface
        
        Empleado otroEmpleado = (Empleado) miObjeto;
        
        if (this.sueldo<otroEmpleado.sueldo){
            //Si el sueldo de un empleado es menor que el otro regresa un menos -1, deacuerdo a la API
            return -1;
        }
        if (this.sueldo>otroEmpleado.sueldo){
            return 1;
        }
        return 0;
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
