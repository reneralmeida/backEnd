public class HotelApi {

    //Procura hotéis de acordo com o cronograma
    public void buscarHoteis(String dataEntrada, String dataSaida, String cidade) {
        System.out.println("==================================");
        System.out.println("Hotéis disponíveis: " + cidade);
        System.out.println("Check-In: " + dataEntrada + " - Check-Out: " + dataSaida);
    }
}
