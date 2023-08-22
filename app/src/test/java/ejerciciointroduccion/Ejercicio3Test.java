package ejerciciointroduccion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
  @Test
  void testMultiplicarMatricesCaso1() {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    int[][] A = {{1,2,3},{4,5,6}};
    int[][] B = {{7,8},{9,10},{11,12}};
    int[][] C = ejercicio3.multiplicarMatrices(A, B);
    int[][] esperado = {{58,64},{139,154}};
    assertArrayEquals(esperado,C);
  }

  @Test
  void testMultiplicarMatricesCaso2() {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    int[][] A = {{1,2,3},{4,5,6}};
    int[][] B = {{7,8},{9,10},{11,12}};
    int[][] C = ejercicio3.multiplicarMatrices(A, B);
    int[][] esperado = {{58,64},{139,154}};
    assertArrayEquals(esperado,C);
  }

  @Test
  void testMultiplicarMatricesCaso3() {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    int[][] A = {{1,2},{3,4}};
    int[][] B = {{5,6},{7,8}};
    int[][] C = ejercicio3.multiplicarMatrices(A, B);
    int[][] esperado = {{19,22},{43,50}};
    assertArrayEquals(esperado,C);
  }

  @Test
  void testMultiplicarMatricesCaso4() {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    int[][] A = {{1,2},{3,4}};
    int[][] B = {{5,6,7},{8,9,10}};
    int[][] C = ejercicio3.multiplicarMatrices(A, B);
    int[][] esperado = {{21,24,27},{47,54,61}};
    assertArrayEquals(esperado,C);
  }

  @Test
  void testMultiplicarMatricesFalla() {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    int[][] A = {{1,2},{3,4}};
    int[][] B = {{5,6},{7,8},{9,10}};
    assertThrows(RuntimeException.class, () -> {
      int[][] C = ejercicio3.multiplicarMatrices(A, B);
    });
  }
}
