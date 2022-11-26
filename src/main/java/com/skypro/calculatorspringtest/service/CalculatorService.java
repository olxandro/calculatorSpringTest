package com.skypro.calculatorspringtest.service;

import com.skypro.calculatorspringtest.exceptions.CalculatorException;

public class CalculatorService {
    public Integer plus(Integer num1, Integer num2) throws CalculatorException {
        if (num1 == null || num2 == null) {
            throw new CalculatorException(" Не передан один из параметров!");
        }
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) throws CalculatorException {
        if (num1 == null || num2 == null) {
            throw new CalculatorException(" Не передан один из параметров!");
        }
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) throws CalculatorException {
        if (num1 == null || num2 == null) {
            throw new CalculatorException(" Не передан один из параметров!");
        }
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) throws CalculatorException {
        if (num1 == null || num2 == null) {
            throw new CalculatorException(" Не передан один из параметров!");
        } else if (num2 == 0) {
            throw new CalculatorException(" Делить на 0 нельзя, это знает каждый школьник!!!");
        }
        {

        }
        return num1 / num2;
    }
}
