/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Elián
 */

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){
        
    }
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public int getDia(){
        return dia; 
    }
    
    public void setDia(int dia){
        if(dia>0 && dia<32){
            this.dia = dia;
        }else{
            System.out.println("Dia incorrecto");
            //this.dia = 0;
        }
            
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        if(mes>0 && mes<13){
            this.mes = mes;
        }else{
            System.out.println("Mes incorrecto");
            this.mes =0;
        }
               
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
    
}

