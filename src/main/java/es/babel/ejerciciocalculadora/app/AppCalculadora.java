package es.babel.ejerciciocalculadora.app;

import es.babel.ejerciciocalculadora.service.ICalculadoraService;
import es.babel.ejerciciocalculadora.service.IMostrarResultadoService;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AppCalculadora {
    private final IMostrarResultadoService mostrarResultadoService;

    public AppCalculadora(IMostrarResultadoService mostrarResultadoService) {
        this.mostrarResultadoService = mostrarResultadoService;
    }


    public String mostrarMenu(){
       return "Bienvenido a la calculadora, selecciona una operación: \n1. Sumar\n2. Restar\n3. Multiplicar \n4. Dividir \n5. Salir";
    }


    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println(mostrarMenu());

            continuar = switchOpcion(sc, continuar);

        } while(continuar);
    }

    private boolean switchOpcion(Scanner sc, boolean continuar) {
        int numero2;
        int numero1;
        try {
            int opcionEscogida = sc.nextInt();

            switch (opcionEscogida) {
                case 1:
                    mostrarResultadoService.mostrarSuma(sc);
                    break;
                case 2:
                    mostrarResultadoService.mostrarResta(sc);
                    break;

                case 3:
                   mostrarResultadoService.mostrarMultiplicacion(sc);
                    break;

                case 4:
                    mostrarResultadoService.mostrarDivision(sc);
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }
        } catch (Exception e) {
            System.out.println("Opción incorrecta");
            sc.nextLine();
        }
        return continuar;
    }
}
