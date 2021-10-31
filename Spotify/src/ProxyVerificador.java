public class ProxyVerificador implements Assinante{

    @Override
    public void tipoAssinante(Usuario usuario) {
        if (!userTipo(usuario.getTipo())) {
            ServicoDownload premium = new ServicoDownload();
            premium.tipoAssinante(usuario);
        } else {
            System.out.println("Conta free, download não permitido.");
        }
    }

    public boolean userTipo(String tipo) {
        if (tipo.equalsIgnoreCase("Free"))
            return true;
        return false;

    }
}
