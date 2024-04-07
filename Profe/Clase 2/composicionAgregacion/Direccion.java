package composicionAgregacion;

public class Direccion {

    private int altura;
    private String calle;
    private String barrio;
    private String codigoPostal;

    public Direccion(String calle, int altura, String barrio, String codigoPostal) {
        this.altura = altura;
        this.barrio = barrio;
        this.codigoPostal = codigoPostal;
    }

}
