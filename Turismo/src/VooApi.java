public class VooApi {

    //Procurar vôos de acordo com o ronograma
    public void buscarVoos(String dataPartida, String dataRetorno, String origem, String destino) {
        System.out.println("==================================");
        System.out.println("Voos encotrados para " + destino + " saindo de " + origem);
        System.out.println("Data de saída: " + dataPartida + " - Data de volta: " + dataRetorno);
    }
}
