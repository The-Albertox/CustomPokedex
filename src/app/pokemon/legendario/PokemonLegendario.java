package app.pokemon.legendario;

import app.pokemon.normal.PokemonNormal;

public class PokemonLegendario extends PokemonNormal {
    protected String localizacion;

    public PokemonLegendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Localización: " + localizacion;
    }
}
