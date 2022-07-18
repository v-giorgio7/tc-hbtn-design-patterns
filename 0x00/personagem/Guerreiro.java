public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int inteligencia, int forca,
                int vigor, int resistencia, int destreza) throws Exception {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia,
                forca, vigor, resistencia, destreza);

        if (forca <= inteligencia || forca <= destreza) {
            throw new Exception("Atributos invalidos para GUERREIRO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return this.getInteligencia() * 0.05
                + this.getForca() * 0.8
                + this.getDestreza() * 0.1
                + this.getVigor() * 0.05;
    }
}
