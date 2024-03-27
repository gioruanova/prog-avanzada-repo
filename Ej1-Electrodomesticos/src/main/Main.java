package main;

import java.util.Scanner;

import clases.CasaElectrodomestico;
import clases.Heladera;
import clases.Licuadora;
import clases.Televisor;
import clases.Lavarropas;
import clases.Ticket;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CasaElectrodomestico casa1 = new CasaElectrodomestico();

        // inicio ticket / venta
        Ticket ticket1 = new Ticket();

        System.out.println(
                "Ingresar articulo a registrar:\n1 una Heladera\n2 un Lavarropas\n3 un Licuadora\n4 un Televisor\n0 SALIR");
        Integer input = scanner.nextInt();

        while (input != 0) {
            switch (input) {
                case 1:
                    Heladera nuevaHeladera = new Heladera();
                    nuevaHeladera.capturaDatos(scanner);
                    casa1.agregarProductos(nuevaHeladera);
                    ticket1.agregarProductos(nuevaHeladera);
                    break;
                case 2:
                    Lavarropas nuevoLavarropas = new Lavarropas();
                    nuevoLavarropas.capturaDatos(scanner);
                    casa1.agregarProductos(nuevoLavarropas);
                    ticket1.agregarProductos(nuevoLavarropas);
                    break;
                case 3:
                    Licuadora nuevaLicuadora = new Licuadora();
                    nuevaLicuadora.capturaDatos(scanner);
                    casa1.agregarProductos(nuevaLicuadora);
                    ticket1.agregarProductos(nuevaLicuadora);
                    break;
                case 4:
                    Televisor nuevoTelevisor = new Televisor();
                    nuevoTelevisor.capturaDatos(scanner);
                    casa1.agregarProductos(nuevoTelevisor);
                    ticket1.agregarProductos(nuevoTelevisor);
                    break;
                default:
                    break;
            }

            System.out.println(
                    "\nIngresar siguiente articulo a registrar:\n1 una Heladera\n2 un Lavarropas\n3 un Licuadora\n4 un Televisor\n0 SALIR");
            input = scanner.nextInt();

        }

        casa1.accionarTicket(ticket1);
        System.out.println("-----------------");
        casa1.accionarTicketParcial(ticket1);

    }

}
