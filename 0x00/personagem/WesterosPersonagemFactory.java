public class WesterosPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nomePersonagem) throws Exception {
        switch (tipo) {
            case MAGO:
                return new Mago(nomePersonagem, 8, 3, 3, 3, 4);
            case LADRAO:
                return new Ladrao(nomePersonagem, 1, 8, 7, 7, 10);
            case GUERREIRO:
                return new Guerreiro(nomePersonagem, 0, 9, 7, 10, 7);
            default:
                System.out.println("Tipo inválido");
                break;
        }

        return null;
    }
}
