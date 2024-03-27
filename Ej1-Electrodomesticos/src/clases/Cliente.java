package clases;

public class Cliente {
    private String apenom;
    private int cuil;


    public Cliente(String apenom, int cuil) {
        this.apenom = apenom;
        this.cuil = cuil;
    }

    public String getApenom() {
        return apenom;
    }

    public void setApenom(String apenom) {
        this.apenom = apenom;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "Nombre completo: " + apenom + " - Cuil: " + cuil + "]";
    }
}
