package clases;

public class Cineasta {

    private String nombre;
    private String nacionalidad;
    private String[] peliculasDirigidas;
    private String[] peliculasActuadas;
    private String[] reparto;

    public Cineasta(String nombre, String nacionalidad, String[] peliculasDirigidas, String[] peliculasActuadas,
            String[] reparto) {

        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.peliculasDirigidas = peliculasDirigidas;
        this.peliculasActuadas = peliculasActuadas;
        this.reparto = reparto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String[] getPeliculasDirigidas() {
        return peliculasDirigidas;
    }

    public void setPeliculasDirigidas(String[] peliculasDirigidas) {
        this.peliculasDirigidas = peliculasDirigidas;
    }

    public String[] getPeliculasActuadas() {
        return peliculasActuadas;
    }

    public void setPeliculasActuadas(String[] peliculasActuadas) {
        this.peliculasActuadas = peliculasActuadas;
    }

    public String[] getReparto() {
        return reparto;
    }

    public void setReparto(String[] reparto) {
        this.reparto = reparto;
    }

}
