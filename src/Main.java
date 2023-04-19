import java.util.Scanner;

import app.pokemon.lista.ListaInteigente;

public class Main {
    
    public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner(System.in);
      String nombre = " ";
      String tipo = " ";
      int peso;
      int altura;
      String descripcion;
      String localizacion = " ";
      int numero;
      String respuesta = " ";
      ListaInteigente listaAvistados = new ListaInteigente();
      ListaInteigente listaCapturados = new ListaInteigente();
      boolean salida = false;
      String opcion = " ";
      while (salida ==  false) {
        System.out.println(" muy buenas ");
        System.out.println("a. aniadir un pokemon avistado");
        System.out.println("b. aniadir avistamiento legendario");
        System.out.println("c. pasara a capturado");
        System.out.println("d. mostrar la lista de avistados");
        System.out.println("e. mostrar la lista de capturados");
        System.out.println("f. cerrar la pokedex");
        opcion = teclado.nextLine();
        
      }

    }
}