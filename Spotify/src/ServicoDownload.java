public class ServicoDownload implements Assinante{
    @Override
    public void tipoAssinante(Usuario usuario) {
        System.out.println("Bem-vindo, usuário premium. Download habilitado.");
    }
}
