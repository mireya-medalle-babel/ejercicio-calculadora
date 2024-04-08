package es.babel.ejerciciocalculadora;

import es.babel.ejerciciocalculadora.app.AppCalculadora;
import es.babel.ejerciciocalculadora.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EjercicioCalculadoraApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AppCalculadora appCalculadora = context.getBean(AppCalculadora.class);
        appCalculadora.run();
    }

    /*
    Crear una calculadora que muestre por pantalla el siguiente menú y en base a eso realice la operaciónseleccionada
    Bienvenido a la calculadora, selecciona una operación:
    Sumar
    Restar
    Multiplicar
    Dividir
    Salir
    Selecciona una operación:
    Una vez seleccionada te pedirá por pantalla el operando1 y luego el operando 2 y realizará la operaciónmostrando el resultado por pantalla
    Después volverá a mostrar el menú y quedará a la espera de la selección del usuario. Si pulsa la opción 5 el programa terminara.
     */
}
