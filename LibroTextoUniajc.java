package Parcial;

public class LibroTextoUniajc extends LibroTexto {
    public String facultad;

    public LibroTextoUniajc(String titulo, String autor, int precio, String propietario) {
        super(titulo, autor, precio, propietario);
        //TODO Auto-generated constructor stub
    }

    public LibroTextoUniajc(String titulo, String autor, int precio, String propietario, String facultad) {
        super(titulo, autor, precio, propietario);
        this.facultad = facultad;
    }

    public void imprimirFacultad (){
System.out.println("La facultad es: "+facultad);
    }
}
