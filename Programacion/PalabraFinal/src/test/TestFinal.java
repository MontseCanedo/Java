package test;

import domain.Persona;

public class TestFinal {
    
    public static void main(String[] args) {
        
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
        /*
        una vez asignado el valor a la variable 
        con final, ya no se puede modificar
        */
        
        System.out.println("constante " + Persona.CONSTANTE);
        
        final Persona persona1 = new Persona();
        persona1.setNombre("Montse");
        System.out.println("persona1 = " + persona1.getNombre());
        
    }
}
