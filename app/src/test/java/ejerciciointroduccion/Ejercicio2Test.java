package ejerciciointroduccion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
  @Test
  void testListaFactorialesCaso1() {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    long[] salida = ejercicio2.listaFactoriales(5);
    long[] esperado = {1,1,2,6,24,120};
    assertArrayEquals(esperado,salida);
  }

  @Test
  void testListaFactorialesCaso2() {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    long[] salida = ejercicio2.listaFactoriales(10);
    long[] esperado = {1,1,2,6,24,120,720,5040,40320,362880,3628800};
    assertArrayEquals(esperado,salida);
  }

  @Test
  void testListaFactorialesCaso3() {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    long[] salida = ejercicio2.listaFactoriales(0);
    long[] esperado = {1};
    assertArrayEquals(esperado,salida);
  }

  @Test
  void testListaFactorialesCaso4() {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    long[] salida = ejercicio2.listaFactoriales(1);
    long[] esperado = {1,1};
    assertArrayEquals(esperado,salida);
  }

  @Test
  void testListaFactorialesCaso5() {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    long[] salida = ejercicio2.listaFactoriales(2);
    long[] esperado = {1,1,2};
    assertArrayEquals(esperado,salida);
  }
}
