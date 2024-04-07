import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 2, 2, 2, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // Funcion Lambda
        listaDeNumeros.stream()
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .sorted()
                .distinct()
                // .limit(5)
                // .forEach(n -> System.out.println(n));
                .forEach(System.out::println);

       

    }

}
