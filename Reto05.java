public class Reto05 {
    public static void main(String[] args) {
        //Asignacion por valor primitivos
        int a = 5;
        int b = a; // b recibe el valor de a, no una referencia al mismo valor
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        a = 10; // Cambiamos el valor de a
        System.out.println("Valor de a después de cambiarlo: " + a);
        System.out.println("Valor de b después del cambio en a: " + b); // b sigue siendo 5

        //Asignacion por referencia objetos
        int[] arrayA = {1, 2, 3};
        int[] arrayB = arrayA; // arrayB referencia el mismo arreglo que arrayA
        System.out.println("Valor de arrayA: " + java.util.Arrays.toString(arrayA));
        System.out.println("Valor de arrayB: " + java.util.Arrays.toString(arrayB));
        arrayA[0] = 10; // Cambiamos el primer elemento de arrayA
        System.out.println("Valor de arrayA después de cambiarlo: " + java.util.Arrays.toString(arrayA));
        System.out.println("Valor de arrayB después del cambio en arrayA: " + java.util.Arrays.toString(arrayB)); // arrayB también refleja el cambio

        int examen = 5;
        subirNota(examen);
        System.out.println("Nota final en el main: " + examen); 

        int[] misNotas = {5, 8, 10};
        modificarArray(misNotas);
        System.out.println("Primera nota tras el método: " + misNotas[0]);
    }

    public static void subirNota(int nota) {
        nota = nota + 2; // Solo modifica la copia local
        System.out.println("Nota dentro del método: " + nota);
    }

    public static void modificarArray(int[] notas) {
        notas[0] = 9; // Accede al objeto real en el Heap y cambia el 5 por un 9
    }
}
