package zona_fit.datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

public class ClienteDAO implements IClienteDAO{

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Conexion.getConexion();
        var sql = "SELECT * FROM cliente ORDER BY id";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);
            }
        }catch(Exception e){
            System.out.println("Error al listar clientes: " + e.getMessage());
        }finally{
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Conexion.getConexion();
        var sql = "SELECT * FROM cliente WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();
            if(rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
                
        }catch(Exception e){
            System.out.println("Error al encontrar cliente: " + e.getMessage());
        }finally{
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        var sql = "INSERT INTO cliente (nombre, apellido, membresia) VALUES (?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.execute();
            return true;
        }catch(Exception e){
            System.out.println("Error al agregar cliente: " + e.getMessage());
        }finally{
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        var sql = "UPDATE cliente SET nombre=?, apellido=?, membresia=? WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            ps.execute();
            return true;
        }catch(Exception e){
            System.out.println("Error al modificar cliente" + e.getMessage());
        }
        finally{
            try{
                con.close();;
            }catch(Exception e){
                System.out.println("Error al cerrar la conexion" + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        var sql = "DELETE FROM cliente WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.execute();
            return true;
        }catch(Exception e)
        {
            System.out.println("Error al eliminar cliente " + e.getMessage());
        }
        finally{
            try{
                con.close();;
            }catch(Exception e){
                System.out.println("Error al cerrar conexion " + e.getMessage());
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        IClienteDAO clienteDao = new ClienteDAO();

//        //Listar clientes
//        System.out.println("*** LISTAR CLIENTES ***");
//        
//        var clientes = clienteDao.listarClientes();
//        clientes.forEach(System.out::println);
//        
//        //Buscar por ID
//        var clientes2 = new Cliente(2);
//        System.out.println("Cliente antes de la busqueda: " + clientes2);
//        var encontrado = clienteDao.buscarClientePorId(clientes2);
//        if(encontrado){
//            System.out.println("Cliente encontrado = " + clientes2);
//        }
//        else{
//            System.out.println("No se encontro cliente: " + clientes2.getId());
//        }
//        
//        //Agregar cliente
//        var cliente3 = new Cliente("Alejandra", "Canedo", 400);
//        var agregado = clienteDao.agregarCliente(cliente3);
//        clientes = clienteDao.listarClientes();
//        clientes.forEach(System.out::println);
        
        //Modificar cliente
//        var cliente4 = new Cliente(1, "Gabriel", "Dantes", 100);
//        var modificado = clienteDao.modificarCliente(cliente4);
//        if(modificado){
//            System.out.println("Cliente modificado" + cliente4);
//        }
//        else{
//            System.out.println("No se modifico cliente; " + cliente4);
//        }
        
        //Eliminar cliente
        var cliente5 = new Cliente(1);
        var eliminado = clienteDao.eliminarCliente(cliente5);
        if(eliminado){
            System.out.println("Cliente eliminado" + cliente5);
        }
        else{
            System.out.println("No se elimino cliente; " + cliente5);
        }
    }
    
}
