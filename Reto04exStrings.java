import java.util.Scanner;

public class Reto04exStrings {

    private static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        //Leer entrada por consola
        System.out.println("Escriba la palabra que se analizara:");
        String palabraString = entrada.nextLine();
        //Analizar si la palabra es un palindromo
        String palabraReversa = new StringBuilder(palabraString).reverse().toString();
        if (palabraString.equalsIgnoreCase(palabraReversa)) {
            System.out.println("La palabra es un palindromo");
        } else {
            //Analizar si es un isograma
            String palabraSinEspacios = palabraString.replaceAll("\\s+", "").toLowerCase();
            java.util.Set<Character> caracteresUnicos = new java.util.HashSet<>();
            boolean esIsograma = true;
            for (char c : palabraSinEspacios.toCharArray()) {
                if (caracteresUnicos.contains(c)) {
                    esIsograma = false;
                    break;
                }                caracteresUnicos.add(c);
            }
            if (esIsograma) {
                System.out.println("La palabra es un isograma");
            } else {
                //Analizar si es un anagrama
                char[] palabraArray = palabraString.toLowerCase().toCharArray();
                System.out.println("Escriba la palabra con la que se comparara:");
                String palabraComparacion = entrada.nextLine();
                char[] palabraComparacionArray = palabraComparacion.toLowerCase().toCharArray();
                java.util.Arrays.sort(palabraArray);
                java.util.Arrays.sort(palabraComparacionArray);
                if (java.util.Arrays.equals(palabraArray, palabraComparacionArray)) {
                    System.out.println("La palabra es un anagrama");
                } else {
                    System.out.println("La palabra no es ni palindromo ni anagrama");
                }
            }
        }
    }
}
