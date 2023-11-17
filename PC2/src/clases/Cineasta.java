package clases;

public class Cineasta {

    private String nombre;
    private String nacionalidad;
    private int[] pelicuas;

    public Cineasta(String nombre, String nacionalidad, int[] pelicuas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.pelicuas = pelicuas;
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

    public int[] getPelicuas() {
        return pelicuas;
    }

    public void setPelicuas(int[] pelicuas) {
        this.pelicuas = pelicuas;
    }

}
