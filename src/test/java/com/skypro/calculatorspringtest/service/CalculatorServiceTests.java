package com.skypro.calculatorspringtest.service;

import com.skypro.calculatorspringtest.exceptions.CalculatorException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.skypro.calculatorspringtest.parameters.CalculatorServiceTestsConstants.*;

public class CalculatorServiceTests {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plus() throws CalculatorException {
        Integer expected = NUM1 + NUM2;
        Integer actual = calculatorService.plus(NUM1, NUM2);
        Assertions.assertEquals(expected, actual);
        expected = NUM3 + NUM4;
        actual = calculatorService.plus(NUM3, NUM4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minus() throws CalculatorException {
        Integer expected = NUM1 - NUM2;
        Integer actual = calculatorService.minus(NUM1, NUM2);
        Assertions.assertEquals(expected, actual);
        expected = NUM3 - NUM4;
        actual = calculatorService.minus(NUM3, NUM4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiply() throws CalculatorException {
        Integer expected = NUM1 * NUM2;
        Integer actual = calculatorService.multiply(NUM1, NUM2);
        Assertions.assertEquals(expected, actual);
        expected = NUM3 * NUM4;
        actual = calculatorService.multiply(NUM3, NUM4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide() throws CalculatorException {
        Integer expected = NUM1 / NUM2;
        Integer actual = calculatorService.divide(NUM1, NUM2);
        Assertions.assertEquals(expected, actual);
        expected = NUM3 / NUM4;
        actual = calculatorService.divide(NUM3, NUM4);
        Assertions.assertEquals(expected, actual);
        Assertions.assertThrows(CalculatorException.class, () -> calculatorService.divide(NUM1, NUM0));
    }
}
