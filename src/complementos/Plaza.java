
package complementos;

/**
 *
 * @author marctomjim
 */
public class Plaza {
    private boolean ocupado;
    private Identificador vehiculo;

    public Plaza() {
        this.ocupado = false;
        this.vehiculo = null;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void reservar(Identificador vehiculo) {
        this.ocupado = true;
        this.vehiculo = vehiculo;
    }

    public void liberar() {
        this.ocupado = false;
        this.vehiculo = null;
    }
}


