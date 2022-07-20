

public class PedidoBuilder extends PedidoAbstractBuilder {

    private Pedido pedido = new Pedido();

    @Override
    public void setLanche(TipoLanche tipo) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.LANCHE, tipo));
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.BATATA, tamanho));
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.BRINDE, tipo));
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        pedido.adicionarItemForaCaixa(new ItemPedido(TipoItemPedido.BEBIDA, tipo));
    }

    public Pedido build() {
        return pedido;
    }

}
