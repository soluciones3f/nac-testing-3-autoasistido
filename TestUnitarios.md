# Tests Unitarios

Más información en [link](http://groovy.codehaus.org/Unit+Testing) se puede ver


# Ejecución de los test

Siempre teniendo instalado ```groovy``` en nuestros equipos, podremos ejecutar (en el mismo directorio de nuestra clase de test)

```bash
groovy MiTest.groovy
```

# Ejemplos de tests

## Test básico


```groovy
import groovy.util.GroovyTestCase

class MiTest extends GroovyTestCase {
    void testDeAlgunaCosa() {
        assert 1 == 1
        assert 2 + 2 == 4 : "Hay un problema, las cuentas ya no funcionan!"
    }
}
```

## Testear una clase específica

### Creamos la clase

```groovy
class MiClase {
	double cuadrado(double d) {
		d * d
	}
}
```

### Creamos el test

```groovy
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
```
### Ejecutamos

```bash
groovy TestDeMiClase
```



