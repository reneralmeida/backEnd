import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

    private static final Logger logger = Logger.getLogger(Aplicacao.class);

    private List<Integer> listaInteiros = new ArrayList<>();

    public Aplicacao(Integer ...inteiros) {
        for(int i =0; i < inteiros.length; i++){
            listaInteiros.add(inteiros[i]);
        }

    }

    public double media() {
        double media = 0;
        for(int i =0; i < listaInteiros.size(); i++){
            media = media + listaInteiros.get(i);
        }

        return media / listaInteiros.size();
    }

    public void listaMedia() throws Exception {
        if(listaInteiros.size() > 5 && listaInteiros.size() < 10) {
            logger.info("[ListaMedia: "+media()+"]"+" Mais de cinco items na lista.");
        }
        if(listaInteiros.size() > 10) {
            logger.info("[ListaMedia: "+media()+"]"+" Mais de 10 items na lista.");
        }
        if (listaInteiros.size() == 0) {
            throw new Exception("A lista vazia!");
        }
    }
}
