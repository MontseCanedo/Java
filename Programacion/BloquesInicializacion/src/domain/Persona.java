package domain;

public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    //bloque de inicializacion estatico
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    //bloque de inicializacion no estatico, se ejecuta antes del constructor de nuestra clase
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    //constructor de la clase
    public Persona()
    {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
    
}
