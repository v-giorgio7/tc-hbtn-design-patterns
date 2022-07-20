import java.util.HashMap;
import java.util.Map;

public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private int paginasPretoEBranco;
    private boolean ehFrenteVerso;
    private TamanhoImpressao tamanho;
    private Map<TamanhoImpressao, Double> valorPretoBrancoFrenteApenas = new HashMap<>();
    private Map<TamanhoImpressao, Double> valorPretoBrancoFrenteVerso = new HashMap<>();
    private Map<TamanhoImpressao, Double> valorColoridasFrenteApenas = new HashMap<>();
    private Map<TamanhoImpressao, Double> valorColoridasFrenteVerso = new HashMap<>();

    public Impressao(TamanhoImpressao tamanho, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso){
        this.tamanho = tamanho;
        valorPretoBrancoFrenteApenas.put(tamanho, tamanho.getValorUmLadoPretoEBranco());
        valorPretoBrancoFrenteVerso.put(tamanho, tamanho.getValorFrenteEVersoPretoEBranco());
        valorColoridasFrenteApenas.put(tamanho, tamanho.getValorUmLadoColorida());
        valorColoridasFrenteVerso.put(tamanho, tamanho.getValorFrenteEVersoColorida());
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.paginasPretoEBranco = paginasTotais - paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public Double calcularTotal() {
        Double totalPretoEBranco = 0.0;
        Double totalColorida = 0.0;

        if (this.ehFrenteVerso) {
            totalPretoEBranco = this.paginasPretoEBranco * valorPretoBrancoFrenteVerso.get(tamanho);
            totalColorida = this.paginasColoridas * valorColoridasFrenteVerso.get(tamanho);
        } else {
            totalPretoEBranco = this.paginasPretoEBranco * valorPretoBrancoFrenteApenas.get(tamanho);
            totalColorida = this.paginasColoridas * valorColoridasFrenteApenas.get(tamanho);
        }

        return totalPretoEBranco + totalColorida;
    }

    @Override
    public String toString() {
        return String.format("total de paginas: %d, total coloridas: %d, " +
                "total preto e branco: %d, %b. total: R$ %.2f",
                this.paginasTotais,
                this.paginasColoridas,
                this.paginasPretoEBranco,
                this.ehFrenteVerso,
                this.calcularTotal());
    }
}
