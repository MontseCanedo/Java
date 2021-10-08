package test;

import domain.*;

public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Yolanda", 6300);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        Gerente gerente = new Gerente("Carla", 20000, "Odontopediatria");
        //System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);
    }
    
    public static void imprimir(Empleado empleado)
    {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
