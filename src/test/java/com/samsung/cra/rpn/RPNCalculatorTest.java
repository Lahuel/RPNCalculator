package com.samsung.cra.rpn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RPNCalculatorTest {
    @Test
    public void simpleCalculationTest() {
        RPNCalculator calculator = new RPNCalculator();
        assertEquals(3, calculator.calculate("1 2 +"));
    }
}
