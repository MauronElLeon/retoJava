import java.util.function.Function;

public class Reto02 {
    public static void main(String[] args) {
        int sumaA = 1;
        int sumaB = 2;//Variable local
        System.out.println("Sin Parametros:"); 
        sinParametro();
        System.out.println("Con un Parametros:"); 
        System.out.println(conUnParametroRetorno(sumaA, sumaB));
        System.out.println("Con varios Parametros:"); 
        listStrings ls = conVariosRetornos("Hola", 12387, true);
        System.out.print(ls.getSaludo() + "\n");
        System.out.print(ls.getID() + "\n");
        System.out.print(ls.getState() + "\n");
        //Funcion lambda
        Function<String,Integer> sizeOf =  s -> s.length();
        System.out.println(sizeOf.apply("hola java 8")); //11
    }

    public static void sinParametro(){
        int a = 1, b = 2;
        System.out.println(a+b);
    }

    public static String conUnParametroRetorno(int a, int b){
        return String.valueOf(a + b);
    }

    public static listStrings conVariosRetornos(String saludo, int ID, boolean status){
        return new listStrings(saludo, ID, status);
    }
}

class listStrings {
        private String saludo; //Variable Global
        private int ID;
        private boolean state;

        public listStrings(){}

        public listStrings(String saludo, int ID, boolean state){
            this.saludo = saludo;
            this.ID = ID;
            this.state = state;
        }

        public String getSaludo(){return saludo;}
        public int getID(){return ID;}
        public boolean getState(){return state;}
}