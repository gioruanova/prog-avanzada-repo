package clases;

import java.util.ArrayList;
import java.util.List;

public class CasaElectrodomestico {

    // Atributos
    private List<Electrodomestico> productos;
    // private List<Ticket> Tickets;

    // Constructor
    public CasaElectrodomestico() {
        this.productos = new ArrayList<Electrodomestico>();
    }

    // Metodo agregar
    public void agregarProductos(Electrodomestico elec) {
        this.productos.add(elec);
    }

    // Metodo ver
    public void mostrarProductos() {
        for (Electrodomestico electrodomestico : productos) {
            System.out.println(electrodomestico.toString());
        }
    }

    public double totalProductos() {
        double total = 0;
        for (Electrodomestico electrodomestico : productos) {
            total += electrodomestico.getPrecio();
        }
        return total;
    }

    public void accionarTicket(Ticket ticket) {
        ticket.imprimir();
    }

    public void accionarTicketParcial(Ticket ticket) {
        ticket.imprimirParcial();

    }
}
