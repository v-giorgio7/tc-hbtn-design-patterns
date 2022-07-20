public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanho,
                                            int totalPaginas,
                                            int paginasColoridas,
                                            boolean ehFrenteEVerso) {
        return new Impressao(tamanho, totalPaginas, paginasColoridas, ehFrenteEVerso);
    }
}
