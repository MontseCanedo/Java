package zona_fit.presentacion;

import java.util.Scanner;
import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

public class ZonaFitApp {

    public static void main(String[] args) {
        zonaFitApp();
    }

    private static void zonaFitApp() {
        var salir = false;
        Scanner sc = new Scanner(System.in);
        IClienteDAO clienteDao = new ClienteDAO();
        while (!salir) {
            try {
                var opcion = mostrarMenu(sc);
                salir = ejecutarOpciones(sc, opcion, clienteDao);
            } catch (Exception e) {
                System.out.println("Error al ejecutar opciones" + e.getMessage());
            }
            System.out.println();
        }
    }

    private static int mostrarMenu(Scanner sc) {

        System.out.print("""
                           Seleccione una opcion:
                           1. Listar clientes
                           2. Buscar cliente
                           3. Agregar cliente
                           4. Modificar cliente
                           5. Eliminar cliente
                           6. Salir\s""");

        return Integer.parseInt(sc.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner sc, int opcion, IClienteDAO clienteDAO) {
        var salir = false;
        switch (opcion) {
            case 1 -> {
                System.out.println("--- Listado de clientes ---");
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("Ingrese el id del cliente a buscar:");
                var id = sc.nextInt();
                var cliente = new Cliente(id);
                var busqueda = clienteDAO.buscarClientePorId(cliente);
                if (busqueda) {
                    System.out.println("Cliente encontrado = " + cliente);
                } else {
                    System.out.println("No se encontro cliente: " + cliente.getId());
                }
            }
            case 3 -> {
                System.out.println("Ingrese los datos del cliente a agregar:");
                var nombre = sc.nextLine();
                var apellido = sc.nextLine();
                var membresia = sc.nextInt();
                var cliente = new Cliente(nombre, apellido, membresia);
                var clientes = clienteDAO.agregarCliente(cliente);
                System.out.println("cliente agregado: " + cliente);
                if (clientes) {
                    System.out.println("Cliente agregado: " + cliente);
                } else {
                    System.out.println("No se pudo agregar cliente: " + cliente);
                }
            }
            case 4 -> {
                System.out.println("Ingrese el id del cliente a modificar:");
                var id = sc.nextInt();
                System.out.print("Nombre ");
                var nombre = sc.next();
                System.out.println();
                System.out.print("Apellido ");
                var apellido = sc.next();
                System.out.println();
                System.out.print("Membresia ");
                var membresia = sc.nextInt();
                var cliente = new Cliente(id, nombre, apellido, membresia);
                var clientes = clienteDAO.modificarCliente(cliente);
                System.out.println("cliente modificado: " + cliente);
                if (clientes) {
                    System.out.println("Cliente modificado: " + cliente);
                } else {
                    System.out.println("No se pudo modificar cliente: " + cliente);
                }
            }
            case 5 -> {
                System.out.println("Ingrese Id del cliente a eliminar");
                var id = sc.nextInt();
                var cliente = new Cliente(id);
                var clientes = clienteDAO.eliminarCliente(cliente);
                if (clientes) {
                    System.out.println("Cliente eliminado: " + cliente);
                } else {
                    System.out.println("No se pudo eliminar cliente: " + cliente);
                }
            }
            case 6 -> {
                System.out.println("Saliendo...");
                salir = true;
            }
        }
        return salir;
    }
}
