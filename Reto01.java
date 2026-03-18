public class Reto01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Aritméticos
        System.out.println("Suma: " + (a + b));        // 13
        System.out.println("División entera: " + (a / b)); // 3 (no 3.33)
        System.out.println("Resto (Módulo): " + (a % b));  // 1

        // Unarios
        int contador = 5;
        contador++; // Ahora vale 6
        System.out.println("Negación: " + !true);     // false

        int edad = 25;
        boolean tieneLicencia = true;

        // Relacionales
        boolean esMayor = edad >= 18; // true

        // Lógicos
        // AND (&&): Ambos deben ser true
        if (esMayor && tieneLicencia) {
            System.out.println("Puedes conducir");
        }

        // OR (||): Al menos uno debe ser true
        boolean esFinDeSemana = false;
        boolean estaDeVacaciones = true;
        if (esFinDeSemana || estaDeVacaciones) {
            System.out.println("Puedes descansar");
        }

        int puntaje = 100;

        //Asignacion Compuesta
        puntaje += 50; // Equivale a: puntaje = puntaje + 50 (Resultado: 150)
        puntaje *= 2;  // Equivale a: puntaje = puntaje * 2  (Resultado: 300)
        puntaje -= 10; // Equivale a: puntaje = puntaje - 10 (Resultado: 290)

        System.out.println("Puntaje final: " + puntaje);

        //Operador Ternario
        double temperatura = 28.5;
        String clima = (temperatura > 25) ? "Hace calor" : "Está fresco";

        System.out.println(clima); // Imprime: Hace calor

        //Bits
        int x = 5;  // En binario: 0101
        int y = 3;  // En binario: 0011

        // AND bit a bit (&)
        System.out.println(x & y); // Resultado: 1 (Binario: 0001)

        // Desplazamiento a la izquierda (<<)
        // Mueve los bits a la izquierda, efectivamente multiplicando por 2
        System.out.println(x << 1); // Resultado: 10 (Binario: 1010)

        //Primitivos vs Objetos
        String nombre1 = "Java";
        String nombre2 = new String("Java");

        System.out.println(nombre1 == nombre2);      // false (son objetos diferentes en memoria)
        System.out.println(nombre1.equals(nombre2)); // true (su contenido es igual)


        //If
        edad = 16;
        if (edad >= 18) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        //Switch
        int dia = 3;
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            default -> System.out.println("Otro día");
        }

        //Bucle for
        for (int i = 0; i < 5; i++) {
            System.out.println("Vuelta número: " + i);
        }

        //Bucle while
        int bateria = 100;
        while (bateria > 0) {
            System.out.println("El teléfono sigue encendido... While");
            bateria -= 10; // Condición de salida
        }

        //Do While
        bateria = 100;
        do {
            System.out.println("El teléfono sigue encendido... Do While");
            bateria += 10; // Condición de salida
        } while (bateria < 100);

        //break: Rompe el bucle por completo y sale de él.
        //continue: Salta la iteración actual y pasa a la siguiente.
        //return: Sale del método actual (y puede devolver un valor).

        //For each para arreglos o colecciones
        String[] nombres = {"Ana", "Beto", "Carla"};

        // "Por cada 'nombre' de tipo String en el arreglo 'nombres'..."
        for (String nombre : nombres) {
            System.out.println("Hola, " + nombre);
        }
    }
}
