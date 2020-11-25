package clasesInternasInterfaces;

/**
 *
 * @author Aaron
 */


//hay que implementar la interface jefes
//con una clase obstracto o se ereda o se hace un clase aobtracta devido a que java no tiene herencia multiple
public class Jefe extends Empleado implements Jefes{
    
    
    private double incentivo;
    
    //llama al constructor padre
    public Jefe(String nombre, double sueldo, int anios, int mes, int dia) {
        super(nombre, sueldo, anios, mes, dia);
        
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    
    public void estableceIncentivo (double incentivo){
        this.incentivo = incentivo;
    }
    
    /**
     *
     * @return
     */
    public  double damesueldo(){
        double sueldoJefe = super.dame_sueldo();
//alamcenar dentro de la variable el sueldo del empleado
        
        return sueldoJefe + incentivo;
    }

    
    //METODO de la Interface tomar deciciones y lo vamos a sobre escribir    
    @Override//lo estamos sobre escribiendo
    public String tomarDecisiones(String decision) {
      
        return "Un mienbro de la direccion a tomado la decicion de: "+decision;
        
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    
    
    
}
