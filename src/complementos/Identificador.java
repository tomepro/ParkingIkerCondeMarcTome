
package complementos;

/**
 *
 * @author marctomjim
 */
public class Identificador {
    private String tipoVehiculo;
    private String matricula;
    private String color;

    public Identificador(String tipoVehiculo, String matricula, String color) {
        this.tipoVehiculo = tipoVehiculo;
        this.matricula = matricula;
        this.color = color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }
}
