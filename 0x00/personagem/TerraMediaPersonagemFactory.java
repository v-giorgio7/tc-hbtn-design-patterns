public class TerraMediaPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nomePersonagem) throws Exception {
        switch (tipo) {
            case MAGO:
                return new Mago(nomePersonagem, 10, 2, 5, 3, 4);
            case LADRAO:
                return new Ladrao(nomePersonagem, 2, 6, 8, 5, 10);
            case GUERREIRO:
                return new Guerreiro(nomePersonagem, 1, 8, 5, 10, 6);
            default:
                System.out.println("Tipo inválido");
                break;
        }

        return null;
    }
}
