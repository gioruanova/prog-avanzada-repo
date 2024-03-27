package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ticket implements Imprimible {

    private int nroTicket;
    private Cliente cliente;
    private List<Electrodomestico> productos;

    public Ticket() {
        Scanner scanner = new Scanner(System.in);
        this.cliente = capturaDatos(scanner);
        this.nroTicket = generarNumeroAleatorio();
        this.productos = new ArrayList<Electrodomestico>();
    }

    public int getNroTicket() {
        return nroTicket;
    }

    // generar nro aleatorio para el ticket
    public int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(99999999) + 1;
    }

    // agregar producto al ticket
    public void agregarProductos(Electrodomestico elec) {
        this.productos.add(elec);
    }

    // mostrar el ticket
    public void mostrarTicket() {
        for (Electrodomestico electrodomestico : productos) {
            System.out.println(electrodomestico.toString());
        }
    }

    // captura de datos cliente
    public Cliente capturaDatos(Scanner scanner) {
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Ingrese nombre y apellido del cliente");
        String nomApelIngreso = textScanner.nextLine();

        System.out.println("Ingrese cuil del cliente");
        int cuilIngreso = scanner.nextInt();

        return new Cliente(nomApelIngreso, cuilIngreso);
    }

    // total del ticket
    public double totalTicket() {
        double total = 0;
        for (Electrodomestico electrodomestico : productos) {
            total += electrodomestico.getPrecio();
        }
        return total;
    }

    // imprimir el ticket (desde interfaz)
    public void imprimir() {
        System.out
                .println("\nTicket: " + this.nroTicket + "\nCliente: " + this.cliente + "\nProductos:\n"
                        + this.productos + "\nTotal Ticket: $" + totalTicket());
    }

    // imprime detalle resumido para el ticket (desde interfaz)
    public void imprimirParcial() {
        int nroItem = 1;
        System.out.println("Ticket nro." + this.getNroTicket() + ":\n");
        for (Electrodomestico electrodomestico : productos) {
            System.out.println(
                    "Prod. " + nroItem + ": " + electrodomestico.getClass().getSimpleName() +
                            " - Marca: " + electrodomestico.getMarca() +
                            " (Modelo: " + electrodomestico.getModelo() +
                            ") | Precio: $"
                            + electrodomestico.getPrecio());

            nroItem++;
        }

        System.out.println("Total ticket: $" + totalTicket());
    }

}
