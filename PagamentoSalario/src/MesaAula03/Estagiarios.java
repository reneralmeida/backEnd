package MesaAula03;

public class Estagiarios extends Vendedores{

    private int amtVenda;

    public Estagiarios(String nome, int pontos, int amtVenda) {
        super(nome, pontos);
        this.amtVenda = amtVenda;
    }


    public void mostrarCategoriaEstagiario() {
        int pontos = calcularPontos();
        System.out.print(getNome());
        System.out.print(" possui tantos pontos: " + pontos + " sua categoria é estagiário ");
        System.out.print(categorizarEstagiario(pontos)+".");
        System.out.println();
    }

    public String categorizarEstagiario(int pontos) {
        if (pontos < 50) {
            return "novato";
        } else {
            return "experiente";
        }
    }

    @Override
    public int calcularPontos() {
        return getPontos() + amtVenda * 5;
    }
}