// package programacionAvanzada;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ClasesAnonimasVSLambdas {

    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("Neuquen", "Analía", "Osos", "ojos", "oro", "radar", "somos", "conocer",
                "reconocer",
                "rapar", "rodadores");

        /*
         * Vean la diferencia de codigo
         * aplicando clases anonimas VS Lambda expression
         */
        palabras.stream().filter(p -> esCapicula(p)).map(p -> p.toUpperCase()).forEach(p -> System.out.println(p));

        System.out.println("***************************************************");

        palabras.stream()
                .filter(new Predicate<String>() {
                    public boolean test(String palabra) {
                        return esCapicula(palabra);
                    };
                })
                .map(new Function<String, String>() {
                    public String apply(String palabra) {
                        return palabra.toUpperCase();
                    };
                })
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String palabraMayuscula) {
                        System.out.println(palabraMayuscula);
                    }
                });

    }

    private static boolean esCapicula(String palabra) {
        return palabra.equals(new StringBuilder(palabra).reverse().toString());
    }

}
