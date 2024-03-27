package clases;

public abstract class Electrodomestico {
    private String marca;
    private String modelo;
    private String numeroSerie;
    private int voltaje;
    private boolean encendido;
    private double precio;

    // Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido,
            double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.voltaje = voltaje;
        this.encendido = encendido;
        this.precio = precio;
    }

    // Getters & Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodo To String
    @Override
    public String toString() {
        return " Marca: " + marca + ", Modelo: " + modelo + ", Nro. Serie: " + numeroSerie + ", Voltaje: "
                + voltaje + ", Encendido: " + encendido + ", Precio: $" + precio;
    }
}
