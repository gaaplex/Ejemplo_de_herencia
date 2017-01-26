/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiaherencia;

/**
 *
 * @author gaapl
 */

public class Hijo extends Padre{
    
    private String nombreHijo;
    
    
    public Hijo(String nombreHijo){
        
        
        super("peter");
        
        this.nombreHijo = nombreHijo;
        
    }
    
    public String getNombreHijo(){
        
        return nombreHijo;
        
    }
    
}