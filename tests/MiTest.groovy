import groovy.util.GroovyTestCase

class MiTest extends GroovyTestCase {
    void testDeAlgunaCosa() {
        assert 1 == 1
        assert 2 + 2 == 4 : "Hay un problema, las cuentas ya no funcionan!"
    }

    @Test void testDeOtraClase() {
    	def c = new Clase1()
    	def resultado = c.elMetodoDevuelveLaSumaDeSusParametros(1, 2)

    	assert resultado == 1 + 2
    }
}
