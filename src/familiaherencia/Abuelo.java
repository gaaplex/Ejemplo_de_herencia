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
public class Abuelo {
    
     private String apellido;
    private String nombre;
    private double fortuna;
    private int numeroDeCasas;
    private boolean deudas;
    
    
     public Abuelo( ) {
       
        apellido ="Carreño";
        nombre = "Manuel";
        
        fortuna = 30000000;// 30 millones
        numeroDeCasas = 4;
        deudas = false;
        
        
     }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFortuna() {
        return fortuna;
    }

    public void setFortuna(double fortuna) {
        this.fortuna = fortuna;
    }

    public int getNumeroDeCasas() {
        return numeroDeCasas;
    }

    public void setNumeroDeCasas(int numeroDeCasas) {
        this.numeroDeCasas = numeroDeCasas;
    }

    public boolean getDeudas() {
        return deudas;
    }

    public void setDeudas(boolean deudas) {
        this.deudas = deudas;
    }
    
    
    
     
     
    
    
}
