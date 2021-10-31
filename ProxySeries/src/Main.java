public class Main {

    public static void main(String[] args) {
        ProxySerie proxy = new ProxySerie(new Grade());

        try{
            System.out.println(proxy.getSeries("The Night Of"));
        }
        catch (NotAvailable e) {
            System.out.println(e);
        }

        try{
            System.out.println(proxy.getSeries("Breaking Bad"));
        }
        catch (NotAvailable e) {
            System.out.println(e);
        }
        try{
            System.out.println(proxy.getSeries("The Wire"));
        }
        catch (NotAvailable e) {
            System.out.println(e);
        }
        try{
            System.out.println(proxy.getSeries("Millennium"));
        }
        catch (NotAvailable e){
            System.out.println(e);
        }
        try{
            System.out.println(proxy.getSeries("Twin Peaks"));
        }
        catch (NotAvailable e){
            System.out.println(e);
        }
        try{
            System.out.println(proxy.getSeries("Show Me A Hero"));
        }
        catch (NotAvailable e){
            System.out.println(e);
        }



    }
}
