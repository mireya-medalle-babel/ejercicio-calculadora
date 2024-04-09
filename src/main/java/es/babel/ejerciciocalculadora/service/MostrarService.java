package es.babel.ejerciciocalculadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class MostrarService implements IMostrarService {
    private final ICalculadoraService calculadoraService;
    private final IInputUsuarioService inputUsuarioService;

    public MostrarService(ICalculadoraService calculadoraService, IInputUsuarioService inputUsuarioService) {
        this.calculadoraService = calculadoraService;
        this.inputUsuarioService = inputUsuarioService;
    }

    public void mostrarSuma(Scanner sc) {
        int numero2;
        int numero1;

        System.out.println("Introduzca primer número");
        numero1 = inputUsuarioService.introducirNumero(sc);
        System.out.println("Introduzca segundo número");
        numero2 = inputUsuarioService.introducirNumero(sc);
        System.out.println(calculadoraService.sumar(numero1, numero2));
    }

    public void mostrarResta(Scanner sc) {
        int numero2;
        int numero1;

        System.out.println("Introduzca primer número");
        numero1 = inputUsuarioService.introducirNumero(sc);
        System.out.println("Introduzca número que desea restarle");
        numero2 = inputUsuarioService.introducirNumero(sc);
        System.out.println(calculadoraService.restar(numero1, numero2));
    }

    public void mostrarMultiplicacion(Scanner sc) {
        int numero2;
        int numero1;

        System.out.println("Introduzca primer número");
        numero1 = inputUsuarioService.introducirNumero(sc);
        System.out.println("Introduzca segundo número");
        numero2 = inputUsuarioService.introducirNumero(sc);
        System.out.println(calculadoraService.multiplicar(numero1, numero2));
    }

    public void mostrarDivision(Scanner sc) {
        int numero2;
        int numero1;

        System.out.println("Introduzca dividendo");
        numero1 = inputUsuarioService.introducirNumero(sc);
        System.out.println("Introduzca divisor");
        numero2 = inputUsuarioService.introducirNumero(sc);
        System.out.println(calculadoraService.dividir(numero1, numero2));
    }

    public void mostrarMenu(){
        System.out.println("Bienvenido a la calculadora, selecciona una operación: \n1. Sumar\n2. Restar\n3. Multiplicar \n4. Dividir \n5. Salir");
    }

    public void mostrarDespedida() {
        System.out.println("Hasta luego!");
    }

    public void mostrarError() {
        System.out.println("Error! Valor incorrecto");
    }

}
