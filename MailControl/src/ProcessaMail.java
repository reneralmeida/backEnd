public class ProcessaMail {

    public static void main(String[] args) {
        CheckMail check = new CheckMail();
        check.verificar(new Mail("whatever@digitalmess.com", "tecnico@whatever.com", "tecnico"));
        check.verificar(new Mail("whatever@digitalmess.com", "gerencia@whatever.com", "gerencial"));
        check.verificar(new Mail("whatever@digitalmess.com", "comercial@whatever.com", "comercial"));
        check.verificar(new Mail("whatever@digitalmess.com", "teste@whatever.com", "testando"));
    }
}
