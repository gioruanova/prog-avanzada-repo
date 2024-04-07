// package programacionAvanzada.ejerciciosPractica;

// import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio {

        public static void main(String[] args) {

                // Importo desde utils una lista de cursos para no ensuciar mucho el main
                List<Curso> cursos = Utils.listaCursos();

                // 1) Obtener la cantidad de cursos con una duración mayor a 5 horas.
                System.out.println("------------------------------");
                long cantidadCursosMayorACinco = cursos.stream()
                                .filter(curso -> curso.getDuracion() > 5f)
                                .count();
                System.out.printf("1. Obtener la cantidad de cursos con una duración mayor a 5 horas: %d cursos",
                                cantidadCursosMayorACinco);

                System.out.println("\n==================================================\n");

                // ===================================================================================================================
                // 2) Obtener la cantidad de cursos con una duración menor a 2 horas.
                long cantidadCursosMenorADos = cursos.stream()
                                .filter(curso -> curso.getDuracion() <= 2)
                                .count();
                System.out.printf(
                                "2. Obtener la cantidad de cursos con una duración menor a 2 horas: "
                                                + (cantidadCursosMenorADos < 2 ? cantidadCursosMenorADos + " curso."
                                                                : cantidadCursosMenorADos + " cursos."));

                System.out.println("\n==================================================\n");

                // ===================================================================================================================
                // 3) Listar el título de todos aquellos cursos con una cantidad de vídeos mayor
                // a 50.
                System.out.println("3. Titulos de cursos con más de 50 videos:");
                cursos.stream()
                                .filter(curso -> curso.getVideos() > 50)
                                .forEach(curso -> System.out.println(curso.getTitulo()));

                System.out.println("\n==================================================\n");

                // ===================================================================================================================
                // 4) Mostrar en consola el título de los 3 cursos con mayor duración.
                System.out.println("4. Mostrar en consola el título de los 3 cursos con mayor duración.:");
                List<Curso> cursosConMayorDuracion = cursos.stream()
                                .sorted(Comparator.comparing(Curso::getDuracion).reversed())
                                .limit(3)
                                .collect(Collectors.toList());
                cursosConMayorDuracion
                                .forEach(curso -> System.out
                                                .println(curso.getTitulo() + " - Duracion: " + curso.getDuracion()));

                System.out.println("\n==================================================\n");

                // ===================================================================================================================
                // * 5) Mostrar en consola la duración total de todos los cursos.
                System.out.println("------------------------------");
                System.out.println("5. Mostrar en consola la duración total de todos los cursos:");
                float duracionTotalTodosLosCursos = (float) cursos.stream()
                                .mapToDouble(Curso::getDuracion)
                                .sum();
                System.out.println("Duración total de todos los cursos: " +
                                duracionTotalTodosLosCursos + " horas");

                System.out.println("\n==================================================\n");

                // ===================================================================================================================
                // * 6) Mostrar en consola todos aquellos libros que superen el promedio en
                // cuanto a duración se refiere.
                System.out.println(
                                "6. Mostrar en consola todos aquellos libros que superen el promedio en  cuanto a duración se refiere:");
                float duracionTotal = (float) cursos.stream()
                                .mapToDouble(Curso::getDuracion)
                                .sum();
                float promedio = duracionTotal / cursos.stream().count();
                System.err.println("Los cursos que superan el promedio total (" + promedio + ") son: ");
                cursos.stream()
                                .filter(curso -> curso.getDuracion() > promedio)
                                .forEach(curso -> System.out
                                                .println(curso.getTitulo() + "duracion > " + curso.getDuracion()));
                // System.out.println("El promedio es: " + promedio);

                System.out.println("\n==================================================\n");

                // ===================================================================================================================
                // 8) Mostrar en consola la duración de todos aquellos cursos que tengan una
                // cantidad de alumnos inscritos menor a 500.
                System.out.println(
                                "8. Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500");
                cursos.stream()
                                .filter(curso -> curso.getAlumnos() < 500)
                                .forEach(curso -> System.out
                                                .println(curso.getTitulo() + "duracion > " + curso.getDuracion()));

                System.out.println("\n==================================================\n");

                // ===================================================================================================================
                // 9) Obtener el curso con mayor duración.
                System.out.println(
                                "9. Obtener el curso con mayor duración");
                Curso cursoMayorDuracion = cursos.stream().max(Comparator.comparing(Curso::getDuracion)).get();

                System.out.println("El curso con mayor duracion es "
                                + cursoMayorDuracion.getTitulo() + " - Duracion > " + cursoMayorDuracion.getDuracion());

                System.out.println("\n==================================================\n");

                // ===================================================================================================================
                // 10. Crear una lista de Strings con todos los titulos de los cursos.
                System.out.println(
                                "10. Crear una lista de Strings con todos los titulos de los cursos.");
                String listadoCursosString = cursos.stream()
                                .map(Curso::getTitulo)
                                .collect(Collectors.joining("\n"));
                System.out.println(listadoCursosString);
                System.out.println("\n");
        }

}
