# Taller introductorio algoritmos

## Ejercicio 1

En la clase Ejercicio1 modificar la función obtenerPromedioPoderado la cual recibe dos arreglos, el primero que es de enteros tiene la nota, la cual va entre 0.0 y 5.0, el segundo que es tiene el número de creditos. Para calcular el promedio ponderado se multiplica la nota por su credito correspondiente y se divide por la suma de creditos, ejemplo

El promedio ponderado debe quedar redondeado a dos decimales

```java
double notas[] = {3.5,2.5,5.0,2.8,3.9}
int creditos[] = {2,4,5,3,2}

Ejercicio1 objEjercicio1 = new Ejercicio1();
objEjercicio1.obtenerPromedioPoderado(notas,creditos)
//La operación que realiza es (3.5*2+2.5*4+5.0*5+2.8*3+3.9*2)/16 
//Debe retornar 3.64
```

## Ejercicio 2

En la clase Ejercicio2, la función listaFactoriales, recibe un número entero n y retorna un arreglo de long el cual tiene los factoriales desde 0 hasta n. Usar la función privada factorial desarrollada por el docente

```java

Ejercicio2 objEjercicio2 = new Ejercicio2();
objEjercicio1.listaFactoriales(5)
//Debe retornar [1,1,2,6,24,120]
```
## Ejercicio 3

En la clase Ejercicio3, desarrollar la función multiplicarMatrices, la cual recibe dos arreglos bidimensionales de enteros nxm y mxl, retornando una matriz de tamaño nxl el cual es la multiplicación de ambos. En caso de que las dimensiones sean incompatibles (columnas de a diferentes que las filas de b) debe retornarse una excepción 

```java
Ejercicio3 objEjercicio3 = new Ejercicio2();
int a[][] = {{2,3},{4,2}};
int b[][] = {{1,3,4},{2,6,9}}
objEjercicio3.multiplicarMatrices(a,b)
//Debe retornar
//  {{8,24,35},{8,24,34}}
```


