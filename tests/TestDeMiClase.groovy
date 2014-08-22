import org.junit.Test
import org.junit.Before

class TestDeMiClase {
    def testee

    @Before void setUp() {
        testee = new MiClase()
    }

    @Test void cuadradoDe1() {
        assert testee.cuadrado(1) == 1	: "el cuadrado de 1 debe ser 1"
    }
}