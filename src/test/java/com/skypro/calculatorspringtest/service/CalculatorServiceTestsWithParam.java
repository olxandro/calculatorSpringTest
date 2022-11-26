package com.skypro.calculatorspringtest.service;

import com.skypro.calculatorspringtest.exceptions.CalculatorException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.skypro.calculatorspringtest.parameters.CalculatorServiceTestsConstants.*;

class CalculatorServiceTestsWithParam {

    CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void divide(Integer num1, Integer num2, Integer expected) throws CalculatorException {
        Integer actual = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, REZ1),
                Arguments.of(NUM3, NUM2, REZ2),
                Arguments.of(NUM3, NUM4, REZ3)
        );
    }
}