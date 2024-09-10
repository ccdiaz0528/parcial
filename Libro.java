package Parcial;

public class Libro {
    public String titulo;
    public String autor;
    public String propietario;
    public int precio;
//Constructor
    public Libro(String titulo, String autor, int precio, String propietario) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.propietario = propietario;
    }
public Libro(String titulo2, String autor2, int precio2) {
        //TODO Auto-generated constructor stub
    }
    //Gets And Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

public void imprimir(){
    System.out.println("El titulo del libro es: "+titulo);
    System.out.println("El autor del libro es: "+autor);
    System.out.println("El precio del libro es: "+precio);
    System.out.println("El nombre del propietario es: "+propietario);
    
    
}

}
