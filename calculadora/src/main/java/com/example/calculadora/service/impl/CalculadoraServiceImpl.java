package com.example.calculadora.service.impl;

import com.example.calculadora.service.ICalculatorService;
import org.springframework.stereotype.Service;

//logica de negocio
@Service
public class CalculadoraServiceImpl implements ICalculatorService {


    @Override
    public int sumar(int number1, int number2) {
        return number1+number2;
    }

    @Override
    public int multiplicar(int number1, int number2) {
        return number1*number2;
    }

    @Override
    public int division(int number1, int number2) {
        return number1/number2;
    }

    @Override
    public long factorial(int number) {
        if (number == 0) {
            return 1;  // Caso base: 0! = 1
        } else {
            return number * factorial(number - 1);  // Llamada recursiva
        }
    }
}
