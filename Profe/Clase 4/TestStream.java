// package programacionAvanzada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {

        // Puedo crear listas unmutables
        List<String> listaInmutable = Collections
                .unmodifiableList(Arrays.asList("Z", "B", "A"));
        /*
         * Lanza una excepción
         */
        // listaInmutable.add("Value");

        // Método de ordenamiento
        listaInmutable.stream().sorted().forEach(System.out::println);

        /*
         * Generamos secuencia de numeros. OJO, es infinita, debemos colocar un limite
         */
        Stream<Integer> numerosStream = Stream.iterate(1, n -> n + 1);

        numerosStream
                .peek(System.out::println)
                .filter(x -> x % 2 == 1)
                .limit(5) // Recordar que el limit, dependiendo donde este puede alterar el producto final
                .forEach(System.out::println);

        // Ejemplo de Stream secuencias y en paralelo
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Ejecución secuencial");
        Integer sumStream = numbers
                .stream()
                .peek(System.out::println)
                .reduce(0, Integer::sum);
        System.out.println("Total en stream secuencial: " + sumStream);

        System.out.println("Ejecución en paralelo");
        Integer sumParallel = numbers
                .parallelStream()
                .peek(System.out::println)
                .reduce(0, Integer::sum);
        System.out.println("Total en parallel: " + sumParallel);

        /*
         * Asigno a "nuevaListaDeNumerosParseada" un stream
         */
        Stream<Integer> nuevaListaDeNumerosParseada = numbers.stream();
        /*
         * Metodo optimizado para obtener el valor maximo
         */
        System.out.println("Valor maximo de la lista: " + nuevaListaDeNumerosParseada.max(Integer::compareTo).get());

        /*
         * comparteTo es de Integer, porque Integer implementa
         * Comparable<Integer> y tiene solo este metodo "public int compareTo(T o);
         */
        // System.out.println(streamDeNumeros.max((a, b) -> a.compareTo(b)).get());

        /*
         * Puedo tambien demostrar creando un "Comparator"
         * y sobreescribiendo el metodo "compare", llamando al compareTo de
         * Integer
         */
        Comparator<Integer> comparar = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        };

        /*
         * Aplico lambda function implementando la "FuncionalInterface"
         * creada arriba
         */
        // System.out.println("Valor maximo usando Lambda + interface: "
        // + nuevaListaDeNumerosParseada.max((a, b) -> comparar.compare(a,
        // b)).get());

        /*
         * Esto hace lo mismo que el metodo de arriba, java por detras
         * sabe que existe una "FuncionalInterface" declarada más arriba
         * entonces con solo pasar "comparar" por parametro es suficiente
         */
        // System.out.println("Valor maximo optimizado, solo paso el metodo por
        // parametro: "+nuevaListaDeNumerosParseada.max(comparar).get());

    }

}
