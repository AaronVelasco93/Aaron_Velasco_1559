/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesInternasInterfaces;

import java.util.Arrays;

/**
 *
 * @author Aaron
 */
public class Main {
     public static void main(String[] args) {
       
        Jefe aaron_RHH = new Jefe("Aaron", 15000, 2003, 12, 15);
          Empleado [] misEmpleados = new Empleado[6];//creacion de un arreglo
        
        
        //Creacion de Arreglos
        misEmpleados[0]=new Empleado("Aaron", 9000, 2018, 12, 15);
        misEmpleados[1]=new Empleado("Maria", 10000, 2002, 04, 19);
        misEmpleados[2]=new Empleado("Jonathan", 15000, 2000, 06, 24);
        misEmpleados[3]=new Empleado("Maria", 18000, 2015, 02, 04);
        misEmpleados[4]=aaron_RHH; //Polimorfismo
        misEmpleados[5]= new Jefe("Hugo", 45000, 2003, 12, 25);//NUevo objeto
        
        
        //jefe es un director compercial
        Empleado director_comercial = new Jefe("Jesus Direc", 55000, 2000, 12, 25);//sustitucion
        
        
        //Todas las clases que implementen esta interface deben de implementar los metodos
         System.out.println("\n ejemplo de interface"+aaron_RHH.tomarDecisiones("Todos tienen un bono"));
        
         System.out.println("------------------------");
        /**
         * //INSTANCEOF EJMPLO
        //Clase empleado implementa la interface comparable
        Comparable ejemplo = new Empleado("Juan ", 45000, 2018, 06, 15);
        
          if(director_comercial instanceof Empleado){//se puede usar con clases
              //director comercial es una instancia de empleado
              //jefatura hereda de empleado
              System.out.println("Es de tipo jefatura");
          }
          
          if(ejemplo instanceof Comparable){//se puede implementar con interfaces
              //por que ejemplo es una instancia de comparable
              System.out.println("implementa la interface comparable");
          }
         */
        
         //SUBIR SUELDO A LOS EMPLEADOS
         for (Empleado misEmpleado : misEmpleados) {
             //length tamaño de mi arreglo
             misEmpleado.subeSueldo(5);
         }
        
        
        //Ordena el Array de objetos usando una interface
        /**
         *Implementar la interface comparable donde se uso el array referente al objeto en este paso en la clase empleado
         *ya que de hay se hace los objetos empleados
         *todo respecto a los datos que queremos ordenar
         */
        Arrays.sort(misEmpleados);
        
        //Imprimir datos
        for (int i = 0; i < misEmpleados.length; i++) {
            
            System.out.println("Nombre: "+misEmpleados[i].dame_nombre()
                    +" Sueldo: "+misEmpleados[i].dame_sueldo()
                    +" Fecha de ingrerso: "
                    +misEmpleados[i].dame_fecha_contrado());
            
        }
        
        
        System.out.println(aaron_RHH.damesueldo());
        
        aaron_RHH.estableceIncentivo(3500);
        System.out.println(aaron_RHH.damesueldo());
        
    
        
    }
}
