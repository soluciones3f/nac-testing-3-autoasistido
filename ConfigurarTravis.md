# Travis

## Configurar el proyecto

El archivo ```.travis.yml``` contendrá la información de configuración usada por el travis. A saber:

```
language: groovy
```

## Configurar Gradle

Gradle simplifica la configuración de la ejecución de test.

```groovy
apply plugin: 'groovy'

repositories {
    mavenCentral()
}

dependencies {
    compile 'org.codehaus.groovy:groovy-all:2.3.3'
    testCompile 'junit:junit:4.11'
}
```

## Test para error

```groovy
import groovy.util.GroovyTestCase
class MiTest extends GroovyTestCase {
    void testDeAlgunaCosa() {
        assert 1 == 1
        assert 2 + 2 == 5 : "Hay un problema, las cuentas ya no funcionan!"
    }
}
```
