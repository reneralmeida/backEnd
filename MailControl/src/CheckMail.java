public class CheckMail {

    Handler initial;

    public CheckMail() {
        this.initial = new DeptoGerencial();
        Handler tecnico = new DeptoTecnico();
        Handler comercial = new DeptoComercial();
        Handler spam = new SpamHandler();

        initial.setSeguinte(tecnico);
        tecnico.setSeguinte(comercial);
        comercial.setSeguinte(spam);
    }

    public void verificar(Mail eMail) {
        initial.verificar(eMail);
    }
}
