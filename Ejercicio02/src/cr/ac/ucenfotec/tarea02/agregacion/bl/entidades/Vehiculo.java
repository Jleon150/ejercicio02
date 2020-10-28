package cr.ac.ucenfotec.tarea02.agregacion.bl.entidades;
/**
 * Clase que crea un Vehiculo
 * @author Jesus Leon
 * @version 1.0 25/10/2020
 *
 */
import java.util.ArrayList;
import java.util.Objects;


public class Vehiculo {
    private String mnumSerie;
    private String mmarca;
    private ArrayList<Motor> motoresLista = new ArrayList<>();

    /**
     * Constructur vacio
     */
    public Vehiculo() {
    }

    /**
     *
     * @return Retorna el numero de serie
     */
    public String getMnumSerie() {
        return mnumSerie;
    }

    /**
     *
     * @param mnumSerie Numero de serie por parametros
     */
    public void setMnumSerie(String mnumSerie) {
        this.mnumSerie = mnumSerie;
    }

    /**
     *
     * @return retorna la marca
     */
    public String getMmarca() {
        return mmarca;
    }

    /**
     *
     * @param mmarca Marca del vehiculo
     */
    public void setMmarca(String mmarca) {
        this.mmarca = mmarca;
    }


    /**
     *
     * @param mnumSerie Constructor con parametros
     * @param mmarca
     */
    public Vehiculo(String mnumSerie, String mmarca) {
        this.mnumSerie = mnumSerie;
        this.mmarca = mmarca;

    }

    /**
     *
     * @return Retorna el array de motores
     */
    public ArrayList<Motor> getMotoresLista () {
            return motoresLista;
        }

    /**
     *
     * @param motoresLista ArrayList de motores
     */
    public void setMotoresLista (ArrayList < Motor > motoresLista) {
            this.motoresLista = motoresLista;
        }

        @Override
        public String toString () {
            return "Vehiculo{" +
                    "mnumSerie='" + mnumSerie + '\'' +
                    ", mmarca='" + mmarca + '\'' +
                    ", motoresLista=" + getMotoresLista() +
                    '}';
        }
        public void asignarMotor(Motor nuevo){getMotoresLista().add(nuevo);
    }

    /**
     *
     * @param o Equal para validar objetos
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(getMnumSerie(), vehiculo.getMnumSerie()) &&
                Objects.equals(getMmarca(), vehiculo.getMmarca()) &&
                Objects.equals(getMotoresLista(), vehiculo.getMotoresLista());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMnumSerie(), getMmarca(), getMotoresLista());
    }


}
