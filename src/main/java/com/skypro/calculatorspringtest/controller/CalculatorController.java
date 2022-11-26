package com.skypro.calculatorspringtest.controller;

import com.skypro.calculatorspringtest.exceptions.CalculatorException;
import com.skypro.calculatorspringtest.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    CalculatorService calculatorService = new CalculatorService();

    @GetMapping("")
    public String Hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, Integer num2) throws CalculatorException {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, Integer num2) throws CalculatorException {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, Integer num2) throws CalculatorException {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, Integer num2) throws CalculatorException {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
