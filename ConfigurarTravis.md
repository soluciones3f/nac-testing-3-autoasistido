# Travis

## Crear el proyecto

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