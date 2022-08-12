package test;

import domain.Persona;

public class TestArreglosObject {
    
    public static void main(String[] args) {
        
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Valeria");
        personas[1] = new Persona("Montserrat");
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("persona " + i + ":\n" + personas[i]);
        }
        
        System.out.println("");
        
        //sintaxis resumida
        String frutas[] = {"Mandarina", "Naranja", "Plátano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta " + i + ":\n" + frutas[i]);
        }
    }
}
