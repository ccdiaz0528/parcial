package Parcial;

public class LibroTexto extends Libro {
    public String curso;
    
    public LibroTexto(String titulo, String autor, int precio, String propietario) {
        super(titulo, autor, precio, propietario);
        //TODO Auto-generated constructor stub
    }

    public LibroTexto(String titulo, String autor, int precio, String propietario, String curso) {
        super(titulo, autor, precio, propietario);
        this.curso = curso;
    }



  


    

}



    

