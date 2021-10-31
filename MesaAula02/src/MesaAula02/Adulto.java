package MesaAula02;

public class Adulto extends Cardapio{

    public Adulto(double precoBase) {
        super(precoBase);
    }


    @Override
    public String montar() {
        return "Cardápio adulto: Oferta padrão sem acréscimo";
    }

    @Override
    public double precoVenda() {
        return getPrecoBase();
    }
}
