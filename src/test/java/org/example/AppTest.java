package org.example;

import org.junit.jupiter.api.Test;

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
}
