package MesaAula03;

public class Afiliados extends Vendedores{

    private int amtVenda;


    public Afiliados(String nome, int pontos, int amtVenda) {
        super(nome, pontos);
        this.amtVenda = amtVenda;
    }

    @Override
    public int calcularPontos() {
        return getPontos() + amtVenda * 15;
    }
}