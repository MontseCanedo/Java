package com.gm.test;

import com.gm.ventas.*;

public class VentasTest {
    
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);
        Producto producto3 = new Producto("Chamarra", 110);
        Producto producto4 = new Producto("Zapatillas", 200);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto4);
        
        orden2.mostrarOrden();
        
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto3);
        
        orden3.mostrarOrden();
    }
}
