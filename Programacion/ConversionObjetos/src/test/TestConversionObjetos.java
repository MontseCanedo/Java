package test;

import domain.*;

public class TestConversionObjetos {
    
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        //DOWNCASTING
        System.out.println(((Escritor) empleado).getTipoEscritura());
        
        //DOWNCASTING
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //UPCASTING
        Empleado empleado2 = escritor;
        System.out.println("empleado2 = " + empleado2.obtenerDetalles()); 
    }
}
