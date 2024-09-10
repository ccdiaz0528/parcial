package Parcial;

public class Main {
    public static void main(String[] args) {
System.out.println("----- Libro -----");
        Libro Libro1 = new Libro("El principito", "Antoine de Saint-Exupéry",20000,"Cristian Camilo Diaz Ramirez");
        Libro1.imprimir();
System.out.println("\n----- El libro de Uniajc -----");
        LibroTextoUniajc libro2 = new LibroTextoUniajc("Sara Tomate", "Jean Ure", 15000, "Cristian Camilo Diaz Ramirez", "Ingenieria");
        libro2.imprimir();
        libro2.imprimirFacultad();
System.out.println("\n----- Libro novela -----");
        Novela libro3 = new Novela("Cien años de soledad", "Gabriel Garcia Marquez", 30000, "Cristian Camilo Diaz Ramirez", "Realismo magico");
        libro3.imprimir();
        libro3.imprimirNovela();

    }
    

}
