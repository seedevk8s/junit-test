package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest2 {
    Calculator calculator;

    @BeforeAll
    static void initAll() {

    }

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void succeedingTest() {
        assertEquals(calculator.add(0, 1), 1);
    }

    @Test
    void failingTest() {
        //fail("failing");
    }

    @Test
    @Disabled("skip")
    void skippedTest() {

    }

    @AfterEach
    void down() {

    }
}
