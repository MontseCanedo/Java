package test;

import domain.*;

public class TestInstanceOf {
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Yolanda", 6300);
        determinarTipo(empleado);
        empleado = new Gerente("Carla", 20000, "Odontopediatria");
        determinarTipo(empleado);
    }
    
    public static void determinarTipo(Empleado empleado)
    {
        //se pregunta de menos a más específico
        if(empleado instanceof Gerente)
        {
            System.out.println("Es de tipo gerente");
            System.out.println("Departamento: " + ((Gerente) empleado).getDepartamento());
        }
        else if(empleado instanceof Empleado)
        {
            System.out.println("Es de tipo padre");
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if(empleado instanceof Object)
        {
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }
}
