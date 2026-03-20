public class Reto06exRecursividad {
    static int incremento = 0;
    public static void main(String[] args) {
        System.out.println("Calculando el factorial de 5...");
        System.out.println("El factorial de 5 es: " + factorial(5));
        System.out.println("Calculando el valor del elemento 10 de la serie de Fibonacci...");
        System.out.println("El valor del elemento 10 de la serie de Fibonacci es: " + fibonacci(10));
    }
 
    //funcion recursiva para calcular el factorial de un numero
    static int factorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //funcion recursiva para calcular el valor de un elemnto de la serie de Fibonacci
    static int fibonacci(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
 }