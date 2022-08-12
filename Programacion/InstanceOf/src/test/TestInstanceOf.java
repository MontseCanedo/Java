package test;

import domain.Gerente;

public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente("Yolanda", 6300, "Produccion");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        
    }
}
