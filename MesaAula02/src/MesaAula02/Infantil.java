package MesaAula02;

public class Infantil extends Cardapio{

    private String presente;

    public Infantil(double precoBase, String freegel) {
        super(precoBase);
        this.presente = freegel;
    }

    @Override
    public String montar() {
        return "Cardápio infantil: Brinde incluso";
    }

    @Override
    public double precoVenda() {
        double precoAdd = 2;
        return getPrecoBase() + precoAdd;
    }
}
