package app.pokemon.normal;



public class PokemonNormal {
    protected String nombre;
    protected String tipo;
    protected double altura;
    protected double peso;
    protected String descripcion;
    
    public PokemonNormal(String nombre, String tipo, double altura, double peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }
    public PokemonNormal(String nombre, String tipo) {
        this(nombre, tipo, 0.0, 0.0, "");
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
}
    

