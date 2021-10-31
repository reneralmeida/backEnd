public class Usuario {
    public static void main(String[] args) {
        GradeFilmesProxy proxy = new GradeFilmesProxy(new GradeFilmes());
        proxy.setIp(new IP(99,23,15,18));

        try {
            System.out.println(proxy.getFilme("The Matrix").getLink());
        }
        catch (BlacklistedContent e) {
            System.out.println(e);
        }
    }
}
