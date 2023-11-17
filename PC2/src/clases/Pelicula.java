package clases;

public class Pelicula {

    private String nombre;
    private String genero;
    private String idioma;
    private String TituloDistribucion;
    private String TituloOriginal;
    private String URL;
    private String id;
    private String calificacion;
    private Boolean subtitulos;
    private String añodeproduccion;
    private String fEstreno;
    private String resumen;
    private int duracion;
    private int[] Directores;
    private int[] Actores;

    public Pelicula(String nombre, String genero, String idioma, String tituloDistribucion, String tituloOriginal,
            String uRL, String id, String calificacion, Boolean subtitulos, String añodeproduccion, String fEstreno,
            String resumen, int duracion, int[] directores, int[] actores) {

        this.nombre = nombre;
        this.genero = genero;
        this.idioma = idioma;
        TituloDistribucion = tituloDistribucion;
        TituloOriginal = tituloOriginal;
        URL = uRL;
        this.id = id;
        this.calificacion = calificacion;
        this.subtitulos = subtitulos;
        this.añodeproduccion = añodeproduccion;
        this.fEstreno = fEstreno;
        this.resumen = resumen;
        this.duracion = duracion;
        Directores = directores;
        Actores = actores;
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
        return TituloDistribucion;
    }

    public void setTituloDistribucion(String tituloDistribucion) {
        TituloDistribucion = tituloDistribucion;
    }

    public String getTituloOriginal() {
        return TituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        TituloOriginal = tituloOriginal;
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

    public String getAñodeproduccion() {
        return añodeproduccion;
    }

    public void setAñodeproduccion(String añodeproduccion) {
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

    public int[] getDirectores() {
        return Directores;
    }

    public void setDirectores(int[] directores) {
        Directores = directores;
    }

    public int[] getActores() {
        return Actores;
    }

    public void setActores(int[] actores) {
        Actores = actores;
    }

}
