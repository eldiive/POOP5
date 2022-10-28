/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Elián
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per1 = new Persona();
        System.out.println(per1);
        per1.setNombre("Sofia");
        System.out.println(per1.getNombre());
        per1.setApellido("Hernandez");
        System.out.println(per1.getApellido());
        System.out.println(per1);
        per1.setFNacimiento(new Fecha(23, 8, 20));
        Persona per2 = new Persona("Elian", "Sanchez", new Fecha(20, 3, 21));
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per1.getFNacimiento());
        System.out.println(per2.getFNacimiento());
        Fecha fecha = new Fecha();
        fecha.setDia(0);
        fecha.setMes(13);
        fecha.setAnio(17);
        Persona per3 = new Persona("Juan","Esacalante",fecha);
        System.out.println(per3);
        
        System.out.println("----------------------------------Actividad Extra------------------------------------------------------");
        
        Persona per4 = new Persona("Andrea", "Lopez", new Fecha(23, 3, 99));
        Persona per5 = new Persona("Rodrigo", "Alvarez", new Fecha(2, 9, 98));
        Persona per6 = new Persona("Esmeralda", "Juarez", new Fecha(6, 2, 92));
        Persona per7 = new Persona("Noe", "Sanchez", new Fecha(18, 10, 99));
        
        Coche coche1 = new Coche(per4, per5, per6, per7);
        
        System.out.println(coche1);
        
    }
    
}
