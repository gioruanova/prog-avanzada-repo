// package programacionAvanzada;

public class ClaseAnonima {

    static interface MiInterface {

        void hacemosAlgoConEsto(String unString);
    }

    public static void main(String[] args) {

        /*
         * Clase abstracta
         */
        MiInterface miInterface = new MiInterface() {

            @Override
            public void hacemosAlgoConEsto(String unString) {
                System.out.println("Mayusculas: " + unString.toUpperCase());
            }
        };

        miInterface.hacemosAlgoConEsto("Hola Mundo");

    }

}
