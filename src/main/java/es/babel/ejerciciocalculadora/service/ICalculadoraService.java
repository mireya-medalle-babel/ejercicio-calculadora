package es.babel.ejerciciocalculadora.service;

import org.springframework.stereotype.Service;

@Service
public interface ICalculadoraService {
    int sumar(int a, int b);
    int restar(int a, int b);
    int multiplicar(int a, int b);
    double dividir(int a, int b);
}
