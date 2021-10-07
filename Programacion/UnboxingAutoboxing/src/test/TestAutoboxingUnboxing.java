package test;

public class TestAutoboxingUnboxing {
    
    public static void main(String[] args) {
        
        //Clases envolventes de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        //Se recomienda para el uso en objetos y no para uso con muchos cálculos
        
        //Autoboxing
        
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        System.out.println("entero = " + entero.doubleValue());
        
        //Unboxing
        
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}
