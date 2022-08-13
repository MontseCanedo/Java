package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    
    public static void main(String[] args) {
        
        Computadora computadora1 = new Computadora("Montserrat", new Monitor("Asus", 27), new Teclado("cable", "KNUP"), new Raton("cable", "ryzer"));
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        
        System.out.println("");
        
        Computadora computadora2 = new Computadora("Valeria", new Monitor("Samsung", 27), new Teclado("cable", "Redragon"), new Raton("cable", "MaxwellRozen"));
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora2);
        orden2.mostrarOrden();
    }
}
