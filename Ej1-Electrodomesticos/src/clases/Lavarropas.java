package clases;

import java.util.Scanner;

public class Lavarropas extends Electrodomestico {
    private int maxCarga;
    private boolean esAutomatico;

    public Lavarropas() {

    }

    public Lavarropas(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido, double precio,
            int maxCarga, boolean esAutomatico) {
        super(marca, modelo, numeroSerie, voltaje, encendido, precio);
        this.maxCarga = maxCarga;
        this.esAutomatico = esAutomatico;
    }

    public void esAutomatico() {
        this.esAutomatico = true;
    }

    public void noEsAutomatico() {
        this.esAutomatico = false;
    }

    public Lavarropas capturaDatos(Scanner scanner) {
        String inputAutomatico = "";
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Introduzca la marca del lavarropas: ");
        super.setMarca(textScanner.nextLine());

        System.out.println("Introduzca el modelo del lavarropas: ");
        super.setModelo(textScanner.nextLine());

        System.out.println("Introduzca el numero de serie del lavarropas: ");
        super.setNumeroSerie(textScanner.nextLine());

        System.out.println("Introduzca el voltaje del lavarropas (220/110): ");
        super.setVoltaje(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Introduzca el precio del lavarropas: ");
        super.setPrecio(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Introduzca la maxima carga del lavarropas: ");
        this.maxCarga = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Es automatico? (si / no): ");
        inputAutomatico = scanner.nextLine();
        if (inputAutomatico.toLowerCase().equals("si")) {
            esAutomatico();
        } else {
            noEsAutomatico();
        }

        return new Lavarropas(this.getMarca(), this.getModelo(), this.getNumeroSerie(), this.getVoltaje(),
                this.isEncendido(), this.getPrecio(), this.maxCarga, this.esAutomatico);
    }

    @Override
    public String toString() {
        return "Lavarropas [" + super.toString() + " Carga Maxima: " + maxCarga + ", Automatico?: " + esAutomatico
                + "]\n";
    }

}
