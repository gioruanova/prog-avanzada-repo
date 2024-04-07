// package programacionAvanzada;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("Neuquen", "Neuquen", "Analía", "Osos", "ojos", "oro", "radar", "somos",
                "conocer",
                "reconocer",
                "rapar", "rapar", "rodadores", "objetos", "objetos", "Más palabras...");

        palabras.stream()
                .filter(palabra -> esCapicula(palabra))
                .map(palabra -> palabra.toUpperCase())
                .distinct()
                .forEach(System.out::println);
    }

    private static boolean esCapicula(String palabra) {
        String nuevaPalabra = palabra.toLowerCase();
        return nuevaPalabra.toLowerCase().equals(new StringBuilder(nuevaPalabra).reverse().toString());
    }

}
