
import java.util.Scanner;


public class HolaMundo {
    
    public static void main(String args[]){
        
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miCadena = "Saludos";
        System.out.println(miCadena);
        
        miCadena = "adios";
        System.out.println(miCadena);
        
        var miInt2 = 20;
        System.out.println(miInt2);
        
        var miCadena2 = "Cadena Var";
        System.out.println(miCadena2);
        
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        
        var usuario = "Montse";
        var titulo = "Ingeniero";
        var union = usuario + ", " + titulo;
        System.out.println(union);
        
        var i = 3;
        var j = 4;
        System.out.println(i + j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));
        
        String nombre = "Carla";
        System.out.println("Nueva lina: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        var titulo2 = leer.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = leer.nextLine();
        System.out.println(titulo2 + " fue escrito por " + autor);
    }
}
