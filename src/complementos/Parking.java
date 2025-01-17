
package complementos;

/**
 *
 * @author marctomjim
 */
import java.util.ArrayList;
import java.util.List;


import java.util.*;

public class Parking {
    private String parkingId;
    private String direccion;
    private String telefono;
    private int plazasCoche;
    private int plazasMoto;
    private double tarifaCoche;
    private double tarifaMoto;
    private double tarifaCamion;

    public Parking(String parkingId, String direccion, String telefono, int plazasCoche, int plazasMoto,
                   double tarifaCoche, double tarifaMoto, double tarifaCamion) {
        this.parkingId = parkingId;
        this.direccion = direccion;
        this.telefono = telefono;
        this.plazasCoche = plazasCoche;
        this.plazasMoto = plazasMoto;
        this.tarifaCoche = tarifaCoche;
        this.tarifaMoto = tarifaMoto;
        this.tarifaCamion = tarifaCamion;
    }

    public String getParkingId() {
        return parkingId;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public double calcularImporte(String tipoVehiculo, int tiempoEstacionado) {
        switch (tipoVehiculo) {
            case "coche":
                return tarifaCoche * tiempoEstacionado;
            case "moto":
                return tarifaMoto * tiempoEstacionado;
            case "camion":
                return tarifaCamion * tiempoEstacionado;
            default:
                return 0.0;
        }
    }

    public String asignarPlaza(Identificador vehiculo) {
        int piso = 1;
        int plaza = 4; 
        return parkingId + "_" + piso + "_" + plaza;
    }
}

