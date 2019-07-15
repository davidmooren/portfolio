package beans;

public class Pais implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private String code;
    private String nombre;
    private String continente;
    private String region;
    private int poblacion;
    private Integer capital;

    public Pais() {
    }

    public Pais(String code, String nombre, String continente, String region, int poblacion, Integer capital) {
        this.code = code;
        this.nombre = nombre;
        this.continente = continente;
        this.region = region;
        this.poblacion = poblacion;
        this.capital = capital;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return this.continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Integer getCapital() {
        return this.capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Pais{" + "code=" + code + ", nombre=" + nombre + ", continente=" + continente + ", region=" + region + ", poblacion=" + poblacion + ", capital=" + capital + '}';
    }
}
