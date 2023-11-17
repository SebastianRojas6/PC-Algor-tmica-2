package clases;

public class funcion {

    private String dia;
    private String horaInicio;
    private String sala;
    private String pelicula;
    private String id;
    private String nButacas;

    public funcion(String dia, String horaInicio, String sala, String pelicula, String id, String nButacas) {

        this.dia = dia;
        this.horaInicio = horaInicio;
        this.sala = sala;
        this.pelicula = pelicula;
        this.id = id;
        this.nButacas = nButacas;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getnButacas() {
        return nButacas;
    }

    public void setnButacas(String nButacas) {
        this.nButacas = nButacas;
    }

}
