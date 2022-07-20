public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanho,
                                            int totalPaginas,
                                            int paginasColoridas,
                                            boolean ehFrenteVerso) {
        return new Impressao(tamanho, totalPaginas, paginasColoridas, ehFrenteVerso);
    }
}
