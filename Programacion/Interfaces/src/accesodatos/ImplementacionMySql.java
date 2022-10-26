package accesodatos;

public class ImplementacionMySql implements IAccesoDatos{

    /*
        con implements se obliga al compilador a agregar el comportamiento que
        esta definido en la interface
    */
    
    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL");
    }
    
    
    
    
}
