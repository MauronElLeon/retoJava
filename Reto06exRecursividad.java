public class Reto06exRecursividad {
    static int incremento = 0;
    public static void main(String[] args) {
        System.out.println("Calculando el factorial de 5...");
        System.out.println("El factorial de 5 es: " + factorial(5));
    }
 
    //funcion recursiva para calcular el factorial de un numero
    static int factorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
 }