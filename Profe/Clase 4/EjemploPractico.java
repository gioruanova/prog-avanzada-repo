// package programacionAvanzada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploPractico {

    public static class Persona {

        private String nombre;
        private String apellido;
        private Integer edad;
        private List<Persona> amigos;

        public Persona(String nombre, String apellido, Integer edad) {
            this.amigos = new ArrayList<>();
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public void addAmigo(Persona p) {
            this.amigos.add(p);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }

        public List<Persona> getAmigos() {
            return amigos;
        }

    }

    /*
     * Definimos las interfaces
     */
    @FunctionalInterface
    interface Presentable {
        void muestroPresentacion(String dni);
    }

    @FunctionalInterface
    interface Socializable {
        void agregarAmigo(Persona amigo, Persona p1);
    }

    public static void main(String[] args) {

        Persona p1 = new Persona("Robert ", "Oppenheimer", 62);
        Persona p2 = new Persona("Albert", "Einstein", 76);
        Persona p3 = new Persona("Marie", "Curie", 75);
        Persona p4 = new Persona("Charles", "Darwin", 75);
        Persona p5 = new Persona("Stephen", "Hawking", 75);

        List<Persona> amigosEnComun = Arrays.asList(new Persona("Manfred", "Eigen", 92),
                new Persona("Bochum", "Gotinga", 85),
                new Persona("Ludwig", "Wittgenstein", 78));

        p1.addAmigo(p3);
        p1.addAmigo(p2);
        p1.addAmigo(p4);
        p1.addAmigo(p5);
        p2.addAmigo(p1);
        p2.addAmigo(p3);
        p2.addAmigo(p2);
        p2.addAmigo(p4);
        p2.addAmigo(p5);

        // Con expresión Lambda

        Socializable agregarAmigoConLambda = (amigo, persona) -> {
            if (!MetodosAuxiliares.comienzaConVocal(amigo.getNombre())) {
                amigo.setNombre(amigo.getNombre().toUpperCase());
                persona.amigos.add(amigo);
            }

            // Recorro con Stream()
            persona.getAmigos().stream().forEach(e -> System.out.println(e.getNombre()));
        };

        // Con clase ANONIMA
        Socializable agregarAmigoConClaseAnonima = new Socializable() {
            @Override
            public void agregarAmigo(Persona amigo, Persona p1) {
                amigo.setNombre(amigo.getNombre().toUpperCase());
                p1.amigos.add(amigo);

                // Recorro con foreach clasico
                for (Persona p : p1.getAmigos()) {
                    System.out.println(p.getNombre());
                }
            }
        };

        /*
         * Ambos metodos hacen lo mismo, pero la implementacion es diferente
         * 
         */
        agregarAmigoConLambda.agregarAmigo(amigosEnComun.get(1), p1);
        System.out.println("**********************");
        agregarAmigoConClaseAnonima.agregarAmigo(amigosEnComun.get(2), p2);
    }

}
