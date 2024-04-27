package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    Calculator calculator;
    
    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void testCalculator() {
        
        // Calculator -> add(10, 2) = 12 
        //assertEquals(12, 12);
        assertEquals(calculator.add(10, 2), 12);
        System.out.println("test O.K");
    }

    @Test
    void testCalculator2() {
        
        // Calculator -> add(10, 2) = 12 
        //assertEquals(12, 12);
        assertEquals(calculator.add(10, 3), 13);
        System.out.println("test O.K");
    }    
}
