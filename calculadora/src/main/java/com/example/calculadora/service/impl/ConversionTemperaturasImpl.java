package com.example.calculadora.service.impl;

import com.example.calculadora.service.IConversionMedidasService;

import java.util.HashMap;
import java.util.Map;

public class ConversionTemperaturasImpl implements IConversionMedidasService {

    Map<String, Double> tiposDeTemperatura = new HashMap<>();

    @Override
    public double convertir(double valor, String medidaactual, String medidanueva) {

        String conversion=medidaactual+"->"+medidanueva;

        switch (conversion) {
            case "CEL->FAR":
                return (valor * (9.0 / 5.0) + 32);
            case "FAR->CEL":
                return (valor - 32) * (5.0/9.0) ;
            default:
                System.out.println("Tipo de conversión no disponible para: " + conversion);
                return 0;
        }
    }
}
