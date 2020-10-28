package cr.ac.ucenfotec.tarea02.agregacion.bl.entidades;
/**
 * Clase que crea un motor
 * @author Jesus Leon
 * @version 1.0 25/10/2020
 *
 */
import java.util.Objects;


public class Motor {
    private String mserie;
    private int mnumCilindros;

    /**
     *
     * @return retorna el numero de serie
     */
    public String getMserie() {
        return mserie;
    }

    /**
     *
     * @param mserie Parametro String del numero de serie
     */
    public void setMserie(String mserie) {
        this.mserie = mserie;
    }

    /**
     * retorna el numero de cilindros
     * @return
     */
    public int getMnumCilindros() {
        return mnumCilindros;
    }

    /**
     *
     * @param mnumCilindros Numero de cilindros
     */

    public void setMnumCilindros(int mnumCilindros) {
        this.mnumCilindros = mnumCilindros;
    }

    /**
     * constructor vacio
     */
    public Motor() {
    }

    /**
     *
     * @param mserie Recibe el numero de serie y el numero de cilindros
     * @param mnumCilindros
     */
    public Motor(String mserie, int mnumCilindros) {
        this.mserie = mserie;
        this.mnumCilindros = mnumCilindros;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "mserie='" + mserie + '\'' +
                ", mnumCilindros=" + mnumCilindros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motor)) return false;
        Motor motor = (Motor) o;
        return getMnumCilindros() == motor.getMnumCilindros() &&
                getMserie().equals(motor.getMserie());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMserie(), getMnumCilindros());
    }
}
