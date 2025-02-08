package com.example.calculadora.Controller;

import com.example.calculadora.service.ICalculatorService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController//indica  que es un api rest
@RequestMapping("/calculator")
public class CalculatorController {

    private final ICalculatorService calculatorService;

    public CalculatorController(ICalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }



    @GetMapping("/") //PARA LLAMAR ESTE METODO SE DEBE USAR UNA PETICION GET
    public void welcome(){
        System.out.println("Welcome to calculator");
    }
    @GetMapping("/welcome")
    public String welcomeReturn(){
        return "Hello world";
    }
    @GetMapping("/suma")
    public int sum(@RequestParam("numero1") int numero1, @RequestParam("numero2") int numero2){
        return  calculatorService.sumar(numero1,numero2);
    }

    @GetMapping("/division")
    public int division(@RequestParam("numero1") int numero1, @RequestParam("numero2") int numero2){
        return  calculatorService.division(numero1,numero2);
    }
    @GetMapping("/multiplicacion")
    public int multiplicacion(@RequestParam("numero1") int numero1, @RequestParam("numero2") int numero2){
        return  calculatorService.multiplicar(numero1,numero2);
    }

    @GetMapping("/factorial")
    public long factorial(@RequestParam("numero1") int numero){
        return  calculatorService.factorial(numero);
    }

    @GetMapping("/fechayhora")
    public String fechayhora(){
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        return   "Fecha y hora actual: " + fechaHoraActual;
    }

    @GetMapping("/{name}")
    public String Hello(@PathVariable String name){
        return "Hello "+name;
    }
    @GetMapping("/convertir_temperaturas")
    public String convertirTemperaturas(){
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        return   "Fecha y hora actual: " + fechaHoraActual;
    }


}
