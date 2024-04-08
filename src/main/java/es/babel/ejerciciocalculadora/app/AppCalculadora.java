package es.babel.ejerciciocalculadora.app;

import es.babel.ejerciciocalculadora.service.ICalculadoraService;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AppCalculadora {
    final
    ICalculadoraService calculadoraService;

    public AppCalculadora(ICalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    public String mostrarMenu(){
       return "Bienvenido a la calculadora, selecciona una operación: \n1. Sumar\n2. Restar\n3. Multiplicar \n4. Dividir \n5. Salir";
    }


    public void run() {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        boolean continuar = true;

        do {
            System.out.println(mostrarMenu());

            int opcionEscogida = sc.nextInt();

            switch (opcionEscogida) {
                case 1:
                    try {
                        System.out.println("Introduzca primer número");
                        numero1 = sc.nextInt();
                        System.out.println("Introduzca segundo número");
                        numero2 = sc.nextInt();
                        System.out.println(calculadoraService.sumar(numero1, numero2));
                    } catch (Exception e){
                        System.out.println("ERROR. Introduzca valor numérico");
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Introduzca primer número");
                        numero1 = sc.nextInt();
                        System.out.println("Introduzca número que desea restarle");
                        numero2 = sc.nextInt();
                        System.out.println(calculadoraService.restar(numero1, numero2));
                    } catch (Exception e){
                        System.out.println("ERROR. Introduzca valor numérico");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Introduzca primer número");
                        numero1 = sc.nextInt();
                        System.out.println("Introduzca segundo número");
                        numero2 = sc.nextInt();
                        System.out.println(calculadoraService.multiplicar(numero1, numero2));
                    } catch (Exception e){
                        System.out.println("ERROR. Introduzca valor numérico");
                    }
                    break;

                case 4: try {
                    System.out.println("Introduzca dividendo");
                    numero1 = sc.nextInt();
                    System.out.println("Introduzca divisor");
                    numero2 = sc.nextInt();
                    System.out.println(calculadoraService.dividir(numero1, numero2));
                } catch (Exception e){
                    System.out.println("ERROR. Introduzca valor numérico");
                }
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        } while(continuar);


    }
}
