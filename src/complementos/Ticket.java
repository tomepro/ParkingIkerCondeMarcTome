package complementos;

public class Ticket {
    private String parkingId;
    private String codigoPlaza;
    private String tipoVehiculo;
    private String matricula;
    private String color;
    private int tiempoEstacionado;
    private double importe;

    public Ticket(String parkingId, String codigoPlaza, String tipoVehiculo, String matricula, String color, int tiempoEstacionado, double importe) {
        this.parkingId = parkingId;
        this.codigoPlaza = codigoPlaza;
        this.tipoVehiculo = tipoVehiculo;
        this.matricula = matricula;
        this.color = color;
        this.tiempoEstacionado = tiempoEstacionado;
        this.importe = importe;
    }

    public String generarDetalle() {
        return String.format("""
            ___________________________
           |                           |
           |     PARKING DE MONLAU     |
           |___________________________|
           Direccion: C/ Monlau 6, Barcelona.
           Identificador: %s
           Plaza asignda: %s
           Vehiculo: %s
           Matricula: %s
           Color: %s
           Tiempo estimado: %d horas
           Importe a pagar: %.2f euros
           """,
           parkingId, codigoPlaza, tipoVehiculo.toUpperCase(),
           matricula, color, tiempoEstacionado, importe);
    }
}
