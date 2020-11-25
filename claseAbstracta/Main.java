/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *
 * @author Aaron
 */
public class Main {
    public static void main(String[] args) {
      
        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0]= new Empleado("Aaron Velasco", 16000, 2017, 05, 18);
        lasPersonas[1]= new Alumno("Jonathan", "Telematia y comunicacion");
        
        for (Persona lasPersona : lasPersonas) {
            System.out.println("Nombre: "+lasPersona.getNombre()+" \nDescripcion"+lasPersona.dameDescripcion());
            System.out.println("------");
        }
    
        
    }
    
}
