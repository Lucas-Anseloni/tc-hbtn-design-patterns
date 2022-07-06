

import java.util.List;

public class BebidaDecorator extends Bebida{

    private Bebida bebidaDecorator;

    public BebidaDecorator(Bebida bebidaDecorator) {
        this.bebidaDecorator = bebidaDecorator;
    }

    @Override
    public List<String> obterIngredientes() {
        return bebidaDecorator.obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return bebidaDecorator.obterPreco();
    }
}
