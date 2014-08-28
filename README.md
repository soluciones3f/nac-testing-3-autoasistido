# Módulo 3 - Autoasistidos

[![Build Status](https://travis-ci.org/soluciones3f/nac-testing-3-autoasistido.svg?branch=master)](https://travis-ci.org/soluciones3f/nac-testing-3-autoasistido)

Proyecto para "jugar" con github en el marco de la capacitación de testing, módulo 3



## Clonar el repo

```bash
$ git clone git@github.com:soluciones3f/nac-testing-3-autoasistido.git
Cloning into 'nac-testing-3-autoasistido'...
remote: Counting objects: 7, done.
remote: Compressing objects: 100% (7/7), done.
remote: Total 7 (delta 0), reused 0 (delta 0)
Receiving objects: 100% (7/7), 4.55 KiB | 0 bytes/s, done.
Checking connectivity... done.
```

## Pull de los cambios
````bash
$ git pull
remote: Counting objects: 3, done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0)
Unpacking objects: 100% (3/3), done.
From github.com:soluciones3f/nac-testing-3-autoasistido
   eff36ab..12433bc  master     -> origin/master
Updating eff36ab..12433bc
Fast-forward
 README.md | 9 +++++++++
 1 file changed, 9 insertions(+)
```

## Agregar cambios para resguardar

```bash
$ git add TestUnitarios.md 
$ git add tests/MiClase.groovy 
$ git add tests/MiTest.groovy 
$ git add tests/TestDeMiClase.groovy 
```

## Revisar cambios a resguardar

```bash
$ git status
On branch master
Your branch is up-to-date with 'origin/master'.

Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

	new file:   TestUnitarios.md
	new file:   tests/MiClase.groovy
	new file:   tests/MiTest.groovy
	new file:   tests/TestDeMiClase.groovy
```

## Commit de los cambios

```bash
$ git commit -m "Creación de los test unitarios"
[master 255a79a] Creación de los test unitarios
 4 files changed, 101 insertions(+)
 create mode 100644 TestUnitarios.md
 create mode 100644 tests/MiClase.groovy
 create mode 100644 tests/MiTest.groovy
 create mode 100644 tests/TestDeMiClase.groovy
```

## Subir los cambios al servidor

```bash
$ git push
Counting objects: 7, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (7/7), done.
Writing objects: 100% (7/7), 1.44 KiB | 0 bytes/s, done.
Total 7 (delta 0), reused 0 (delta 0)
To git@github.com:soluciones3f/nac-testing-3-autoasistido.git
   54890e3..255a79a  master -> master
```





