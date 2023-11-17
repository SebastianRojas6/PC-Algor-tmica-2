package clases;

public class Pelicula {

    private String nombre;
    private String genero;
    private String idioma;
    private String tituloDistribucion;
    private String tituloOriginal;
    private String URL;
    private String id;
    private String calificacion;
    private Boolean subtitulos;
    private int añodeproduccion;
    private String fEstreno;
    private String resumen;
    private int duracion;
    private String[] directores;
    private String[] actores;
    private String[] reparto;

    public Pelicula(String nombre, String genero, String idioma, String tituloDistribucion, String tituloOriginal,
            String uRL, String id, String calificacion, Boolean subtitulos, int añodeproduccion, String fEstreno,
            String resumen, int duracion, String[] directores, String[] actores, String[] reparto) {
        this.nombre = nombre;
        this.genero = genero;
        this.idioma = idioma;
        this.tituloDistribucion = tituloDistribucion;
        this.tituloOriginal = tituloOriginal;
        URL = uRL;
        this.id = id;
        this.calificacion = calificacion;
        this.subtitulos = subtitulos;
        this.añodeproduccion = añodeproduccion;
        this.fEstreno = fEstreno;
        this.resumen = resumen;
        this.duracion = duracion;
        this.directores = null;
        this.actores = actores;
        this.reparto = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTituloDistribucion() {
        return tituloDistribucion;
    }

    public void setTituloDistribucion(String tituloDistribucion) {
        this.tituloDistribucion = tituloDistribucion;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String uRL) {
        URL = uRL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(Boolean subtitulos) {
        this.subtitulos = subtitulos;
    }

    public int getAñodeproduccion() {
        return añodeproduccion;
    }

    public void setAñodeproduccion(int añodeproduccion) {
        this.añodeproduccion = añodeproduccion;
    }

    public String getfEstreno() {
        return fEstreno;
    }

    public void setfEstreno(String fEstreno) {
        this.fEstreno = fEstreno;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String[] getDirectores() {
        return directores;
    }

    public void setDirectores(String[] directores) {
        this.directores = directores;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    public String[] getReparto() {
        return reparto;
    }

    public void setReparto(String[] reparto) {
        this.reparto = reparto;
    }
}
