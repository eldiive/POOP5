/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Elián
 */
public class Coche {
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    
    public Coche(){
        
    }

    public Coche(Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    
   
    public Persona getChofer(){
        return chofer;   
    }
    
    public void setChofer(Persona chofer){
        this.chofer = chofer;
    }
    
    public Persona getCopiloto(){
        return copiloto;
    }
    
    public void setCopiloto(Persona copiloto){
        this.copiloto = copiloto;   
    }
    
    public Persona getPasajero1(){
        return pasajero1;
    }
    
    public Persona getPasajero2(){
        return pasajero2;
    }

    @Override
    public String toString() {
        return "Coche{" + "chofer=" + chofer + 
                ", \n      copiloto=" + copiloto + 
                ", \n      pasajero1=" + pasajero1 + 
                ", \n      pasajero2=" + pasajero2 + '}';
    }
    
    
}
