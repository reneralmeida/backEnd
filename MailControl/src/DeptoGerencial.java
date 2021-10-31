public class DeptoGerencial extends Handler{

        @Override
    public void verificar(Mail eMail) {
            if (eMail.getDestino().equalsIgnoreCase("gerencial@colmeia.com") | (eMail.getAssunto().equalsIgnoreCase("gerencial"))) {
                System.out.println("Enviado à Gerência");
            } else {
                if (this.getSeguinte() != null) {
                    this.getSeguinte().verificar(eMail);
                }
            }
        }
}
