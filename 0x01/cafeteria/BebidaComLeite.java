import java.util.List;

public class BebidaComLeite extends BebidaDecorator {

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> newList = super.obterIngredientes();
        newList.add("leite");
        return newList;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
