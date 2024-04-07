// package programacionAvanzada;

import java.util.Arrays;
import java.util.List;

public class ClasesAnonimaConLambda {

    static interface MiInterface {

        void miMetodo(String unString);
    }

    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("Neuquen", "Analía", "Osos", "ojos", "oro", "radar", "somos", "conocer");

        MiInterface claseAnonima = new MiInterface() {
            @Override
            public void miMetodo(String palabra) {
                System.out.println(palabra.toUpperCase());
            }
        };

        /*
         * Ambos metodos hacen lo mismo, pero uno esta optimizado
         * por detrás java sabe que interfaz implementar
         * 
         * El otro es el clasico con lambda
         */
        palabras.stream().forEach(claseAnonima::miMetodo);
        palabras.stream().forEach(n -> claseAnonima.miMetodo(n));

    }

}
