import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProducaoTest {

    @Test
    void getRoupaComTamanho2() {
        Roupa roupa = ProducaoRoupas.getRoupa("Calça");
        roupa.setTamanho("XS");
        Roupa roupa1 = ProducaoRoupas.getRoupa("Blusa");
        roupa1.setTamanho("S");

        assertEquals(roupa.getTamanho(), "XS");
        assertEquals(roupa1.getTamanho(), "S");
        assertEquals(ProducaoRoupas.roupaFlyweight.size() == 2, true);


    }

    @Test
    void getTipoSetters() {
        Roupa roupa = ProducaoRoupas.getRoupa("Calça");
        roupa.setImportada(true);
        roupa.setTamanho("XS");
        roupa.seteNovo(false);

        assertEquals(roupa.isImportada(), true);
        assertEquals(roupa.iseNovo(), false);
        assertEquals(roupa.getTamanho(), "XS");
        assertEquals(roupa.getTipo(), "Calça");

    }

}