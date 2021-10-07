package test;

public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        System.out.println("");
        imprimirNumeros(1, 2);
        variosParametros("Montse", 8, 9, 10);
    }
    
    private static void variosParametros(String nombre, int... numeros)
    {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros) //recibe varios argumentos sin necesidad de definirlos
    {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
}
