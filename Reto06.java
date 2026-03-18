public class Reto06 {
    public static void main(String[] args) {
        recursividad(100);
    }

    static void recursividad(int a){
        if (a >= 0) {
            System.out.println("Iteracion: " + a);
            recursividad( a - 1 );
        } else {
            System.out.println("Fin de la recursividad");
        }
    }
}
