package clases;

public class Cineasta {

    private String nombre;
    private String nacionalidad;
    private int[] peliculasDirigidas;
    private int[] peliculasActuadas;

    public Cineasta(String nombre, String nacionalidad, int[] peliculasDirigidas, int[] peliculasActuadas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.peliculasDirigidas = null;
        this.peliculasActuadas = null;
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

    public int[] getPeliculasDirigidas() {
        return peliculasDirigidas;
    }

    public void setPeliculasDirigidas(int[] peliculasDirigidas) {
        this.peliculasDirigidas = peliculasDirigidas;
    }

    public int[] getPeliculasActuadas() {
        return peliculasActuadas;
    }

    public void setPeliculasActuadas(int[] peliculasActuadas) {
        this.peliculasActuadas = peliculasActuadas;
    }
}
