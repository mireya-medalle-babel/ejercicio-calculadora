package es.babel.ejerciciocalculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService implements ICalculadoraService {
    public int sumar(int numero1, int numero2) {
        return numero1+numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1-numero2;
    }

    public int multiplicar (int numero1, int numero2) {
        return numero1*numero2;
    }

    public double dividir (int dividendo, int divisor) {
        if (divisor != 0) {
            return (double) dividendo /divisor;
        } else {
            System.out.println("No se puede dividir por 0");
            return divisor;
        }
    }


}
