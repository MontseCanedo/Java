package test;

import domain.Persona;

public class TestMatrices {
    
    public static void main(String[] args) {
        
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 2;
        edades[0][1] = 4;
        edades[1][0] = 6;
        edades[1][1] = 8;
        edades[2][0] = 10;
        edades[2][1] = 12;
        
        /*for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                //System.out.println("edades[" + i + "][" + j + "]= "+ edades[i][j]);
                System.out.print(edades[i][j] + ", ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};
        System.out.println("frutas = " + frutas);
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.print(frutas[i][j] + ", ");
            }
            System.out.println("");
        }*/
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Yolanda");
        personas[0][1] = new Persona("Carla");
        personas[0][2] = new Persona("Alejandra");
        personas[1][0] = new Persona("Montserrat");
        personas[1][1] = new Persona("Luciana");
        personas[1][2] = new Persona("Crookshanks");
        
        Imprimir(personas);
    }
    
    public static void Imprimir(Object matriz[][])
    {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}
