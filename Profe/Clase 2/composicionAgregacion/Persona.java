package composicionAgregacion;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;
    private List<Organo> organos; // Composición
    private Casa casa; // Agregación
    private Direccion direccion; // "Herencia" usando composición.

    public Persona(String nombre, String dni, int edad, Direccion direccion) {
        this.organos = new ArrayList<Organo>();
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.edad = edad;
        this.agregarOrganos();
    }

    private void agregarOrganos() {
        this.organos.add(new Corazon());
        this.organos.add(new Pulmon());
    }

    public void mostrarOrganos() {
        for (Organo organo : organos) {
            System.out.println(organo.getClass().getSimpleName());
        }
    }

}
