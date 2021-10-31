public class FacadeDesconto implements IFacadeDesconto{

    private APICartao apiCartao;
    private APIProduto apiProduto;
    private APIQuantidade apiQuantidade;

    public FacadeDesconto() {
        apiCartao = new APICartao();
        apiProduto = new APIProduto();
        apiQuantidade = new APIQuantidade();
    }

    public int desconto(Cartao cartao, Produto prod, int quantidade) {
        int desconto = 0;
        desconto = desconto + apiQuantidade.desconto(quantidade);
        desconto = desconto + apiProduto.desconto(prod);
        desconto = desconto + apiCartao.desconto(cartao);

        return desconto;
    }
}
