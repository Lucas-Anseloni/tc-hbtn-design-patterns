

import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{
    public BebidaComAcucar(Bebida bebidaDecorator) {
        super(bebidaDecorator);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> listaIngredientes = super.obterIngredientes();
        listaIngredientes.add("acucar");
        return listaIngredientes;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
