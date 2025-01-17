package principal;

import complementos.Identificador;
import complementos.Parking;
import complementos.Plaza;
import complementos.Ticket;

/**
 *
 * @author marctomjim
 */
import java.time.LocalDateTime;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean todoCorrecto = false;
        String tipoVehiculo = "";
        String matricula = "";
        String color = "";

        Parking parking = new Parking("PR123", "C/ Monlau 6, Barcelona", "+34 666 88 66",
                25, 10, 2.5, 1.5, 3.0);

        System.out.println("Bienvenido al sistema de Parking");

        do {
            System.out.print("Ingrese el tipo de vehiculo (coche, moto o camion): ");
            tipoVehiculo = scanner.nextLine().toLowerCase();

            if (!tipoVehiculo.equals("coche") && !tipoVehiculo.equals("moto") && !tipoVehiculo.equals("camion")) {
                System.out.println("Tipo de vehiulo invalido.");
                todoCorrecto = false;
                continue;
            }

            System.out.print("Ingrese la matricula: ");
            matricula = scanner.nextLine();

            System.out.print("Ingrese el color: ");
            color = scanner.nextLine();

            todoCorrecto = true;
        } while (!todoCorrecto);

        Identificador vehiculo = new Identificador(tipoVehiculo, matricula, color);

        String codigoPlaza = parking.asignarPlaza(vehiculo);
        if (codigoPlaza == null) {
            System.out.println("No hay plazas disponibles.");
            return;
        }

        System.out.print("Ingrese el tiempo estimado de estacionamiento (en horas): ");
        int tiempoEstacionado = scanner.nextInt();

        double importe = parking.calcularImporte(tipoVehiculo, tiempoEstacionado);

        Ticket ticket = new Ticket(parking.getParkingId(), codigoPlaza, tipoVehiculo, matricula, color, tiempoEstacionado, importe);

        System.out.println("\n ---CONFIRMACION DEL PAGO---");
        System.out.println(ticket.generarDetalle());
    }
}