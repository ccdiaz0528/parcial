package Parcial;

public class Novela extends Libro {
    public String tipo;
    public Novela(String titulo, String autor, int precio, String propietario) {
        super(titulo, autor, precio, propietario);
        //TODO Auto-generated constructor stub
    }

    public Novela(String titulo, String autor, int precio, String propietario, String tipo) {
        super(titulo, autor, precio, propietario);
        this.tipo = tipo;
    }

   public void imprimirNovela(){
    System.out.println("El tipo de novela es: "+tipo);
   }

  
 

}
