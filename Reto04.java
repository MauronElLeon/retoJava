public class Reto04 {
    public static void main(String[] args) {
        //Concatenacion de Strings
        String nombre = "Mauricio";
        String apellido = "Garcia";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        String nombreCompleto2 = nombre.concat(" " + apellido);
        System.out.println(nombreCompleto2);

        //Compare
        String nombre1 = "Mauricio";//Nombre1 apunta a un espacio de memoria donde se encuentra el String "Mauricio"
        String nombre2 = "Mauricio";//Nombre2 apunta a un espacio de memoria donde se encuentra el String "Mauricio"
        String nombre3 = new String("Mauricio");//Nombre3 apunta a un espacio de memoria donde se encuentra el String "Mauricio"
        String nombre4 = "mauricio";//Nombre4 apunta a un espacio de memoria donde se encuentra el String "mauricio"
        if(nombre1.equals(nombre2)){
            System.out.println("Los nombres 1 y 2 son iguales");
        } else {
            System.out.println("Los nombres 1 y 2 son diferentes");
        }
        if (nombre1.equals(nombre3)) {
            System.out.println("Los nombres 1 y 3 son iguales");
        } else {
            System.out.println("Los nombres 1 y 3 son diferentes");
        }
        if (nombre1.equals(nombre4)) {
            System.out.println("Los nombres 1 y 4 son iguales");
        } else {
            System.out.println("Los nombres 1 y 4 son diferentes");
        }
        if (nombre1.equalsIgnoreCase(nombre4)) {
            System.out.println("Los nombres 1 y 4 son iguales (ignorando mayúsculas/minúsculas)");
        } else {
            System.out.println("Los nombres 1 y 4 son diferentes (ignorando mayúsculas/minúsculas)");
        }

        //Inspeccion y busqueda
        String frase = "Hola mundo, bienvenidos al reto de Java";
        System.out.println("La longitud de la frase es: " + frase.length());
        System.out.println("El caracter en la posición 5 es: " + frase.charAt(5));
        System.out.println("La frase en mayúsculas es: " + frase.toUpperCase());
        System.out.println("La frase en minúsculas es: " + frase.toLowerCase());
        System.out.println("La frase sin espacios al inicio y al final es: '" + frase.trim() + "'");
        System.out.println("La frase reemplazando 'Java' por 'Python' es: " + frase.replace("Java", "Python"));
        System.out.println("La frase contiene la palabra 'mundo': " + frase.contains("mundo"));

        //Manipulacion y Slice
        String subFrase = frase.substring(0, 4);
        System.out.println("La subfrase es: " + subFrase);

        //Transformacion y Split y Join
        String[] palabras = frase.split(" ");
        System.out.println("Las palabras en la frase son:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        String fraseUnida = String.join("\"", palabras);
        System.out.println("La frase unida es: " + fraseUnida);

        //StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            sb.append(palabras[i]);
            if (i < palabras.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println("El StringBuilder contiene: " + sb.toString());
    }
}
