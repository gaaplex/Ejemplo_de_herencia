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
public class Padre  extends Abuelo{
    
    private String NombreDePadre;
 
 
    
     public Padre(String NombreDePadre){
         
         super();// Se invoca el constructor de la superclase abuelo, el cual no
         //recibe argumentos, pues no tiene parametros
         
         this.NombreDePadre = NombreDePadre; 
         
     }
     
     public String DimeDatosPadre(){    
         
         return "El nombre del  padre es "+NombreDePadre;
     
     }
     
      
    
    
    
}
