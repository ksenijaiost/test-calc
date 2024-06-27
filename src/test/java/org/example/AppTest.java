package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;

public class AppTest {
    private final Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        int result = calc.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(1, 2);
        assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        int result = calc.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        int result = calc.divide(6, 3);
        assertEquals(2, result);
    }

    @ParameterizedTest
    @CsvSource({
            "2,  3,  5",
            "10, 10, 20",
            "-5, -3, -8",
            "2,  3,  5"
    })
    public void testAddParams(int a, int b, int expected) {
        int result = calc.add(a, b);
        assertEquals(expected, result);
    }
}
