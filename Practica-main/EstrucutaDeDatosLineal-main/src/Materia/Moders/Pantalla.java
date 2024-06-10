package Materia.Moders;

public class Pantalla {
    private int id;
    private String nombre;
    private String ruta;
    public int numero;
    public Pantalla(String nombre, String ruta, int id) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRuta() {
        return ruta;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Pantalla(int numero) {
        this.numero = numero;
    }
    
    
}
