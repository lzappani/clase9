import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

class CalculadoraTest {
    Calculadora calc = new Calculadora();
    @Test
    void test1() {
        assertEquals(240, calc.multiplicar(80, 3));
    }

    @Test
    void test2() {
        assertEquals(110, calc.dividir(calc.sumar(150, 180), 3));
    }

    @Test
    void test3() {
        assertNotEquals(605, calc.multiplicar(calc.restar(90, 50), 15));
    }

    @Test
    void test4() {
        assertNotEquals(2700, calc.multiplicar(calc.sumar(70, 40), 25));
    }
}
