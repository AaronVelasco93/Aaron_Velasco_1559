/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceAbstracPresentacion;

/**
 *
 * @author Aaron
 */
public class Coche extends Vehiculo{
    
    public void retroceder(){
        System.out.println("El coche retrocediendo");
    }

    @Override//sobre escrito
    public void arrancar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Run Run Runnnn");
    }

    @Override//sobre escrito
    public void detener() {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        System.out.println("psssss stop");
    }

    
}
