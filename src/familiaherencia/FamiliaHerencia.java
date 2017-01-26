/*
programa que muestra el funcionamiento de la herencia en java

*/
package familiaherencia;

/**
 *
 * @author gaapl
 */
public class FamiliaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Abuelo objAbuelo  = new Abuelo();
        
        objAbuelo.setFortuna(400);
        
        Padre ObjPadre = new Padre("Mariano");
        Hijo objHijo = new Hijo("Cristian");

        ObjPadre.setFortuna(150);// Herencia en accion. Se emplea  un metodo 
        // y variable de la clase padre, ahorrando código
        
        ObjPadre.setDeudas(true);
        
        ObjPadre.setNumeroDeCasas(1);
        
        
        //Datos abuelo
        
        System.out.println("El nombre de mi abuelo es "+objAbuelo.getNombre()+
                " Y su apellido es "+objAbuelo.getApellido());
        
        System.out.println("La fortuna de mi abuelo es "+objAbuelo.getFortuna());
        
        System.out.println("El numero de casas de mi abuelo es "+objAbuelo.getNumeroDeCasas());
        
        System.out.println(" Tiene deudas? "+ objAbuelo.getDeudas());
        
        
        // Datos abuelo
        
        
        //**** Datos padre
              System.out.println("El nombre del padre es "+ObjPadre.getNombre()+
                      " Y su apellido es "+objAbuelo.getApellido());

                
        
        System.out.println("La fortuna que heredo de mi abuelo es "+objAbuelo.getFortuna());
        
        System.out.println("El numero de casas que heredo de mi padre "+ObjPadre.getNumeroDeCasas());
        
        System.out.println(" tenia deudas mi abuelo? "+ objAbuelo.getDeudas());
        
                //**** Datos padre
                
         //*** Datos del hijo
        
         
         
           System.out.println("El nombre del hijo es "+objHijo.getNombreHijo()+
                " Y su apellido es "+ObjPadre.getApellido());
        
        System.out.println("La fortuna que hereda  mi padre es "+ObjPadre.getFortuna());
        
        System.out.println("El numero de casas que hereda mi padre es "+ObjPadre.getNumeroDeCasas());
        
        System.out.println(" Tiene deudas mi abuelo? "+ ObjPadre.getDeudas());

        
         System.out.println("El nombre del padre es"+ObjPadre.DimeDatosPadre());
         System.out.println("El nombre del padre es"+objHijo.DimeDatosPadre());// El obj hijo
         //tiene una copia personal del nombre del padre, en este caso, petter
        
         //*** Datos del hijo

         

    }
    
}
