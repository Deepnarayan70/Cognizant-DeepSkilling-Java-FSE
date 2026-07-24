package com.cognizant;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AAATest {

    private Calculator calculator;

    // Setup Method
    @BeforeEach
    void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator();
    }

    // Teardown Method
    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up...");
    }

    @Test
    void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }
}