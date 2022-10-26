package accesodatos;

public interface IAccesoDatos {
    
    int MAX_REGISTROS = 10; //Cualquier atributo en una interface es una constante
    
    void insertar(); //los metodos son abstractos
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
