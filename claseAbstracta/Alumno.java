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
 class Alumno extends Persona{
     private String carrera;
     
     public Alumno(String nombre, String carrera){//credencial
        super(nombre);
        this.carrera=carrera;
     }
     
     @Override
    public String dameDescripcion(){//esta sobre escrito y cada metodo devu
    
        return "Este alumno esta estudiando:"+carrera; 
    }
     
}
