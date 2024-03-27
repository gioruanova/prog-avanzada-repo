package clases;

import java.util.Scanner;

public class Licuadora extends Electrodomestico {
    private int potencia;
    private int cantVelocidades;

    public Licuadora() {

    }

    public Licuadora(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido, double precio,
            int potencia, int cantVelocidades) {
        super(marca, modelo, numeroSerie, voltaje, encendido, precio);
        this.potencia = potencia;
        this.cantVelocidades = cantVelocidades;
    }

    public Licuadora capturaDatos(Scanner scanner) {
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Introduzca la marca de la licuadora: ");
        super.setMarca(textScanner.nextLine());

        System.out.println("Introduzca el modelo de la licuadora: ");
        super.setModelo(textScanner.nextLine());

        System.out.println("Introduzca el numero de serie de la licuadora: ");
        super.setNumeroSerie(textScanner.nextLine());

        System.out.println("Introduzca el voltaje de la licuadora (220/110): ");
        super.setVoltaje(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Introduzca el precio de la licuadora: ");
        super.setPrecio(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Introduzca la potencia de la licuadora: ");
        this.potencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca las velocidades de la licuadora: ");
        this.cantVelocidades = scanner.nextInt();
        scanner.nextLine();

        return new Licuadora(this.getMarca(), this.getModelo(), this.getNumeroSerie(), this.getVoltaje(),
                this.isEncendido(), this.getPrecio(), this.potencia, this.cantVelocidades);

    }

    @Override
    public String toString() {
        return "Licuadora [" + super.toString() + " Potencia: " + potencia + ", Velocidades: " + cantVelocidades
                + "]\n";
    }
}
