import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();
        //-----------------------------------------------------------------
        Aplicacao lista = new Aplicacao(2,3,7,6,9,4);
        Aplicacao lista2 = new Aplicacao(7,7,7,7,7,7,3,3,3,3,3);
        Aplicacao lista3 = new Aplicacao();

        try {
            lista.listaMedia();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        try {
            lista2.listaMedia();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        try {
            lista3.listaMedia();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}
