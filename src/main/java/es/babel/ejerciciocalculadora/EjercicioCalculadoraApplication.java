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
}
