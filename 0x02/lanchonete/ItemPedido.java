

public class ItemPedido<T> {
    private TipoItemPedido tipoItemPedido;
    private T nome;

    public ItemPedido(TipoItemPedido tipoItemPedido, T nome) {
        this.tipoItemPedido = tipoItemPedido;
        this.nome = nome;
    }

    public TipoItemPedido getTipoItemPedido() {
        return tipoItemPedido;
    }

    public T getNome() {
        return nome;
    }
}
