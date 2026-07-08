package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calculator.subtract(10, 6));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    public void testNotEquals() {
        assertNotEquals(15, calculator.add(5, 5));
    }

    @Test
    public void testNull() {
        String name = null;
        assertNull(name);
    }

    @Test
    public void testNotNull() {
        assertNotNull(calculator);
    }

    @Test
    public void testTrue() {
        assertTrue(10 > 5);
    }

    @Test
    public void testFalse() {
        assertFalse(5 > 10);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}