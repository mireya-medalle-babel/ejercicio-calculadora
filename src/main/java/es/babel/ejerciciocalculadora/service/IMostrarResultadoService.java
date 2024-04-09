package es.babel.ejerciciocalculadora.service;

import java.util.Scanner;

public interface IMostrarResultadoService {
    public default void mostrarSuma(Scanner sc) {}

    public default void mostrarResta(Scanner sc) {}

    default void mostrarMultiplicacion(Scanner sc) {}

    default void mostrarDivision(Scanner sc) {}

}
