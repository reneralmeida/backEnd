public class Principal {
    public static void main(String[] args) {

        Usuario usuario = new Usuario(01, "Free");
        Assinante assinante = new ProxyVerificador();
        assinante.tipoAssinante(usuario);

        System.out.println("============================================================");

        Usuario usuario1 = new Usuario(02, "Premium");
        Assinante assinante1 = new ProxyVerificador();
        assinante1.tipoAssinante(usuario1);

    }
}
