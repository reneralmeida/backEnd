import java.util.HashMap;
import java.util.Map;

public class ProducaoRoupas {

    public static Map<String, Roupa > roupaFlyweight = new HashMap<>();

    public static Roupa getRoupa(String tipo, String tamanho, boolean importada, boolean eNovo) {
        String id = "Tipo: " + tipo + ", " + "Tamanho: " + tamanho + ", " + "Importada: " + "" + importada + ", " + "Nova: "  + eNovo;
        System.out.println(id);

        return roupaFlyweight.get(id);

    }

    public static Roupa getRoupa(String tipo) {
        Roupa roupa= roupaFlyweight.get(tipo);
        if(roupa == null) {
            roupa = new Roupa(tipo);
            roupaFlyweight.put(tipo, roupa);
        }
        return roupa;
    }
}
