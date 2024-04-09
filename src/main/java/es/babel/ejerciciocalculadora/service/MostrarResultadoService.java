package es.babel.ejerciciocalculadora.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class MostrarResultadoService implements  IMostrarResultadoService {
    private final ICalculadoraService calculadoraService;

    public MostrarResultadoService(ICalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }
    public void mostrarSuma(Scanner sc) {
        int numero2;
        int numero1;
        try {
            System.out.println("Introduzca primer número");
            numero1 = sc.nextInt();
            System.out.println("Introduzca segundo número");
            numero2 = sc.nextInt();
            System.out.println(calculadoraService.sumar(numero1, numero2));
        } catch (Exception e){
            System.out.println("ERROR. Introduzca valor numérico");
        }
    }

    public void mostrarResta(Scanner sc) {
        int numero2;
        int numero1;
        try {
            System.out.println("Introduzca primer número");
            numero1 = sc.nextInt();
            System.out.println("Introduzca número que desea restarle");
            numero2 = sc.nextInt();
            System.out.println(calculadoraService.restar(numero1, numero2));
        } catch (Exception e){
            System.out.println("ERROR. Introduzca valor numérico");
        }
    }

    public void mostrarMultiplicacion(Scanner sc) {
        int numero2;
        int numero1;
        try {
            System.out.println("Introduzca primer número");
            numero1 = sc.nextInt();
            System.out.println("Introduzca segundo número");
            numero2 = sc.nextInt();
            System.out.println(calculadoraService.multiplicar(numero1, numero2));
        } catch (Exception e){
            System.out.println("ERROR. Introduzca valor numérico");
        }

    }

    public void mostrarDivision(Scanner sc) {
        int numero2;
        int numero1;
        try {
            System.out.println("Introduzca dividendo");
            numero1 = sc.nextInt();
            System.out.println("Introduzca divisor");
            numero2 = sc.nextInt();
            System.out.println(calculadoraService.dividir(numero1, numero2));
        } catch (Exception e){
            System.out.println("ERROR. Introduzca valor numérico");
        }

    }

}
