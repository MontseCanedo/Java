package test;

public class TestArreglos {
    
    public static void main(String[] args) {
        
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        //modificando los valores del arreglo
        edades[0] = 10;
        System.out.println("edades = " + edades[0]);
        edades[1] = 20;
        System.out.println("edades = " + edades[1]);
        edades[2] = 30;
        System.out.println("edades = " + edades[2]);
        
        for(int i = 0; i < edades.length; i++)
        {
            System.out.println("edades[" + i + "]= " + edades[i]);
        }
    }
}
