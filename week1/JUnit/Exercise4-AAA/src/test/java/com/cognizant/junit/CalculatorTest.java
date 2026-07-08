package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdditionUsingAAA() {

        // Arrange
        Calculator calculator = new Calculator();
        int a = 20;
        int b = 10;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    void testSubtractionUsingAAA() {

        // Arrange
        Calculator calculator = new Calculator();
        int a = 25;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(20, result);
    }

    @Test
    void testMultiplicationUsingAAA() {

        // Arrange
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(40, result);
    }

    @Test
    void testDivisionUsingAAA() {

        // Arrange
        Calculator calculator = new Calculator();
        int a = 40;
        int b = 5;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(8, result);
    }
}