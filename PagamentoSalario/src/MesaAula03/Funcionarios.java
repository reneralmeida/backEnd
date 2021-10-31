package MesaAula03;

public class Funcionarios extends Vendedores {

    private int amtAfiliado;
    private int amtVenda;
    private int amtAnos;

    public Funcionarios(String nome, int pontos, int amtAfiliado, int amtVenda, int amtAnos) {
        super(nome, pontos);
        this.amtAfiliado = amtAfiliado;
        this.amtVenda = amtVenda;
        this.amtAnos = amtAnos;
    }

    @Override
    public int calcularPontos() {
        return getPontos() + amtAfiliado * 10 + amtVenda * 5 + amtAnos * 5;
    }
}