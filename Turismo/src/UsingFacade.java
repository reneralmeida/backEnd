public class UsingFacade implements ICheckFacade {

    // Armazenar a instância de cada API na memória
    private VooApi vooApi;
    private HotelApi hotelApi;

    public UsingFacade() {
        vooApi = new VooApi();
        hotelApi = new HotelApi();
    }

    public void buscar(String dataPartida, String dataRetorno, String origem, String destino) {
        vooApi.buscarVoos(dataPartida, dataRetorno, origem, destino);
        hotelApi.buscarHoteis(dataPartida, dataRetorno, destino);
    }
}
