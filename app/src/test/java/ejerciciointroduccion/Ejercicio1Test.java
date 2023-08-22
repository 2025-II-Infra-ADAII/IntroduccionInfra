package ejerciciointroduccion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
  @Test
  void testPromedioPonderadoCaso1() {
    double notas[] = {3.5,2.5,5.0,2.8,3.9};
    int creditos[] = {2,4,5,3,2};
    Ejercicio1 ejercicio1 = new Ejercicio1();
    assertEquals(3.64, ejercicio1.promedioPonderado(notas, creditos));
  }

  @Test
  void testPromedioPonderadoCaso2() {
    double notas[] = {3.9,2.4,5.0,2.8,3.9};
    int creditos[] = {2,4,5,3,5};
    Ejercicio1 ejercicio1 = new Ejercicio1();
    assertEquals(3.7, ejercicio1.promedioPonderado(notas, creditos));
  }

  @Test
  void testPromedioPonderadoCaso3() {
    double notas[] = {3.9,2.4,5.0,2.8,3.9,4.3,4.6};
    int creditos[] = {2,4,5,3,5,4,4};
    Ejercicio1 ejercicio1 = new Ejercicio1();
    assertEquals(3.92, ejercicio1.promedioPonderado(notas, creditos));
  }
}
