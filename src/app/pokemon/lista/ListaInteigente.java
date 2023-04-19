package app.pokemon.lista;

import app.pokemon.normal.PokemonNormal;

public class ListaInteigente {
    protected String[] stringArray;
    protected int totalStrings = 0;

  public ListaInteigente() {
    this.stringArray = new String[1];
  }

  public void aniadir(String texto) {
    String[] newStringArray = new String[this.totalStrings + 1];

    for (int i = 0; i < this.stringArray.length; i++) {
      newStringArray[i] = this.stringArray[i];
    }

    newStringArray[this.totalStrings] = texto;
    this.stringArray = newStringArray;
    this.totalStrings++;
  }
  public void eliminar(String text) {

    int totalElements = 0;
    for (int i = 0; i < this.stringArray.length; i++) {
      if (this.stringArray[i].equals(text)){
        this.stringArray[i] = null;
      } else {
        totalElements++;
      }
    }

    String[] newStringArray = new String[totalElements];
    int newArrayIndex = 0;

    for (int i = 0; i < this.stringArray.length; i++) {
      if (this.stringArray[i] != null){
        newStringArray[newArrayIndex] = this.stringArray[i];
        newArrayIndex++;
      }
    }

    this.stringArray = newStringArray;
    this.totalStrings = totalElements;
  }

  public void mostrar() {
    for (String string : this.stringArray) {
      System.out.println("-> " + string);
    }
  }

  public void aniadir(PokemonNormal pokemonCapturado) {
  }

  public void eliminar(PokemonNormal pokemonCapturado) {
  }

public PokemonNormal retornar(int numero) {
    return null;
}
    
}
