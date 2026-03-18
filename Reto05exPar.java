public class Reto05exPar {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int[] arrA = {1, 2}, arrB = {3, 4};
        System.out.println("Valores por valor: A: " + a + " B: " + b);
        System.out.println("Valores por referencia: A: " + arrA[0] + ", " + arrA[1] + " B: " + arrB[0] + ", " + arrB[1]);
        int[] arrC = cambiarValor(a, b);
        int[] arrCa = cambiarValor(arrA, arrB);
        System.out.println("Valores por valor: A: " + a + " B: " + b);
        System.out.println("Valores cambiados: A: " + arrC[0] + " B: " + arrC[1]);
        System.out.println("Valores por referencia: A: " + arrA[0] + ", " + arrA[1] + " B: " + arrB[0] + ", " + arrB[1]);
        System.out.println("Valores cambiados: arrC: " + arrCa[0] + ", " + arrCa[1] + " B: " + arrCa[2] + ", " + arrCa[3]);
    }

    public static int[] cambiarValor(int a, int b){
        a = a+b;
        b = a-b;
        int[] arr = {a, b}; 
        return arr;
    }

    public static int[] cambiarValor(int[] arrA, int[] arrB){
        arrA[0] = 5;
        arrA[1] = 6;
        arrB[0] = 7;
        arrB[1] = 8;
        int[] arrN = {arrA[0], arrA[1], arrB[0], arrB[1]};
        return arrN;
    }
}
