public enum TamanhoImpressao {
    A2(0.22, 0.18, 0.32, 0.28),
    A3(0.20, 0.15, 0.30, 0.25),
    A4(0.15, 0.10, 0.25, 0.20);

    public final Double valorUmLadoPretoEBranco;
    public final Double valorFrenteEVersoPretoEBranco;
    public final Double valorUmLadoColorida;
    public final Double valorFrenteEVersoColorida;

    TamanhoImpressao(Double valorUmLadoPretoEBranco,
                     Double valorFrenteEVersoPretoEBranco,
                     Double valorUmLadoColorida,
                     Double valorFrenteEVersoColorida) {
        this.valorUmLadoPretoEBranco = valorUmLadoPretoEBranco;
        this.valorFrenteEVersoPretoEBranco = valorFrenteEVersoPretoEBranco;
        this.valorUmLadoColorida = valorUmLadoColorida;
        this.valorFrenteEVersoColorida = valorFrenteEVersoColorida;
    }

    public Double getValorUmLadoPretoEBranco() {
        return valorUmLadoPretoEBranco;
    }

    public Double getValorFrenteEVersoPretoEBranco() {
        return valorFrenteEVersoPretoEBranco;
    }

    public Double getValorUmLadoColorida() {
        return valorUmLadoColorida;
    }

    public Double getValorFrenteEVersoColorida() {
        return valorFrenteEVersoColorida;
    }
}
