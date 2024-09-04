package zona_fit.dominio;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int membresia;

    public Cliente() {
    }
    
    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(String nombre, String apellido, int membresia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.membresia = membresia;
    }

    public Cliente(int id, String nombre, String apellido, int membresia) {
        this(nombre, apellido, membresia);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMembresia() {
        return membresia;
    }

    public void setMembresia(int membresia) {
        this.membresia = membresia;
    }
    
    
}
