import java.util.UUID;

public class SalarioService {

    private CalculadorSalarioService calculador =
            CalculadorSalarioService.getCalculadorSalarioService();

    public UUID getUuid() {
        return calculador.uuid;
    }

    public double calcular(double salarioBruto, double valorDescontos,
                           double valorVendas, double percentualComissao) {
        return calculador.calcularSalarioLiquido(salarioBruto, valorDescontos,
                valorVendas, percentualComissao);
    }
}
