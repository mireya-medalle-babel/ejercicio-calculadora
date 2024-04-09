package es.babel.ejerciciocalculadora.app;

import es.babel.ejerciciocalculadora.service.IMostrarService;
import es.babel.ejerciciocalculadora.service.InputUsuarioService;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AppCalculadora {
    private final IMostrarService mostrarService;
    private final InputUsuarioService inputUsuarioService;

    public AppCalculadora(IMostrarService mostrarService, InputUsuarioService inputUsuarioService) {
        this.mostrarService = mostrarService;
        this.inputUsuarioService = inputUsuarioService;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            mostrarService.mostrarMenu();
            try {
                int operacionEscogida = inputUsuarioService.operacionEscogida(sc);
                switch (operacionEscogida) {
                    case 1:
                        mostrarService.mostrarSuma(sc);
                        break;
                    case 2:
                        mostrarService.mostrarResta(sc);
                        break;

                    case 3:
                        mostrarService.mostrarMultiplicacion(sc);
                        break;

                    case 4:
                        mostrarService.mostrarDivision(sc);
                        break;

                    case 5:
                        continuar = false;
                        mostrarService.mostrarDespedida();
                        break;

                    default:
                        mostrarService.mostrarError();
                }
            } catch (Exception e) {
                mostrarService.mostrarError();
                sc.nextLine();
            }
        } while(continuar);
    }
}
