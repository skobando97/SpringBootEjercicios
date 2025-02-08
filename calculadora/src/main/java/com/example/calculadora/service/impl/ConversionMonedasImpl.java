package com.example.calculadora.service.impl;

import com.example.calculadora.service.IConversionMedidasService;

import java.util.HashMap;
import java.util.Map;

public class ConversionMonedasImpl implements IConversionMedidasService {
    Map<String, Double> tiposDeCambio = new HashMap<>();

    @Override
    public double convertir(double valor, String medidaactual, String medidanueva) {
        tiposDeCambio.put("USD->COP", 3800.0);
        tiposDeCambio.put("COP->USD", 0.94);
        String conversion=medidaactual+"->"+medidanueva;

        if (tiposDeCambio.containsKey(conversion)) {
            return valor * tiposDeCambio.get(conversion);
        } else {
            System.out.println("Tipo de cambio no disponible para : " + conversion);
            return 0;
        }
    }
}
