package es.babel.ejerciciocalculadora.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public interface IMostrarService {
    void mostrarSuma(Scanner sc);

    void mostrarResta(Scanner sc);

    void mostrarMultiplicacion(Scanner sc);

    void mostrarDivision(Scanner sc);

    void mostrarMenu();

    void mostrarDespedida();

    void mostrarError();
}
