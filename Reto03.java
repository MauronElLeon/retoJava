import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Reto03 {
    public static void main(String[] args) {
        //Estructuras soportadas
        //Arreglos - Secuencias de elementos del mismo tipo.
        int[] aNumeros = {1,2,3,4,5,6,7,8,9,10};
        for (int i : aNumeros) {
            System.out.println(i);
        }
        String[] aStrings = {"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez"};
        for (String string : aStrings) {
            System.out.println(string);
        }
        //Listas - Las listas son secuencias ordenadas que permiten elementos duplicados
        //Listas - ArrrayList - La más común; rápida para acceder a elementos por índice
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Primera");
        listaFrutas.add("Segunda");
        System.out.println(listaFrutas);

        //Listas - LinkedList - Mejor para insertar o eliminar elementos frecuentemente.
        List<Integer> listaVinculada = new LinkedList<>();
        listaVinculada.add(100);
        listaVinculada.add(200);
        listaVinculada.add(300);
        listaVinculada.add(400);
        System.out.println(listaVinculada);
        listaVinculada.remove(2);
        System.out.println(listaVinculada);

        //Conjuntos - Estructuras que no permiten duplicados
        //Conjuntos - HashSet - No garantiza orden; es la más eficiente
        Set<String> paisesSet = new HashSet<>();
        paisesSet.add("Caracas");
        paisesSet.add("Benezuela");
        paisesSet.add("Acambaro");
        paisesSet.add("Caracas");
        System.out.println(paisesSet);
        //Conjuntos - TreeSet - Almacena los elementos en orden natural (alfabético o numérico)
        Set<Integer> iDsNumber = new TreeSet<>();
        iDsNumber.add(2234);
        iDsNumber.add(3234);
        iDsNumber.add(1234);
        System.out.println(iDsNumber);

        //Colas y pilas - Ideales para procesar datos en órdenes específicos
        //Queue (FIFO) - Primero en entrar, primero en salir.
        Queue<String> fila = new LinkedList<>();
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");
        fila.add("Cliente 4");
        System.out.println(fila);
        fila.remove();//Remueve el primero añadido
        System.out.println(fila);

        //Stack (LIFO) - Último en entrar, primero en salir (aunque hoy se prefiere Deque)
        Stack<String> libros = new Stack<>();
        libros.push("Libro A");
        libros.push("Libro C");
        libros.push("Libro D");
        libros.push("Libro E");
        System.out.println(libros);
        libros.pop();//Remueve el ultimo añadido
        System.out.println(libros);

        //ENUMS - Para definir un conjunto fijo de constantes
        enum DiaSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
        System.out.println(DiaSemana.LUNES);

        //Records - Estructuras de datos inmutables y concisas
        Usuario gordon = new Usuario("Gordon", 21);
        System.out.println(gordon);
    }

    public record Usuario(String nombre, int id){}
}
