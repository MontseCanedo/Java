package test;

import domain.Persona;

public class TestJavaBeans {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona(); //debe crearse con el constructor vacio
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println("Nombre = " + persona.getNombre());
        System.out.println("Apellido = " + persona.getApellido());
    }
}
