public abstract class Personagem {
    private String nome;
    private TipoPersonagem tipo;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;

    public Personagem(String nome, TipoPersonagem tipo,
                      int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public abstract double getDanoAtaque();

    public String getNome() {
        return nome;
    }

    public TipoPersonagem getTipo() {
        return tipo;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public int getVigor() {
        return vigor;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getDestreza() {
        return destreza;
    }

    @Override
    public String toString() {
        return String.format("Personagem { nome = %s, tipo = %s," +
                " inteligencia = %d, forca = %d," +
                " vigor = %d, resistencia = %d, destreza = %d," +
                " dano ataque = %.2f }",
                this.nome,
                this.tipo,
                this.inteligencia,
                this.forca,
                this.vigor,
                this.resistencia,
                this.destreza,
                this.getDanoAtaque());
    }
}
