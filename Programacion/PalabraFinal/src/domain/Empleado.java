package domain;

public class Empleado extends Persona{
    
    
    /*
    ya no se puede aplicar herencia de la clase Persona
    debido al uso de la palabra final en la clase
    */
    
    //debido a que en la clase padre, este metodo esta marcado como final
    //no se puede sobreescribir en la clase hija
    //@Override
    /*public void imprimir()
    {
        System.out.println("Metodo imprimir desde clase hija");
    }*/
}
