package clases;

public class Cine{

    private String nombre;
    private String direccion;
    private String telefono;
    private String cartelera;

    public Cine(String nombre, String direccion, String telefono) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCartelera() {
        return cartelera;
    }

    public void setCartelera(String cartelera) {
        this.cartelera = cartelera;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }

}
