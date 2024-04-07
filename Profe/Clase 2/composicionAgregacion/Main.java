package composicionAgregacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Direccion d1 = new Direccion("Calle Falsa", 123, "El paraiso", "C12345W");

        Persona p1 = new Persona("Fernando", "11111111", 33, d1);
        Casa c1 = new Casa(4, d1);

        List<String> palabras = new ArrayList<>();

        System.out.println(palabras.size());

        p1.mostrarOrganos();

    }

}
