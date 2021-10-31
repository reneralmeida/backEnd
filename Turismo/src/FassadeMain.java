public class FassadeMain {

    public static void main(String[] args) {
        ICheckFacade cliente1 = new UsingFacade();
        cliente1.buscar("18/10/2021", "03/11/2021", "Araçatuba", "São Paulo");
    }
}
