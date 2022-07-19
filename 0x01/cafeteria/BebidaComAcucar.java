import java.util.List;

public class BebidaComAcucar extends BebidaDecorator {

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> newList = super.obterIngredientes();
        newList.add("acucar");
        return newList;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
