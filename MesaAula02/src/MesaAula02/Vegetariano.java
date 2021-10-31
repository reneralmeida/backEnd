package MesaAula02;

public class Vegetariano extends Cardapio{

    private double conteiner;

    public Vegetariano(double precoBase, double conteiner) {
        super(precoBase);
        this.conteiner = conteiner;
    }

    @Override
    public String montar() {
        return "Cardápio vegetariano: Embalagem especial inclusa";
    }

    @Override
    public double precoVenda() {
        double add = 0.1;
        return getPrecoBase() + conteiner * add;
    }
}
