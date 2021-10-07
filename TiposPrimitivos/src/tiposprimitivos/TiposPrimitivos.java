package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {


    public static void main(String[] args) {
        
        /*byte numeroByte = 127;
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = 32767;
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt = 2147483647;
        System.out.println("valor minimo short: " + Integer.MIN_VALUE);
        System.out.println("valor maximo short: " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("valor minimo short: " + Long.MIN_VALUE);
        System.out.println("valor maximo short: " + Long.MAX_VALUE);
        
        float numeroFloat = 3.4028235E38F;
        System.out.println("valor minimo short: " + Float.MIN_VALUE);
        System.out.println("valor maximo short: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("valor minimo short: " + Double.MIN_VALUE);
        System.out.println("valor maximo short: " + Double.MAX_VALUE);*/
        
        /*var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0f;
        System.out.println("numeroFloat = " + numeroFloat);*/
        
        /*char myCharacter = 'a';
        System.out.println("myCharacter = " + myCharacter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varChar1 = '\u0021';
        System.out.println("varChar = " + varChar1);
        var varCharDecimal1 = 33;
        System.out.println("varCharDecimal = " + varCharDecimal1);
        var varCharSimbolo1 = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo1);
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);*/
        
        /*boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        System.out.println("");
        if(varBoolean){
            System.out.println("Es verdadero");
        }else{
            System.out.println("Es falso");
        }
        
        var edad = 3;
        var esAdulto = edad >= 18;
        if(esAdulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }*/
        
        //Convertir String a Int
        /*var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //pedir un valor
        Scanner leer = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(leer.nextLine());
        System.out.println("edad = " + edad);*/
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "Hola".charAt(0);
        System.out.println("caracter = " + caracter);
    }
    
}
