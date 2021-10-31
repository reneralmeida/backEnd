import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    Quadrado quadrado1;

    @BeforeEach
    void doBefore() {
        quadrado1 = new Quadrado(2);
    }

    @Test
    void getPerimetroQuadrado() {
        assertEquals(8.0, quadrado1.calcular());
    }

}