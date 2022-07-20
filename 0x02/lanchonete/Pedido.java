import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    /**
     * @param item -> TipoBebida
     */
    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    /**
     * @param item -> TamanhoBatata, TipoBrinde, TipoLanche
     */
    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        List<String> itensDentroCaixaDetails = new ArrayList<>();
        List<String> itensForaCaixaDetails = new ArrayList<>();
        itensDentroCaixa
                .forEach(item -> itensDentroCaixaDetails
                        .add(String.format("\t\t- %s %s\n", item.getTipoItemPedido(), item.getNome())));
        itensForaCaixa
                .forEach(item -> itensForaCaixaDetails
                        .add(String.format("\t\t- %s %s\n", item.getTipoItemPedido(), item.getNome())));

        return "\tFora da Caixa:\n"
                + String.join("", itensForaCaixaDetails)
                + "\tDentro da Caixa:\n"
                + String.join("", itensDentroCaixaDetails);
    }
}
