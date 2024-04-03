package clases;

import java.util.Scanner;

public class Heladera extends Electrodomestico {
    private int capacidadLitros;
    private boolean esFrost;

    public Heladera() {

    }

    public Heladera(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido, double precio,
            int capacidadLitros, boolean esFrost) {
        super(marca, modelo, numeroSerie, voltaje, encendido, precio);
        this.capacidadLitros = capacidadLitros;
        this.esFrost = false;
    }
    

    public Heladera capturaDatos(Scanner scanner) {
        String esFrostInput = "";
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Introduzca la marca de la heladera: ");
        super.setMarca(textScanner.nextLine());

        System.out.println("Introduzca el modelo de la heladera: ");
        super.setModelo(textScanner.nextLine());

        System.out.println("Introduzca el numero de serie de la heladera: ");
        super.setNumeroSerie(textScanner.nextLine());

        System.out.println("Introduzca el voltaje de la heladera (220/110): ");
        super.setVoltaje(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Introduzca el precio de la heladera: ");
        super.setPrecio(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Introduzca la maxima carga de la heladera: ");
        this.capacidadLitros = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Es no frost? (si / no): ");
        esFrostInput = scanner.nextLine();
        if (esFrostInput.toLowerCase().equals("si")) {
            this.esFrost = true;
        }

        return new Heladera(this.getMarca(), this.getModelo(), this.getNumeroSerie(), this.getVoltaje(),
                this.isEncendido(), this.getPrecio(), this.capacidadLitros, this.esFrost);
    }

    @Override
    public String toString() {
        return "Heladera [" + super.toString() + " Capacidad Litros: " + capacidadLitros + ", No Forst?: " + esFrost
                + "]\n";
    }

}
