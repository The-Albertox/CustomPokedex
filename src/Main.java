import java.util.Scanner;

import app.pokemon.legendario.PokemonLegendario;
import app.pokemon.lista.ListaInteigente;
import app.pokemon.normal.PokemonNormal;

public class Main {
    
    public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner(System.in);
      String nombre = " ";
      String tipo = " ";
      int peso;
      int altura;
      String descripcion;
      String localizacion = " ";
      int nivel;
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
        
        switch (opcion) {
          case "a":
          System.out.println("por favo, inserte en nombre y el tipo del pokemon visto");
          System.out.println("nombre: "); nombre = teclado.nextLine();
          System.out.println("tipo: "); tipo = teclado.nextLine();

          PokemonNormal pokemonN = new PokemonNormal(nombre, tipo);
          listaAvistados.aniadir(pokemonN);

          System.out.println("\n" + "pokemon aniadido a avistados" + "\n");
            
            break;

          case"b":

            System.out.println("por favor ponga el nombre y el tipo del pokemon i la localizacion del legendario avistado");
            System.out.println("nombre: "); nombre = teclado.nextLine();
            System.out.println("tipo: "); tipo = teclado.nextLine();
            System.out.println("localizacion: "); localizacion = teclado.nextLine();

            PokemonLegendario pokemonLeg = new PokemonLegendario(nombre, tipo, localizacion);
            System.out.println("\n" + "pokemon legendaio avistado aniadido" + "\n");
            break;
          
          case"c":
          System.out.println("Por favor inserte el número del pokemon que ha capturado");

          listaAvistados.mostrar(); 
          nivel = teclado.nextInt();
          PokemonNormal pokemonCapturado = listaAvistados.retornar(nivel);

          System.out.println("Pokemon añadido a capturados"); 
        listaCapturados.aniadir(pokemonCapturado);
        listaAvistados.eliminar(pokemonCapturado);

       System.out.println("Por favor inserte los siguientes parámetros para finalizar la cap");
       System.out.println("Peso: ");

       peso= teclado.nextInt(); 
       pokemonCapturado.setPeso(peso);

      System.out.println( "Altura: "); 
      altura = teclado.nextInt();

      pokemonCapturado.setAltura(altura);
      teclado.nextLine();
      
      System.out.println( "Descripcion : "); 
      descripcion = teclado.nextLine();
      pokemonCapturado.setDescripcion(descripcion);

        break;
          case "d":
          listaAvistados.mostrar();
          break;
          case "e":
          listaCapturados.mostrar();
          break;
          case "f":
          salida = true;
          break;


          default:
            break;
        }
      }

    }
}