import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto03exAgenda {

    private static final Scanner entrada = new Scanner(System.in);
    private static final Map<String, String> agenda = new HashMap<>();

    public static void main(String[] args) {
        int i = 1;
        while (i != 5 ) {
            System.out.println("""
                    Bienvenido a la Agenda
                    Selecciona la opcion deseada:
                    1 - Ver contactos
                    2 - Agregar contacto
                    3 - Eliminar contacto
                    4 - Actualizar contacto
                    5 - Salir
                    """);
            if(entrada.hasNextInt()){
                int en = entrada.nextInt();
                switch (en) {
                    case 1:
                        for (String nombre : agenda.keySet()) {
                            String telefono = agenda.get(nombre);
                            System.out.println("Nombre: " + nombre + " - Telefono: " + telefono);
                        }
                        i = en;
                        break;
                    case 2:
                        System.out.println("Nombre: ");
                        String nombre = entrada.next();
                        System.out.println("Telefono: ");
                        String telefono = entrada.next();
                        agenda.put(nombre, telefono);
                        System.out.println("Contacto agregado");
                        System.out.println("Nombre: " + nombre + " - Telefono: " + telefono);
                        break;
                    case 3:
                        System.out.println("Nombre del contacto a eliminar: ");
                        String nombreEliminar = entrada.next();
                        if (agenda.containsKey(nombreEliminar)) {
                            agenda.remove(nombreEliminar);
                            System.out.println("Contacto eliminado");
                        } else {
                            System.out.println("Contacto no encontrado");
                        }
                        break;
                    case 4:
                        System.out.println("Nombre del contacto a actualizar: ");
                        String nombreActualizar = entrada.next();
                        if (agenda.containsKey(nombreActualizar)) {
                            System.out.println("Nuevo telefono: ");
                            String nuevoTelefono = entrada.next();
                            agenda.put(nombreActualizar, nuevoTelefono);
                            System.out.println("Contacto actualizado");
                        } else {
                            System.out.println("Contacto no encontrado");
                        }
                        break;
                    default:
                        System.out.println("Entrada erronea Adios!");
                        break;
                }
            }else{
                System.out.println("Entrada erronea Adios!");
                break;
            }
        }
    }
}