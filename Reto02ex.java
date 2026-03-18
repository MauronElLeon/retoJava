public class Reto02ex {
    public static void main(String[] args) {
        System.out.println(Cuenta("Primera", "Segunda"));
    }

    public static int Cuenta(String stringA, String stringB){
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                //imprime las cadenas concatenadas y aumenta el contador
                System.out.println(stringA + " " + stringB + " Numero: " + i);
                count++;
            }else{
                if (i % 3 == 0) {
                    //impirme solo la primera y aumenta el contador
                    System.out.println(stringA + " Numero: " + i);
                    count++;
                }else{
                    if (i % 5 == 0) {
                        //imprime solo la segunda y aumenta el contador
                        System.out.println(stringB + " Numero: " + i);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
