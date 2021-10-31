import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    Circulo circulo1, circulo2;

    @BeforeEach
    void doBefore() {
        circulo1 = new Circulo(2.0);
        circulo2 = new Circulo(6.0);
    }

    @Test
    void getPerimetroCirculo() {
        assertEquals(12.56, circulo1.calcular());
        assertEquals(37.68, circulo2.calcular());
    }


}