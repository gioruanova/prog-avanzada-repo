package clases;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int dimension;
    private boolean esSmart;

    public Televisor() {

    }

    public Televisor(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido, double precio,
            int dimension, boolean esSmart) {
        super(marca, modelo, numeroSerie, voltaje, encendido, precio);
        this.dimension = dimension;
        this.esSmart = esSmart; // Corregido para establecer el valor correcto de esSmart
    }

    public int getDimension() {
        return dimension;
    }

    public boolean isEsSmart() {
        return esSmart;
    }

    public Televisor capturaDatos(Scanner scanner) {
        String inputSmart = "";
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Introduzca la marca del televisor: ");
        super.setMarca(textScanner.nextLine());

        System.out.println("Introduzca el modelo del televisor: ");
        super.setModelo(textScanner.nextLine());

        System.out.println("Introduzca el numero de serie del televisor: ");
        super.setNumeroSerie(textScanner.nextLine());

        System.out.println("Introduzca el voltaje del televisor (220/110): ");
        super.setVoltaje(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Introduzca el precio del televisor: ");
        super.setPrecio(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Introduzca las dimensiones del televisor: ");
        this.dimension = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Es Smart? (si / no): ");
        inputSmart = scanner.nextLine();
        if (inputSmart.toLowerCase().equals("si")) {
            this.esSmart = true;
        }

        return new Televisor(this.getMarca(), this.getModelo(), this.getNumeroSerie(), this.getVoltaje(),
                this.isEncendido(), this.getPrecio(), this.dimension, this.esSmart);
    }

    @Override
    public String toString() {
        return "Televisor [" + super.toString() + " Dimension: " + dimension + ", Smart?: " + esSmart + "]\n";
    }
}
